package com.javaex.oop.shape.v1;

public class Circle extends Shape {

	//	필드
	private double radius;
	
	//	생성자
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	//	부모가 선언한 추상 메서드는 반드시 구현해주어야 한다.
	@Override
	public void draw() {
		System.out.printf("원 [x = %d, y = %d, r = %f, area = %f]를 그렸습니다.%n", x, y, radius, area());
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);	//	Math.pow(a,b) a를 b번 곱해라(제곱)
		return area;
		
	}
}
