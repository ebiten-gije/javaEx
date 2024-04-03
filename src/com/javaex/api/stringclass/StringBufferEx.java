package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		//	String 은 immutable
		//	StringBuffer는 내부에 버퍼를 두고, 버퍼에서 작업
		//	최종 소비되는 시점에서 문자열로 반환
		//	메모리 관리 측면에서 String 보다 유리
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		//	문자열 추가: append
		sb.append(" is pencil");
		System.out.println(sb);
		
		//	문자열 삽입: insert
		sb.insert(7, " my");
		System.out.println(sb);
		
		//	문자열 치환: replace
		sb.replace(7, 10, " your");
		System.out.println(sb);
		
		//	메서드 체이닝: 메서드를 연속적으로 호출, 객체를 변화시키는 방법
		StringBuffer sb2 = new StringBuffer("this")
				.append(" is pencil")
				.insert(7, " my")
				.replace(7, 10, " your");
		System.out.println(sb2);
		
		sb.setLength(5);
		System.out.println(sb);
	}

}

//	StringBuiler 싱글 쓰레드 용이래, 기능은 스트링 버퍼와 비슷한데, 멀티쓰레드 운용 가능한 편이..