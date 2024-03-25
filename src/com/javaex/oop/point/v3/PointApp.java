package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		
		Point a = new Point(5, 5);
		
		Point b = new Point(10, 23);
		
/*		a.setX(5);
		
		a.setY(5);
		
		b.setX(10);
		
		b.setY(23);				*/
		
		a.draw();
		
		b.draw();
		
		//	오버로딩 메서드 호출;;
		a.draw(true);
		a.draw(false);
		
		b.draw(false);
		
	}

}
