package com.javaex.oop.shape.v1;

//	추상 클래스
//	자신이 객체화 될 수는 없다.
//	오로지 상속을 위한 부모 클래스로만 존재할 수 있음
//	안쪽에 추상 메서드 한 개 이상 가져야 한다
//	상속 받은 클래스는 선언된 추상 메서드를 반드시 구현해주어야 한다;;
public abstract class Shape {

	//	필드
	protected int x;
	protected int y;
	
	//	생성자 
	public Shape (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	추상 메서드
	//	추상 클래스를 상속받은 클래스에서 반드시 구현해야 함;;
	public abstract void draw();
	
	public abstract double area();
}
