package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		//	1. 기본 타입 검색
		basicSearch();

		//	2. 사용자 정의 객체의 검색
		customClassSearch();
	}

	public static void basicSearch() {
		//	Java Arrays 의 검색 기능은 binarySearch 방식으로 수현
		int nums [] = {6, 3, 7, 10, 1, 2, 8, 9, 4, 5};
		
		//	이진 검색 방식의 배열은 정렬이 필요함;;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int index = Arrays.binarySearch(nums, 3);	//	검색 대상 배열
		System.out.println("3의 인덱스: " + index);
		
		//	참조 타입의 검색
		String [] data = {"Java", "C", "C++", "Python", "Linux"};
		
		//	검색을 위한 정렬
		Arrays.sort(data);
		System.out.println("정렬된 배열: " + Arrays.toString(data));
		index = Arrays.binarySearch(data,	//	검색 대상 배열
				"Java");					//	
		System.out.println("Java의 인덱스: " + index);
		
	}
	
	private static void customClassSearch() {
		Member m1 = new Member("장제스");
		Member m2 = new Member("위안스카이");
		Member m3 = new Member("장쯔민");
		Member m4 = new Member("쑨원");

		Member[] members = {
				m1, m2, m3, m4
		};
		
		System.out.println("원본 배열: " + Arrays.toString(members));
		//	binarySearch 를 위한 정렬
		Arrays.sort(members);
		System.out.println("정렬 배열: " + Arrays.toString(members));
		
		int index = Arrays.binarySearch(members, m2);
		System.out.println(m2 + "의 인덱스: " + index);
	}
}
