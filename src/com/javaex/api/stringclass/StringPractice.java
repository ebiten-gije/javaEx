package com.javaex.api.stringclass;

public class StringPractice {

	public static void main(String[] args) {
		
		String s = "aBcAbCabcABC";
		
		System.out.println("3번째 문자열: " + s.charAt(2));
		
		int index = 0;
		
		index = s.indexOf("abc");
		
		System.out.println("\"abc\" 문자열이 처음으로 나타나는 인덱스: " + index);
		
		System.out.println("문자열의 문자 갯수: " + s.length());
		
		System.out.println(s.replace('a', 'R'));
		
		System.out.println(s.replace("abc", "123"));
		
		System.out.println(s.substring(0, 3));
		
		System.out.println(s.toUpperCase());

	}

}
