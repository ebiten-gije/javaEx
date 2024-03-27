package com.javaex.oop.point.v4;

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
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.draw();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw();
		
		cp1.draw(true);
		cp1.draw(false);
		
		
	}

}
