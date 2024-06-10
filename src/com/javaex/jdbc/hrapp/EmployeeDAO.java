package com.javaex.jdbc.hrapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAO {

	private Connection getConnect () throws SQLException {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			
			conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
			
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver를 찾을 수 없습니다..ㅠㅠ");
		}
		
		return conn;
	}
	
	public List <EmployeeVO> getSal (int min, int max){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO vo = null;
		List<EmployeeVO> voList = new ArrayList<EmployeeVO>();
		
		try {
			conn = getConnect();

			String sql = "select first_name || ' ' || last_name name, salary"
					+ " from employees where salary between ? and ? order by salary";
			
			pstmt = conn.prepareStatement(sql);
			
			//	동적 파라미터 바인딩
			pstmt.setInt(1, min);
			pstmt.setInt(2, max);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString(1);
				Integer salary = rs.getInt(2);
				vo = new EmployeeVO(name, salary);
				voList.add(vo);
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		
		return voList;
	}
	
	public List<EmployeeVO> getEmp(String str) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO vo = null;
		List<EmployeeVO> voList = new ArrayList<EmployeeVO>();
		
		try {
			conn = getConnect();
			String upperStr = str.toUpperCase();
					
			String sql = "select first_name || ' ' || last_name, "
					+ "email, phone_number, hire_date hd"
					+ " from employees "
					+ "where upper(first_name) like ?"
							+ "or upper(last_name) like ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "%" + upperStr + "%");
			pstmt.setString(2, "%" + upperStr + "%");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String ph = rs.getString(3);
				Date hd = rs.getDate(4);
				vo = new EmployeeVO(name, email, ph, hd);
				voList.add(vo);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		
		return voList;
	}
}
