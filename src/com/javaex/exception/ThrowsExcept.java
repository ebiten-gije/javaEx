package com.javaex.exception;

import java.io.IOException;

//	사용자 정의 예외
class CustomArithException extends ArithmeticException {
	//	필드
	private int num1;
	private int num2;
	
	//	생성자
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
}

public class ThrowsExcept {

	public void executeExcept() throws IOException{	//	선언부에 예외 던질 것을 명시;;
		System.out.println("강제 예외 발생");
		//	외부로 예외 던지기 (throw)
		throw new IOException("강제 예외!");
		//	IOException은 대표적인 CheckedException
		//	CheckedException을 throw 할 때는 해당 메서드가 CheckedException을 던진다는 것을
		//	외부 메서드에 알려주어야함;;
		
	}
	
	public void executeRuntimeException() {
		//	런타임 익셉션 -> 실행 타임에서만 확인되는 메서드
		//	예외처리 없이도 컴파일은 됨
		//	하지만 예외처리 거쳐야 안정성 보장
		//	throw를 명시하지 않는다.
		System.out.println("런타임 익셉션");
		throw new RuntimeException("런타임 익셉션");
	}
	
	//	두개의 숫자를 나누는 코드
	public double divide(int num1, int num2) {
		//	 예외 발생 시, 보다 구체적인 예외로 변환한 후,
		//	예외 상황의 정보를 추가해서 예외를 반환하는 것이 좋다;;
		double resalt = 0;
		
		try {
			resalt = num1 / num2;
		} catch (ArithmeticException e) {
			//	보다 구체적인 예외로 전환
			CustomArithException cae = new CustomArithException("사용자 정의 Exception", num1, num2);
			//	전환된 사용자 정의 예외를 throw
			throw cae;
		}

		return resalt;
	}
}
