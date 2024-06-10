package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSalaryPstmt {

	public static void main(String[] args) {
		String Url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner (System.in);
		
		try {
			conn = DriverManager.getConnection(Url, id, pw);
			
			System.out.println(" 숫 자 입 력 ");
			String sal = sc.nextLine();
			String[] splSal = sal.split(" ");			
			
			
			
			System.out.println("============================================");
			
			//	실행 계획 수립
			String sql = "select first_name || ' ' || last_name name, salary"
					+ " from employees where salary >= ? and salary <= ? order by salary";
			
			pstmt = conn.prepareStatement(sql);
			
			//	동적 파라미터 바인딩
			pstmt.setString(1, splSal[0]);
			pstmt.setString(2, splSal[1]);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				
				System.out.printf("%-20s%d%n", name, salary);

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				rs.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
