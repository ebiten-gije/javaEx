package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSalary {

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
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner (System.in);
		
		try {
			conn = DriverManager.getConnection(Url, id, pw);
			stmt = conn.createStatement();
			
			System.out.println(" 숫 자 입 력 ");
			String sal = sc.nextLine();
			String [] splSal = sal.split(" ");
			
			System.out.println("============================================");
			
			String sql = "select first_name || ' ' || last_name name, salary"
					+ " from employees where salary >= ";
			
			rs = stmt.executeQuery(sql + splSal[0] + " and salary <= "
					 + splSal[1] + " order by salary");
			
			while(rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				
				System.out.printf("%-20s%d%n", name, salary);
//				System.out.println(name + "\t\t" + salary);
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
