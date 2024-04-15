package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		
		System.out.println("원본: " + filename);
		
		try (
				Reader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr);
				) {
			String line = "";	//	한줄 읽기 변수
			
			while ((line = br.readLine()) != null) {
				//	토크나이징
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {	//	뒤에 토큰이 더 있을까?
					String token = st.nextToken();
					System.out.println("token: " + token);
				}
			}
			
			br.close();		//	보조 스트림 닫으면 주 스트림도 닫힘;;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
