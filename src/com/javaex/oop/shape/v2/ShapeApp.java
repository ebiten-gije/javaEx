package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		
//		Shape s = new Shape();	//	추상 클래스는 직접 객체화 불가

		//	추상 클래스를 상속받은 클래스는 직접 객체화 가능
		Circle c = new Circle (10, 20, 30);
		c.draw();
		
		Rectangle r = new Rectangle (10, 20, 30, 100);
		r.draw();
		
		Point p = new Point (100, 10);
		p.draw();
		
		//	Circle, Rectangle 은 Shape의 서브 클래스;;
		//	Point 는 Shape 의 서브 클래스가 아니다 (관계가 없음;;)
		//	Circle, Rectangle, Point 는 Drawable 공통된 인터페이스를 가지고 있음;;
		
		Drawable obj[] = new Drawable[] {
				r, c, p
		};
		for(Drawable objs: obj) {
			if (objs instanceof Drawable) {
				objs.draw();
			}
		}
	}

}
