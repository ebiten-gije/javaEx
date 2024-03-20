package com.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {
		
		String str1;	//할당
		str1 = "ABC";	//선언
		
		String str2 = "ABC";	//선언과 동시 할당
		
		String str3 = new String("ABC");	
		
		//	세 참조 변수는 같은 값을 가지는가.
		//	참조 변수의 경우 ==는 메모리 주소의 비교
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		//값의 비교는 .equals 메서드 이용
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
	}

}
