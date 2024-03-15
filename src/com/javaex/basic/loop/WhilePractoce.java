package com.javaex.basic.loop;

import java.util.Scanner;

public class WhilePractoce {

	public static void main(String[] args) {
		//스캐너 열기
		Scanner scanner = new Scanner(System.in);
		//단 입력 받기
		System.out.print("단을 입력해주세요. \n단: ");
		
		int num = scanner.nextInt();
		
		int num2 = 1;
		//구구단
		while (num2 <= 19) {
			System.out.println(num + " * " + num2 + " = " + num * num2);
			num2 += 1; 
		}
		//스캐너 닫기
		scanner.close();
	}

}
