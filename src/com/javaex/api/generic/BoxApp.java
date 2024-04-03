package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		//	내부에 String 만 저장 가능
		StringBox strBox = new StringBox();
		
		strBox.setContent("Generic");
		
		String retStr = strBox.getContent();
		System.out.println(retStr);
		
		//	내부에 Integer 만 저장 가능한 클래스
		IntBox intBox = new IntBox();
		intBox.setContent(1114);
		
		Integer retInt = intBox.getContent();
		System.out.println(retInt);
		
		//	타입별로 처리할 수 있는 모든 객체를 만들어야 할 때?
		//	-> Object를 처리할 수 있는 객체를 만들어,,, 모든 객체를 처리하는 만능 클래스
		ObjectBox objBox = new ObjectBox();
		objBox.setContent("Object Box");
		String result = (String)objBox.getContent();	//	캐스팅을 할 필요가 있음
		System.out.println(result);
		
		objBox.setContent(3.141592);
		double obj = (double)objBox.getContent();
		System.out.println(obj);	//	
		
		//	문제점: setter 사용 시에 전달되는 매개변수의 타입을 제한할 수 없다.
		//		: 데이터를 받아올 때 캐스팅이 필요함 ;; Object -> 실제 사용 클래스
		
//		Integer obj2 = (Integer)objBox.getContent();
//		System.out.println(obj2);
		
		//	GenericBox
		//	내부 데이터 타입을 외부 객체화 시점에서 결정
		GenericBox<String> geneStrBox = new GenericBox<>();
		//	-> 내부 데이터를 String 타입으로 결정
		geneStrBox.setContent("제네릭 스트링 박스");
//		geneStrBox.setContent(113549);	//	컴파일 시점에서 내부 입력 데이터를 체크 가능
	
		String objStr = geneStrBox.getContent();
		//	내부 저장 데이터가 지정되었기에 캐스팅 필요 없음;;
		System.out.println(objStr);
	}

}
