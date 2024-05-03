package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//	접속 테스트
public class ConnectionTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr"; 
		
		Connection conn = null;
		
		try {
			//	드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//	접속 문자열, 계정 비밀번호를 이용, 데이터베이스 접속 시도
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			//	데이터베이스 접속 성공
			System.out.println(conn);
			System.out.println("연결 성공..?");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM user_INDEXes");
			
			System.out.println(rs.toString());
		
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				
			}
			
		}
		
	}
	
}
