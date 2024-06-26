package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		//	Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		//	thread 시작
		// -> .start() 메서드 호출
		thread.start();
		//	MainThread 로직
		//	A ~ Z 까지 차례대로 출력
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
			
			//	쓰레드 실행 대기
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인 쓰레드 종료");
		
	}

}
