package com.javaex.basic.loop;

public class MathRandom {

	public static void main(String[] args) {
		
		qwer();
		System.out.println("");
		for (int a = 0; a < 6; a++) {
			
			int num = (int) (Math.random()*45)+1;
			
			System.out.print(num +" ");
			
		}

	}

	public static void qwer() {
		
		int a = 0;
		while (a < 6) {
			int num = (int) (Math.random()*45)+1;
			System.out.print(num + " ");
			a++;
		}
		
	}
	
}
