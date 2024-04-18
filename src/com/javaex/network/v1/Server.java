package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//	v.1 접속 대기
public class Server {

	public static void main(String[] args) {
		//	서버 소켓 생성
		ServerSocket servSocket = null;
		
		try {
			//	IP 와 포트에 연결 (bind)
			servSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			
			servSocket.bind(local);
			System.out.println("<서버가 시작되었습니다.>");
			System.out.println("<연결을 기다립니다.>");
			
			//	연결 대기
			Socket socket = servSocket.accept();
			
			//	클라이언트 접속시의 처리
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("!클라이언트가 연결되었습니다.");
			System.out.println(socketAddress.getAddress() + ": " + socketAddress.getPort());
			
			//	후처리
			System.out.println("---------------");
			System.out.println("서버 종료");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//	시스템 자원 해제
			try {
				servSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
