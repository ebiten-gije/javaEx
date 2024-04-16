package com.javaex.thread.ex01;

//	Thread 상속을 통한 쓰레드 생성
public class DigitThread extends Thread {
	
	//	쓰레드의 로직 구현
	//	주의: 이 메서드는 절대 직접 실행하지 말자
	@Override
	public void run() {
		//	Working Logic: 0 ~ 30까지 돌리자
		for (int a = 0; a <= 30; a++) {
			System.out.printf("%s:%d%n", getName(), a);
			//	쓰레드 지연
			try {
				Thread.sleep(260);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "쓰레드 종료");
	}

}
