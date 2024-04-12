package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf-filtered.txt";
	
	//	소스 파일에서 leaf or leaves 가 포함된 문장만 필터링	-> target 으로 
	public static void main(String[] args) {
		
		System.out.println("원본 파일: " + source);
		System.out.println("필터 파일: " + target);
		
		try (
		//	주 스트림
		Reader fr = new FileReader(source);
		Writer fw = new FileWriter(target);		
		//	보조 스트림
		//	라인 단위 문자열 작업 -> Buffer 기능 사용
		BufferedReader br = new BufferedReader(fr);		
		BufferedWriter bw = new BufferedWriter(fw);		
		) {
			//	한줄 단위 읽고 쓰는 것에 특화;;
			String line = "";
			while ((line = br.readLine()) != null) {
				//	읽어들일 라인이 없으면 null
//				System.out.println(line );
				
				//	leaf or leaves 들어가있는 라인 필터링
				if (line.toUpperCase().contains("LEAF") || line.toUpperCase().contains("LEAVES")) {
//					System.out.println(line);
					//	필터링된 라인만 별도 저장
					bw.write(line);
					bw.newLine();
				}
				
			}
			
			System.out.println("필터링 완료");
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
