package com.javaex.basic.loop;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//단을 입력
		System.out.print("단을 입력해주세요: ");
		
		int dan = scanner.nextInt();
		//for 루프로 1~9까지 반복
		//for (초기화; 반복여부체크; 증감식)
		for (int num = 1; num < 10; num++) {
			System.out.println(dan + " * " + num + " = " + dan * num);
		}
		
		scanner.close();

	}

}
