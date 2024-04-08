package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom{
	private String subject;
	private String roomName;
	
	public ClassRoom(String subject) {
		//	containsValue 에서 사용하기 위한 생성자
		this.subject = subject;
	}
	public ClassRoom(String subject, String roomName) {
		super();
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "classRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	@Override
	public int hashCode() {
		return subject.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom) obj;
			return subject.equals(other.subject);
		}
		return super.equals(obj);
	}
	
	//	동등성 체크 로직
	//	1. subject 의 hashCode 를 전체 객체의 hashCode로 
	//	2. subject 의 값이 동일하면 전체 객체의 값도 같음
	//	두개의 관문을 통과해 동등성 확인
	
	
}

public class HashTableEx {

	public static void main(String[] args) {
		//	Map 형 자료형
		//	KeySet 과 List 의 복합 자료형
		//	Key(KeySet) 은 순서가 없고, 중복 허용 않음
		//	Value 는 Key 를 톻한 접근만 가능, 중복 허용
		
		//	Hashtable 선언
		Map <String, ClassRoom> map = new Hashtable<>();
		
		//	맵에 데이터 넣기: put
		map.put("101", new ClassRoom("JAVA", "101호"));
		map.put("201", new ClassRoom("C", "201호"));
		map.put("203", new ClassRoom("Python", "203호"));
		map.put("301", new ClassRoom("Linux", "301호"));
		
		//	출력: 순서가 없음
		System.out.println(map);

		//	데이터 참조: .get
		System.out.println(map.get("301"));	//	Key 를 통한 접근
		
		//	데이터 변경: .put
		map.put("201", new ClassRoom("C#", "201호"));
		System.out.println(map.get("201"));
		
		//	특정 키의 포함 여부 확인
		System.out.println(map.containsKey("203"));	
		//	키에 연결된 값을 참조
		System.out.println(map.containsKey("404"));
		
		//	특정 값의 포함 여부
		//	값 JAVA의 포함 여부
		System.out.println(map.containsValue("JAVA"));
		System.out.println(map.containsValue(new ClassRoom("JAVA")));
		
		//Iterator
		System.out.println("=================================");
		Iterator<String> ite = map.keySet().iterator();
		//	키셋으로 이터레이터 추출
		while(ite.hasNext()) {	//	뒤에 요소가 더 있는가?
			ClassRoom room = map.get(ite.next());
			System.out.println(room);
		}
		
		//	맵 비우기
		map.clear();
		System.out.println(map);
		
	}

}
