package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String sburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr"; 
		
		//	Connection, Statement, ResultSet
		//	try - with - resources 문 (자원 자동 정리)
		//	AutoCloseable 인터페이스를 구현한 클래스들을 사용가능하다..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		ResultSet rs = null;
		
		try(
			Connection conn = DriverManager.getConnection(sburl, dbuser, dbpass);
			Statement stmt = conn.createStatement();
		) {
			String sql = "SELECT department_id, department_name"
					+ " FROM departments";
			
			rs = stmt.executeQuery(sql);	//	DB CURSOR 반환
			
			//	ResultSet 순회
			while (rs.next()) {
				//	getXXX(컬럼 순서) or getXXX(컬럼 프로젝션 이름)
				int deptId = rs.getInt(1);	//	rs.getInt("department_id")
				String deptName = rs.getString("department_name");	//	rs.getString(2)
				
				System.out.printf("%d:%s%n", deptId, deptName);
			}
		} catch (SQLException e) {
			System.err.println("SQL error");
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
