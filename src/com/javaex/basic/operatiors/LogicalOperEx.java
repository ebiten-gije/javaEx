package com.javaex.basic.operatiors;

public class LogicalOperEx {

	public static void main(String[] args) {
		int a = 7;
		int b;
		b = 3;
				
		// 비교연산자 : >=, <=, >, <, ==, !=
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);
		// boolean 값 반환
		System.out.println("-------------");	
		// 논리 연산자
		// 논리곱 and(&&)
		// 논리합 or(||)
		// 논리부정 not(!)
		int c = 5;
		
		// c는 0 초과, 10 미만의 값?
		// 조건 1: c > 0
		// 조건 2: c < 10
		// 결과 조건 1 & 조건 2.
		boolean r1 = c > 0;		//조건 1
		boolean r2 = c < 10;	//조건 2
		boolean result = r1 && r2;
		
		System.out.println(result);
		
		// c가 0이하거나 10이상인가?
		//	조건 1: c <= 0
		//	조건 2: c >= 10
		r1 = c <= 0;
		r2 = c >= 10;
		result = r1 || r2;
		System.out.println(result);

		//문제 1의 논리 부정
		result = !(c > 0 && c < 10);
		// c <=0 || c >= 10의 논리 결과와 동일
		System.out.println(result);
		
		//문제 2의 논리 부정
		result = !(c <= 0 || c >= 10);
		// c > 0 && c < 10의 논리 결과와 동일
		System.out.println(result);
		
		System.out.println("-------------");
		System.out.println(c > 0 && c < 10);

		
	}

}
