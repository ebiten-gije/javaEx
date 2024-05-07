package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		
		String sbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "hr";
		String dbPw = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		ResultSet rs = null;
		
		try {
			Connection conn = DriverManager.getConnection(sbUrl, dbId, dbPw);
			Statement stmt = conn.createStatement();
			
			String sql = "select emp.first_name, emp.last_name,"
					+ " man.first_name from employees emp "
					+ "join employees man on emp.manager_id = man.employee_id"
					+ " order by emp.first_name desc";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String fn = rs.getString(1);
				String ln = rs.getString(2);
				String mn = rs.getString(3);
				
				System.out.printf("name: %s %s,	manager: %s %n", fn, ln, mn);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
