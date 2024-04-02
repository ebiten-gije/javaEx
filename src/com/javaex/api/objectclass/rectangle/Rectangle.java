package com.javaex.api.objectclass.rectangle;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int area() {
		return width * height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle rec = (Rectangle)obj;
			return area() == rec.area();
		}
		return super.equals(obj);
	}
}
