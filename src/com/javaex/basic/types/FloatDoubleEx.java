package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float floatVar;
		double doubleVar;
		
		floatVar = 0.12345678901234567890F;
		doubleVar = 0.1234567890123456789;
		
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		int intVar;
		intVar = 300000000;
		floatVar = 3E9F;
		doubleVar = 3E-9;
		
		System.out.println(intVar);
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		//부동 소수점 계산의 유의점
		//float, double은 정밀도 포기
		System.out.println(0.1*3);

	}

}
