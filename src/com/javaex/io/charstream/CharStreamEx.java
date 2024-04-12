package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	private static String filename = rootPath + "char.txt";
	
	public static void main(String[] args) {
		
		//	FileWriter
		writeFile();
		
		//	FileReader
		readFile();
	}

	private static void readFile() {
		System.out.println("파일염: " + filename);
		
		//	스트림 열기
		try (Reader reader = new FileReader(filename)) {
			
			//	읽어들일 데이터 저장 변수
			int data = 0;
			String message = "";
			
			//	2바이트(char) 읽어서 -> 정수형으로 변환
			while ((data = reader.read()) != -1) {	//	-1이면 더 읽을 수 없음
				message += (char)data;
				System.out.println("읽어들인 데이터: " + (char)data);
			}
			System.out.println(message);
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	private static void writeFile() {
		//	FileWriter 을 이용해서 text 파일 생성
		System.out.println("파일명: " + filename);
		
		//	스트림 열기
		try (Writer writer = new FileWriter(filename)) {
		//	텍스트 기록	
			writer.write("안녕하세요\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2024.04\r\n");
			writer.flush();		//	내부 버퍼 비우기
			writer.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

}
