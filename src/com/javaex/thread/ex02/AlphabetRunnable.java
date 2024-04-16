package com.javaex.thread.ex02;

//	Runnable 구현 방식 쓰레드
//	run 메서드를 오버라이드한 실행 클래스를 Thread 클래스에 전달
public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		//	쓰레드 내부에서 실행될 로직
		//	주의) 직접 호출하지 말고 .start() 메서드를 통한 우회 호출
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.printf("%s: %c%n", Thread.currentThread().getName(), c);
			
			//	쓰레드 실행 대기
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " 종료");
	}

}
