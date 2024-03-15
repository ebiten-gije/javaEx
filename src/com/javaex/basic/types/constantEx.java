package com.javaex.basic.types;

import java.util.Calendar;

public class constantEx {
	public static void main(String[] args) {
		final double PI = 3.141592;
		final int SPEED_LIMIT = 120;
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		//SPEED_LIMIT = 100;
		
		System.out.println("현재 제한 속도는" + SPEED_LIMIT + "입니다.");
		System.out.println("제한 속도" + 110 + "이하로 주행해 주세요.");
		
		System.out.println(Calendar.JANUARY);
		
		
			
	}

}
