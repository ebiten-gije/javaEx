package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx {
	// 정수 1개 입력
	// 100 을 입력 받은 정수로 나눔
	// 나눗셈 결과를 화면에 출력
	public static void main(String[] args) {

		double result = 0;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");

		try { // 예외 발생 가능 영역을 try 블록으로;;
			num = sc.nextInt();
			result = 100 / num;

			// 앞쪽에서 구체적 에러 처리
			// 가장 마지막에 Exception으로 잔여 에러 처리
		} catch (InputMismatchException e) {
			// 입력 형식 에러
			System.err.println("정수로 입력해주세여");

		} catch (ArithmeticException e) {
			// 100% ArithMeticException
			// 구체적인 예외 처리 로직 수행 가능
			System.err.println("0으로는 나눌 수 없습니당");

		} catch (Exception e) { // 예외 (정보) 클래스로 캐치
			e.printStackTrace(); // 예외 스택 출력

		} finally {
			// 예외 유무 관계 없이 가장 마지막에 1회 실행
			// try 블럭에서 설정된 시스템 자원 등을 해제
			// 필수는 아님;;
			System.out.println("예외처리 종료..");
		}

		System.out.println(result);

		sc.close();

	}

}
