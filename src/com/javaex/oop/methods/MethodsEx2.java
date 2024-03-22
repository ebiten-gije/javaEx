package com.javaex.oop.methods;

public class MethodsEx2 {
	//	가변 인수: 정해지지 않은 갯수의ㅐ 인수가 넘어올 때;;
	public static void main(String[] args) {
		
		//	방법 1: 배열로 전달하는 방법
		System.out.println("getSumArr: " + getSumArr(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		
		//	방법 2: 가변 인수를 사용하는 법
		System.out.println("getSumVar: " + getSumVar(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
		
		//	방법 3: 고정 인수와 가변 인수를 동시에 사용?
		printSum("합계: ", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		
	}
	private static void printSum(String message, double ... values) {
		System.out.println(message + getSumVar(values));
		
		
	}
	
	
	//
	private static double getSumVar(double ... values) {
		double total = 0;
		
		for (double val: values) {
			total += val;
		}
		
		return total;
	}

	//	배열을 이용한 여러 개의 데이터 전달
	private static double getSumArr(double[] values) {
		double total = 0;
		
	/*	for (int i = 0; i < valuse.length; i++) {
			total += values[i];
		}*/
		for (double val: values) {
			total += val;
		}
		
		return total;
	}
	
}
