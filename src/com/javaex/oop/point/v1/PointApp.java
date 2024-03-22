package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		
		point a = new point();
		
		point b = new point();
		
		a.setX(5);
		
		a.setY(5);
		
		b.setX(10);
		
		b.setY(23);
		
		a.draw();
		
		b.draw();
	}

}
