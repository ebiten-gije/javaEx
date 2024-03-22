package com.javaex.oop.goods.v2;

//	v.2 필드
public class Goods {
	//	필드 선언
	//	instance 영역
	private String name;	//	상품명

	private int price;		//	가격
			
	//	Getter Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//	일반 메서드
	public void showInfo() {
		System.out.printf("상품 이름: %s%n가격: %,d원%n", name, price);
	}
	
}
