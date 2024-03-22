package com.javaex.oop.methods;

public class MethodPractice {

	public static void main(String[] args) {
		//	입력X 출력X
		printHelloMethod();

		printNumbers();
		
		//	입력X 출력O
		int num = getRandomNumber();
		System.out.println(num);
		
		int sum = getSum();
		System.out.println(sum);
		
		//	입력O 출력X
		printOddOrEven(6);
		
		printStringLength("ありがとうございます。");
		
		//	입력O 출력O
		int lar = getLargeNumber(7, 9);
		System.out.println(lar);
		
		String str = concatenateString("ありがとう", "ございます。");
		System.out.println(str);
		
		//	가변인수 연습
		System.out.println("sumAll: " + sumAll(11, 12, 13, 14, 15, 16, 17, 18, 19, 10));
		
		System.out.println(concatenateStrings("c", "o", "n", "c", "a", "t", "e", "n", "a", "t", "e"));
	}

	private static void printHelloMethod() {
		System.out.println("Hello Method!");
	}
	
	public static void printNumbers() {
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			b = arr[i];
			System.out.printf("%d\t", b);
		}
		System.out.println();
	}
	
	public static int getRandomNumber() {
		
		int num = (int) (Math.random()*100)+1;
		return num;
	
	}
	
	private static int getSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	public static void printOddOrEven(int num1) {
		System.out.println(num1 % 2 == 0 ? "짝수" : "홀수");
		if (num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}
	
	public static void printStringLength(String str) {
		
		System.out.println(str.length());
		
	}
	
	public static int getLargeNumber(int a, int b) {
		
		if (a > b) {
			return a;
		} else {
			return b;
		}
		
	}
	
	public static String concatenateString(String a, String b) {
		return a + b;
		
	}
	
	public static int sumAll(int ...values) {
		int total = 0;
		for (int value: values) {
			total += value;
		}
		return total;
	}
	
	public static String concatenateStrings(String ... str) {
		String a = "";
		for (String s: str) {
			a += s;
		}
		return a;
	}
}

