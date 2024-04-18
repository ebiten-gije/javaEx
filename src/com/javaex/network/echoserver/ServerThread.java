package com.javaex.network.echoserver;

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
import java.net.Socket;

//	Server.java 로부터 통신용 Socket
public class ServerThread extends Thread {
	
	private Socket socket;
	private String clientInfo;
	
	public ServerThread (Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		//	클라이언트 접속 시의 처리 로직
		try {
			//	클라이언트 IP, 포트 확인
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			clientInfo = socketAddress.getAddress() + ": " + socketAddress.getPort();
		
			System.out.println("클라이언드 " + clientInfo + "가 연결되었습니다.");
		
			//	클라이언트로부터 메세지 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//	EchoBack 위한 스트림
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
		
			//	message EchoBack
			String msg;
			while (true) {
				msg = br.readLine();	//	줄 단위 입력
				if (msg == null) {		//	읽을 데이터가 없다
					System.out.println(clientInfo + "접속 종료되었습니다");
					break;
				}
				System.out.println(clientInfo + ": " + msg);
		
				//	EchoBack
				System.out.println("Echoback to " + clientInfo + ": " + msg);
				bw.write("[Echo]: " + msg);
				bw.newLine();	//	개행
				bw.flush();
			}	
		
			bw.close();
			br.close();
		
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			//	시스템 자원 해제
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		
	}
	
	
}
