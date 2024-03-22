package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(400_000);
	
		Goods gram = new Goods();
		
		gram.setName("LG그램");
		gram.setPrice(900_000);
		
		Goods cup = new Goods();
		
		cup.setName("머그컵");
		cup.setPrice(2_000);
		
		//	상품 정보 출력(getter 활용)
		System.out.printf("%s, %,d원%n", camera.getName(), camera.getPrice());
		System.out.printf("%s, %,d원%n", gram.getName(), gram.getPrice());
		System.out.printf("%s, %,d원%n", cup.getName(), cup.getPrice());
		
		//	상품 정보 출력(메서드 활용)
		camera.showInfo();
		gram.showInfo();
		cup.showInfo();
	}

}
