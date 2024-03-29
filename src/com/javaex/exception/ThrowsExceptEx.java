package com.javaex.exception;

import java.io.IOException;

//	CheckedException: 반드시 예외 처리 필요
//	- try ~ catch
//	- throw 로 예외 던지기를 한 경우
public class ThrowsExceptEx {

	public static void main(String[] args) {
		
		ThrowsExcept except = new ThrowsExcept();
		try {
			except.divide(100, 0);
			except.executeRuntimeException();
			except.executeExcept();		//	CheckedException은 반드시 예외 처리 필요
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (CustomArithException e) {
			System.out.println("에러메세지: " + e.getMessage());
			//	상황 정보 확인
			System.err.println("나누어지는 수" + e.getNum1());
			System.err.println("나누는 수" + e.getNum2());
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}

	}

}
