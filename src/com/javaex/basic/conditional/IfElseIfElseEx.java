package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		//스캐너 열기
		Scanner scanner = new Scanner(System.in);
		//숫자 입력
		System.out.println("숫자를 입력하세요.");
		
		int num = scanner.nextInt();
		//숫자 조건 분기
		/*if (num > 0) {System.out.println("양수입니다.");
		
		} else if (num < 0) {System.out.println("음수입니다.");
		
		} else  {System.out.println("0이네요?");
		*/
		//중첩 if
		if (num == 0) {System.out.println("0입니다.");
		
		} else {
			
			if (num < 0) {System.out.println("음수입니다");
			
			} else {System.out.println("양수입니다");
			
			}
		}
		
		//스캐너 닫기
		scanner.close();

	}

}
