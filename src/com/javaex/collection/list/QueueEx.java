package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		//	Queue 선언
		//	- Interface
		//	실제 저장은 LinkedList 기능을 활용한다
		Queue <Integer> queue = new LinkedList<>();	//	링크드리스트 기능 이용하지만, 중간 삽입 삭제가 불가
		
		for(int i = 0; i < 10; i++) {
			queue.offer(i);	//	입력(제공)
			System.out.println("QUEUE: " + queue);
		}
		
		System.out.println("PEEK: " + queue.peek());	//	출력 방향의 데이터 확인
		System.out.println("Poll: " + queue.poll());	//	인출

		System.out.println("QUEUE: " + queue);
		
		//	poll 은 비어있는지 확인해야 함;;
		while(!queue.isEmpty()) {
			System.out.println("Poll: " + queue.poll());
			System.out.println("QUEUE: " + queue);
		}
		

	}

}
