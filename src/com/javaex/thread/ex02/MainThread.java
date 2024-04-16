package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		//	Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		//	thread 시작
		// -> .start() 메서드 호출
		
		//	쓰레드의 우선순위
		//	1 (최솟값) ~ 5 (중간값) ~ 10 (최댓값)
		thread.setPriority(Thread.MAX_PRIORITY);
		
		// Runnable 활용 쓰레드
		Thread rth = new Thread(new AlphabetRunnable());
		rth.setName("AlphabetRunnable");
		rth.setPriority(Thread.MIN_PRIORITY);
		
		thread.start();
		rth.start();
		
		//	thread 와 runnableThread 의 흐름을 main 쓰레드의 흐름 합류
		try {
			thread.join();
			rth.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");
		
	}

}
