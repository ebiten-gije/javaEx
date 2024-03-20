package com.javaex.basic.loop;

public class LoopPractice {

	public static void main(String[] args) {
		
//	forGugu();
//	whileGugu();
//	forStar();
	whileStar();
	
	}

	public static void forGugu() {
		
		for (int a = 2; a < 10; a++) {
			
			for (int b = 1; b < 10; b++) {
				
				System.out.println(a + "*" + b + " = " + (a * b) );
				
			}
		
		}	
			
	}

	public static void whileGugu() {
		
		int a = 2;
		
		while (a < 10) {
			
			int b = 1;
			
			while (b < 10) {
				
				System.out.println(a + "*" + b + " = " + (a * b));
				
				b++;
				
			}
		
		a++;
		
		}

	}
	
	public static void forStar() {
		
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				//int b = 0; b <= a; b++ /if break 필요없음..
				System.out.print("*");				
				if (b >= a) {
					break;
				}
			}
			System.out.println();//강제 개행
		}
	}
	
	public static void whileStar() {
		
		int a = 1;
		while (a < 10) {
			int b = 0;
			while (b < a) {
				System.out.print("*");
				b++;
			}
			System.out.print("\n");
			a++;
		}
	}

}
