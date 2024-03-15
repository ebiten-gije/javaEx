package com.javaex.basic.loop;

public class WhileEx {

	public static void main(String[] args) {
		//While 반복문
		//조건을 만족하는 동안 블록 반복
		//반복 조건 제어 변수 필요. 조건 변수를 개발자가 직접 제어
	
		int a = 0;
		
		while (a <= 20) {
			System.out.println("I like java " + a);
			
		//반복 제어 변수 증감	
			a += 2;
		}

	}

}
