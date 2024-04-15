package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		//	입력 소스 (파일)
		File file = new File (filename);
		
		try {
			
			Scanner sf = new Scanner(file);
			//	데이터 저장 변수
			String name;
			float hei;
			float wei;
			
			while (sf.hasNextLine()) {	//	더 읽을 라인 있나?
				name = sf.next();		//	문자열 토큰 읽기
				hei = sf.nextFloat();	//	실수 토큰 읽기
				wei = sf.nextFloat();	//	실수 토큰 읽기
				
				System.out.printf("%s, 키: %f, 체중: %f%n", name, hei, wei);
				sf.nextLine();
			}

			sf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
