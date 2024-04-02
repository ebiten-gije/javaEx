package com.javaex.api.objectclass.ex2;

//	두 객체의 내부 데이터의 같음을 확인하는 equals 메서드
public class Point {

	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	//	equals: 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		//	전달받은 파라미터 obj 가 Point 인지 확인 필요
		if (obj instanceof Point) {
		//	Object -> Point 캐스팅
			Point other = (Point)obj;
			//	두 객체의 동등성
			//	두 객체의 x 필드가 같고, 두 객체의 y 필드가 같아야 동등하다
			return x == other.x && y == other.y;
				
		}
		//	obj 가 Point 가 아닌 경우
		return super.equals(obj);	//	부모에게 비교 방법을 위임
	}
	
	
	//	toStirng: 객체 정보를 문자열로 출력할 때 호출되는 메서드
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	
	
}
