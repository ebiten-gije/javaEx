package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("월을 입력하세요: ");
		
		int cal = scanner.nextInt();
		String message;
		
		switch (cal) {
		
		case 1 : 
		case 3 : 
		case 5 :
		case 7 : 
		case 8 : 
		case 10 : 
		case 12 : 
			message = ("31일입니다.");
		break;
		
		case 4 : ;
		case 6 : ;
		case 9 : ;
		case 11 : ;
			message = ("30일입니다.");
		break;
		
		case 2 : 
			message = ("28일입니다.");
		break;
		
		default :
			message = ("뭐야?");
		break;
			
		}
		System.out.println(cal + "월은 " + message);	
		
		scanner.close();
	}

}
