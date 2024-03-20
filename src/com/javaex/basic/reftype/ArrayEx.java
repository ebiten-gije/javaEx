package com.javaex.basic.reftype;

public class ArrayEx {

	public static void main(String[] args) {
		//	배열을 생성하는 여러가지 방법;;
		
		String[] names;	//타입[] 식별자
		int scores[];	//타입 식별자[]
		
		//	초기화 방법
		names = new String[] {
			"미", "페", "마", "아"
		};	//new 키워드로 기본값과 함께 생성
		
		float height[] = {
			158.2f,
			149.5f,
			155.7f,
			161.9f
		};	//	값 목록을 가지고 있을 때
		
		//	값을 가지고 있지 않고, 공간의 갯수만 알 수 있을 때
		scores = new int[4];	//공간의 갯수 명시
		//	index 0부터 시작
		//	총 길이 .lenght - 1
		
		scores[0] = 40;
		scores[1] = 60;
		scores[2] = 88;
		scores[3] = 76;
//		scores[4] = 100;	//IndexOutOfBounds
		
		for (int a = 0; a < names.length; a++) {
			//	총 길이는 배열의 .length - 1 까지
			System.out.printf("%s (%.1f) : score = %d%n",
					names[a], height[a], scores[a]);
		}
		
	}

}
