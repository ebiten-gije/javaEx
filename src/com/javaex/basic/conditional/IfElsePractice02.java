package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과목을 선택해주세용~\n1.자바 2.C 3.자습 4.파이썬 5.기타"
		+ "\n과목번호: ");
		
		int num = scanner.nextInt();
		
		if (num == 1) {System.out.println("101호입니다.");
		
		} else if (num == 2) {System.out.println("102호로 가세용~");
		
		} else if (num == 3) {System.out.println("103호네요..");
		
		} else if (num == 4) {System.out.println("104호??");
		
		} else {System.out.println("상담원에게 문의하세욧");
		
		}

		scanner.close();
		
	
	}
}