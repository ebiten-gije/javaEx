package com.javaex.network.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//v.2 클라이언트로부터 메시지 전달 -> Echo Back
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
			
			//	클라이언트로부터 데이터 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//	Echo Back 을 위한 OS 열기
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//	클라이언트로부터 메세지를 읽기
			String msg;
			while (true) {
				msg = br.readLine();	//	줄 단위 입력
				if (msg == null) {		//	읽을 데이터가 없다
					System.out.println("접속 종료되었습니다");
					break;
				}
				System.out.println("받은 메시지: " + msg);
			
				//	EchoBack
				System.out.println("Echo Back: " + msg);
				bw.write("[Echo]: " + msg);
				bw.newLine();	//	개행
				bw.flush();
			}
			
			bw.close();
			br.close();
			
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
