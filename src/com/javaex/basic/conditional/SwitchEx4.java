package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		int num = scanner.nextInt();
		
		if (num % 3 == 0) {System.out.println(num + "는 3의 배수입니다.");
		
		} else {System.out.println(num + "은 3의 배수가 아닌 듯 합니다.");
		
		}

		scanner.close();
		
	}

}
