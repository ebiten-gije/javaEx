package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		//	입력 소스
		byte [] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//	출력 타겟
		byte [] outSrc = null;
		
		System.out.println("입력소스: " + Arrays.toString(inSrc));
		
		InputStream input = null;
		OutputStream output = null;
		
//		try {
		//	입력 스트림과 출력 스트림 열기
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;	//	입력 스트림으로부터 넘어올 데이터 저장 변수
		
		//	try - with - resource
		try {
			while ((data = input.read()) != -1) {	//	-1 이면 더이상 읽을 데이터가 없음
				System.out.println("read data: " + data);
				output.write(data);
			}
			outSrc = ((ByteArrayOutputStream)output).toByteArray();
		
			System.out.println(Arrays.toString(inSrc));
			System.out.println(Arrays.toString(outSrc));
			
		} catch (IOException e) {	//	IOException 처리
			e.printStackTrace();
		} catch (Exception e) {		//	혹시 남아있을 예외 처리
			e.printStackTrace();
		} finally {
			try {
				input.close();
				output.close();
			} catch (Exception e){
				
			}
			
		}
		
		//	AutoCloseable 을 활용한 예외처리: try - with - resource
		try(	//	자원 해제를 필요로 하는 객체를 초기화
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();	
				) {
			int data1 = 0;	//	입력 스트림으로부터 입력된 데이터 저장할 변수
			
			while ((data1 = bis.read()) != -1) {
				System.out.println("Read data1: " + data1);
				bos.write(data1);
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("최종 결과: " + Arrays.toString(outSrc));
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
