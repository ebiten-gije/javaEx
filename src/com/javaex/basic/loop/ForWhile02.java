package com.javaex.basic.loop;

public class ForWhile02 {

	public static void main(String[] args) {
		
		for (int a = 1; ; a++) {
			
			if (a % 6 == 0 && a % 14 == 0) {
				System.out.println(a);
				break;
			}
		
		}

	}

}
