package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("rawtypes")
//	사용자 정의 클래스를 sort 하고자 할 때, Comparable 인터페이스를 구현해야 함;;
class Member implements Comparable{
	String name;
	public Member(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		//	두 객체의 선후 관계를 비교, -1, 0, 1을 return;;
		//	두 객체의 순서가 같으면 0, 앞 객체가 빠르면 -1, 큰 경우 1 
		if (o instanceof Member) {
			//	Member 로 캐스팅 가능
			Member other = (Member)o;
			//	대소 관계 비교는 name 필드로 비교
			return name.compareTo(other.name);
		}
		return 0;
	}
	
}
//
public class SortEx {

	public static void main(String[] args) {
		//	1. 기본 소팅
		basicSort();
		//	2. 역순 정렬
		basicDescSort();
		//	3. 사용자 정의 클래스 정렬
		customClassSort();
	}

	public static void basicSort() {
		int [] scores = {80, 100, 20, 55, 45, 14, 91};
		System.out.println("배열 원본: " + Arrays.toString(scores));
		
		Arrays.sort(scores);	//	작은 것 -> 큰 것 (오름차순, Ascending)
		System.out.println("오름차순 정렬: " + Arrays.toString(scores));
		
	}
	
	private static void basicDescSort() {
		Integer [] scores = {80, 100, 20, 55, 45, 14, 91};
		System.out.println("배열 원본: " + Arrays.toString(scores));
		
		//	내림차순 정렬
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("내림차순 정렬: " + Arrays.toString(scores));
		//	객체 내부의 Comparator 로 객체의 선후 관계를 규정해야 하기 때문에
		//	프리미티브 타입은 역순정렬될 수 없다.
	}
	
	public static void customClassSort() {
		//	사용자 정의 클래스의 정렬
		Member [] members = {
				new Member("장제스"),
				new Member("위안스카이"),
				new Member("장쯔민"),
				new Member("쑨원")
		};
		System.out.println("원본 배열: " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("오름차순 정렬: " + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("내림차순 정렬: " + Arrays.toString(members));
	}
}
