package com.javaex.oop.shape.v1;

public class Rectangle extends Shape {

	//	필드
	private int width;
	private int height;
	
	//	생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	//	부모가 선언한 추상 메서드는 반드시 구현해주어야 한다.
	@Override
	public void draw() {
		System.out.printf("사각형 [x = %d, y = %d, w = %d, h = %d, area = %f]를 그렸습니다.%n", x, y, width, height, area());
	}
	
	@Override
	public double area() {
		return width * height;
		
	}
}
