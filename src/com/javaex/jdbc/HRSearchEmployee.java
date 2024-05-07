package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class HRSearchEmployee {

	public static void main(String[] args) {
		
		String sbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;		
		Scanner sc = new Scanner(System.in);
		
		try {
			conn = DriverManager.getConnection(sbUrl, id, pw);
			stmt = conn.createStatement();
			
			System.out.println("검색할 내용을 입력");
			
			String ins = sc.next();
			
			String upperIns = ins.toUpperCase();
			
			rs = stmt.executeQuery("select first_name || ' ' || last_name, "
					+ "email, phone_number, hire_date hd"
					+ " from employees "
					+ "where upper(first_name) like '%" + upperIns +"%'"
							+ "or upper(last_name) like '%" + upperIns + "%'");
			
			while (rs.next()) {
				String nm = rs.getString(1);
				String em = rs.getString("email");
				String ph = rs.getString(3);
				Date hd = rs.getDate("hd");
				
				System.out.printf("%s %s %s %s%n", nm, em, ph, hd);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				rs.close();
				sc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
