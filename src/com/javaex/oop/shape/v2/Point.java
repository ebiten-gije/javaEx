package com.javaex.oop.shape.v2;

//	그림판에서 그려져야 하지만, 면적을 가지진 않음(도형 아님);;
public class Point implements Drawable {

	//	필드
	private int x, y;
	
	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.printf("점 [x = %d, y = %d]의 점을 그렸습니다.%n", x, y);
	}
}
