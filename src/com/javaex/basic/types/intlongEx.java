package com.javaex.basic.types;

public class intlongEx {
	public static void main(String[] args) {
		int intVar1;
	//	int intVar2; 
		
		intVar1 = 2024;
	//	intVar2 = 1234567890132;	out or range
		
		System.out.println(intVar1);
	//	System.out.println(intVar2); 초기화 필요
		
		long longVar1;
		long longVar2;
		
		longVar1 = 2024;
		longVar2 = 1234567890123L; // long형 데이터 뒤에는 L
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		long amount =100_000_000_000_000L;
		
		System.out.println(amount);
		
		// 진법 표기 : 2진수, 8진수, 16진수
		int bin, oct, hex;
		bin = 0b1100; //	2진수; 0b
		oct = 072; //	8진수; 0
		hex = 0xff; // 16진수; 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}
}
