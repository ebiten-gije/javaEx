package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		
		int[] intArr = new int [] {3, 6, 9};
		
		try {
			System.out.println(intArr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			//	e.printStackTrace();
			System.err.println("배열 범위 밖입니다");
		} finally {
			System.out.println("예외처리 종료...");
		}

	}

}
