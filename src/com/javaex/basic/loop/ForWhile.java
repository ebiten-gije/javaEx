package com.javaex.basic.loop;

public class ForWhile {

	public static void main(String[] args) {
		//반복 횟수를 정확히 알기 힘든 경우 while 주로 사용;;
		int a = 1;
		
		while (a > 0) {
			
			if (a % 6 == 0 && a % 14 == 0) {
				
				break;
			}
			
			a++;
			
		}
		
		System.out.println(a);
		
	}

}
