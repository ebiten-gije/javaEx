package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {
	//정해지지 않은 수의 정수를 입력, 합산
	//0이 입력되면 종료
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//합산 변수
		int total = 0, value;
		
		do {
			System.out.println("숫자를 입력하세요. [0이면 종료함]");
			value = scanner.nextInt();
			total += value;
			System.out.println("합계: " + total);
		//0이면 합산 종료
		//0 아니면 계속 입력 받기
		} while (value != 0);

		System.out.println("종료합니다.");
		scanner.close();
	}
	
}
