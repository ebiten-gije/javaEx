package com.javaex.api.objectclass.ex3;

public class LangClassTest {

	public static void main(String[] args) {
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String s1 = new String ("Java");
		String s2 = new String ("Java");
		
		System.out.println(s1 == s2);		//	참조 주소 비교
		System.out.println(s1.equals(s2));	//	내부 데이터 비교
		
		//	객체 설계시 내부 데이터 값을 비교하기 위한 로직을
		//	equals 메서드에서 정의하여야 함
		
	}

}
