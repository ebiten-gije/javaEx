package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		promotionEx();
		castingEx();
		
		int num1 = 2;
		float num2 = 1.2F;
		float multiply = num1 * num2;
		System.out.println(multiply);
		

	}
	
	public static void castingEx() {
		
		double P = 123123.141592;
		System.out.println(P);
		
		float Po = (float)P;
		System.out.println(Po);
		
		long Pe = (long)P;
		System.out.println(Pe);
		
		short s = (short)Pe;
		System.out.println(s);
	}
	
	public static void promotionEx() {
		//표현 범위가 졻은 자료형에서 넓은 자료형으로의 변환
		// 암묵적으로 자동으로 캐스팅을 수행
		byte b = 25;
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);

		char ch = 'A';
		short s2 = (short)ch;
		System.out.println(s2);
		


		
	}

}
