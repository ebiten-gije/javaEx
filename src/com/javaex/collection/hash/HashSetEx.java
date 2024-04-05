package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

class Student {
	int id;	//	학생 id
	String name;	//	이름
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + "]";
	}


	//	객체의 동등성 비교를 위한 두개의 관문()
	//	1. hashCodde
	//	2. equals
	@Override
	public int hashCode() {
		return id;
	}

	
	//	값의 동일성 반별을 위한 equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student)obj;
			return id == other.id && name.equals(other.name);
		}
		return super.equals(obj);
	}

	
	
	
	
}

public class HashSetEx {

	public static void main(String[] args) {
		//	1. HashSet 사용법	(기본형)
		usingHashSet();
		
		//	2. 집합 연산
		setOperation();
		
		//	3. HashSet 사용법 (객체 자료형)
		usingHashSetWithCustom();

	}

	private static void usingHashSet() {
		
		//	선언
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println("hs: " + hs);
		System.out.println("size: " + hs.size());
		
		//	특정 객체 포함 여부
		System.out.println("C++ 포함? " + hs.contains("C++"));
		System.out.println("Linux 포함? " + hs.contains("Linux"));
		
		System.out.println("hs: " + hs);
		
		//	순서가 없음: 객체로 삭제하는 방법만 제공
		//	객체 삭제
		hs.remove("C++");
		System.out.println("hs: " + hs);
		
	}
	
	private static void setOperation() {
		//	집합 연산
		HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("전체 집합: " + numbers);
		
		HashSet<Integer> odds = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
		System.out.println("홀수 집합: " + odds);
		
		HashSet<Integer> evens = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
		System.out.println("짝수 집합: " + evens);
		
		HashSet<Integer> mThree = new HashSet<>(Arrays.asList(3, 6, 9));
		System.out.println("3의 배수 집합: " + mThree);
		
		//	교집합: retainAll
		//	원본 보호를 위해 복제
		System.out.println("==============================================교집합");
		
		HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>)mThree.clone();
		
		System.out.println("집합 A: " + setA);
		System.out.println("집합 B: " + setB);
		
		setA.retainAll(setB);
		System.out.println("교집합: " + setA);
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3, 9))));
		
		//	합집합: addAll
		System.out.println("=================================================합집합");
		
		setA = (HashSet<Integer>)odds.clone();
		setB = (HashSet<Integer>)evens.clone();
		
		System.out.println("집합 A: " + setA);
		System.out.println("집합 B: " + setB);
		
		setA.addAll(setB);
		System.out.println("합집합: " + setA);
		System.out.println(setA.equals(numbers));
		
		//	차집합: removeAll
		System.out.println("=================================================차집합");
		
		setA = (HashSet<Integer>)numbers.clone();
		setB = (HashSet<Integer>)odds.clone();
		
		System.out.println("집합 A: " + setA);
		System.out.println("집합 B: " + setB);
		
		setA.removeAll(setB);
		System.out.println("차집합: " + setA);
		System.out.println(setA.equals(evens));
	}

	private static void usingHashSetWithCustom() {
		
		HashSet <Student> hs = new HashSet<>();
		
		Student s1 = new Student(10, "장각");
		Student s2 = new Student(10, "장각");
		Student s3 = new Student(14, "곽회");
		Student s4 = new Student(16, "곽회");
		// 이름과 학번이 같으니, 두 객체를 동등 객체로 판정하는 로직을 만들어야 함;;
		
		hs.add(s1); hs.add(s2); hs.add(s3); hs.add(s4);
		
		System.out.println("학생부: " + hs);
	}
}
