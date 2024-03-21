package com.javaex.basic.reftype;

import java.util.Arrays;

public class ArrayCopy {
	//	배열은 크기 변경 불가
	//	공간을 늘리고자 한다면, 새 배열을 만들고 복사해주어야 함.ㅇㅇ
	public static void main(String[] args) {
		//	for 문을 이용한 복제
//		arrayCopyByFor();
		//	System 을 이용한 복제
		arrayCopyBySystem();
	}

	public static void arrayCopyByFor () {
		
		int[] scores = {1, 2, 3};	//	length == 3
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
		//	새 공간을 만들어 복사
		int target[] = new int [10];
		
		for (int i = 0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		
		//	배열 유틸리티 클래스를 이용한 출력
		System.out.println(Arrays.toString(target));
		
	}
	
	public static void arrayCopyBySystem () {
		
		int[] intArray = {1, 2, 3};
		
		int[] newArray = new int [10];
		
		System.out.println(Arrays.toString(intArray));
		
		System.arraycopy(intArray,	//	원본 배열
				0,	//	복사 시작 인덱스 (원본)
				newArray,	//	복사 대상 배열
				3,	//	대상 배열의 시작 인덱스
				intArray.length);	//	복사할 길이
		
		System.out.println(Arrays.toString(newArray));
		
		//	Enhanced For
		//	for (추출된 데이터: 원본 배열 혹은 컬렉션
		for (int suu: newArray) {
			System.out.print(suu + "\t");
		}
		
	}
	
}
