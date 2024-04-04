package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String [] args) {
		//	백터 선언
		//	백터는 모든 객체 (Object)를 담을 수 있는 컬렉션 객체
		//	.elementAt 등의 참조를 위해서는 실제 클래스로 캐스팅 필요함
		Vector v = new Vector();	//	기본 벡터 버퍼 용량은 0
		
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
		for(int i = 0; i < 10; i++) {
			//	요소 추가 (.addElement)
			v.addElement(i);	//	Auto Boxing	-> Integer.valueOf(i)
		}
		
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
		//	허용량 초과
		v.addElement(10);
		
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
		//	조회: elementAt
		Integer val = (Integer) v.elementAt(5);	//	.elementAt 은 Object 리턴, 캐스팅 필요
		System.out.println(".elementAt(5): " + val);
		
		//	역 참조(검색)
		//	객체의 인덱스 조회
		System.out.println("v.indexOf(4): " + v.indexOf(4));
		System.out.println("v.indexOf(5): " + v.indexOf(20));	//	없는 객체 (-1)
		
		//	객체 포함 여부: .contains
		System.out.println(".contains(7): " + v.contains(7));
		System.out.println(".contains(15): " + v.contains(15));
		
		//	삭제: .removeElement
		v.removeElement(7);
		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer) v.elementAt(i);
			System.out.print(item + " ");
		}
		//	컬렉션 프레임 워크에서는 루프의 개선이 필요
		//	TODO: 루프 방식 개선
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
		//	버퍼 비우기
		v.clear();
		System.out.println("v = " + v);
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
		//	Generic 을 사용하여 코드 개선 가능
		//	예) Number 를 상속한 모든 객체를 담을 수 있는 Generic 을 사용
		Vector <? super Number> v2 = new Vector();	//	Number 를 상속 받은 클래스만 저장 가능
		
		v2.addElement(Integer.valueOf(2024));
		v2.addElement(Float.valueOf(3.141592f));
//		v2.addElement("Vector");	//	String 은 Number 를 상속 받지 않았기에 붉다
		
		//	TODO: 개선된 방식으로 루프 돌리기
		
		
		
	}
	
}
