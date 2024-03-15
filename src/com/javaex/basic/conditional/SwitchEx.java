package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		//스캐너 열기
		Scanner scanner = new Scanner(System.in);
		//과목 번호 입력
		System.out.println("과목을 선택해주세용~" + "\n1.자바 2.C 3.자습 4.파이썬 5.기타"
		+ "\n과목번호: ");
		
		int num = scanner.nextInt();
		//과목 번호 조건 분기 (Switch)
		switch (num) {
		
		case 1 : System.out.println("101호입니다.");
		break;
		
		case 2 : System.out.println("102호로 가세용~");
		break;

		case 3 : System.out.println("103호네요..");
		break;

		case 4 : System.out.println("104호??");
		break;
		
		default : System.out.println("상담원에게 문의핫세요.");
		
		break;//(?)
		}//스캐너 닫기
		scanner.close();		
	
	}

}