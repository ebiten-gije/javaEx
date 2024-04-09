package com.javaex.functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return getTotal() / (double)3;
	}

	
	@Override
	public String toString() {
		return  name + " [국어 = " + kor + ", 영어 = " + eng + ", 수학 = " + math + ", 합계 = " + getTotal() + ", 평균 = " + getAverage() + "]";
	}
	
}
public class StreamEx {

	public static void main(String[] args) {
		//	프리미티브 타입 스트림
		int scores[] = {100, 15, 87, 34, 27, 91, 78};
		
		//	배열에서 스트림 뽑아내는 방법
		IntStream arrStream = Arrays.stream(scores);
		System.out.println(arrStream);
		
		//	사용자 정의 클래스 타입 스트림
		List <Student> students = new ArrayList<>();
		students.add(new Student("ユリ", 90, 50, 17));
		students.add(new Student("ルカ", 78, 41, 48));
		students.add(new Student("リエ", 67, 75, 62));
		students.add(new Student("ミユ", 87, 71, 58));
		students.add(new Student("スズカ", 44, 38, 74));
		
		//	컬렉션 프레임워크 클래스에서는 .stream() 메서드로 스트림 추출 가능
		Stream <Student> objStream = students.stream();
		System.out.println(objStream);
		
		//	최종 연산: forEach()
		testForEach(scores, students);
		testFilter(scores, students);	//	filter
		testMap(scores);				//	map
		testCountSum(scores);			//	count, sum
		testFilterSort(students);		//	filter, sort
		testReduce(scores);
	}

	private static void testForEach(int [] scores, List <Student> lst) {
		//	forEach -> 최종 연산, 스트림을 순회하면서 최종 처리
		System.out.println("=========================================stream forEach");
		
		//	배열 순회
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		//	forEach 사용
		Arrays.stream(scores).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//	컬렉션 순회
		Iterator <Student> iter = lst.iterator();
		while(iter.hasNext()) {
			Student st = iter.next();
			System.out.println(st);
		}
		
		//	forEach
		lst.stream().forEach(n -> System.out.println(n));
		
	}
	
	private static void testFilter(int [] arr, List <Student> lst) {
		//	arr 에서 70 이상 추출
		System.out.println("=====================================stramFilter");
		System.out.println(Arrays.toString(arr));
		
		Arrays.stream(arr).filter(n -> n >= 70).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//	lst 에서 평균 점수가 60점 이상인 것만 추출
		lst.stream().filter(obj -> obj.getAverage() >= 55).forEach(System.out::println);
	}
	
	private static void testMap(int [] arr) {
		System.out.println("=========================================streamMap");
		//	맵은 형태는 그대로, 내부 요소의 변형
		System.out.println("원본: " + Arrays.toString(arr));
		//	각 요소를 /2 해서 새로운 배열을 생성
		Arrays.stream(arr).map(n -> n / 2).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//	배열 arr 요소 모두 * 2 -> 새로운 배열로 변환
		int [] multi = Arrays.stream(arr).map(n -> n * 2).toArray();
		System.out.println(Arrays.toString(multi));
	}
	
	private static void testCountSum(int [] arr) {
		System.out.println("===================================");
		//	count: 요소의 개수를 카운트하는 함수(집계)
		int numCount = (int)Arrays.stream(arr).count();
		System.out.println(Arrays.toString(arr) + ": count = " + numCount);
		//	sum: 기본형 특화 스트림에서만 사용 가능
		//	기본형 특화 스트림: primitive type 처리하기 위한 스트림
		//					IntStream, LongStream, DoubleStream
		//	배열로부터 70점 이상인 점수를 필터링해서 모두 합산;;
		System.out.println("70 이상 점수의 합계: " + Arrays.stream(arr).filter(n -> n >= 70).sum());
		
	}
	
	private static void testFilterSort(List <Student> lst) {
		//	평균점 55점 이상인 학생 목록으로부터 학생 이름의 오름차순으로 정렬
		System.out.println("=================================================filterSort");
		lst.stream()	//	스트림 생성
		.filter(obj -> obj.getAverage() >= 55)	//	필터
//		.sorted((obj1, obj2) -> obj1.getName().compareTo(obj2.getName()))	//	정렬(오름차순)
		.sorted((obj1, obj2) -> -obj1.getName().compareTo(obj2.getName()))	//	정렬(내림차순)
		.forEach(System.out::println);
	
	}
	
	private static void testReduce(int [] arr) {
		System.out.println("=========================================stream reduce");
		System.out.println("원본: " + Arrays.toString(arr));
		
		int total = Arrays.stream(arr).reduce(0,	//	누산기 초깃값 
				(acc, curr) -> {
					System.out.println("acc: " + acc);
					System.out.println("curr: " + curr);
					return acc + curr;
				}
		);
		System.out.println("total: " + total);
		
	}
}
