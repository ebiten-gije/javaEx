package com.javaex.basic.loop;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i <= 20; i++ ) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		scanner.close();
	}

}
