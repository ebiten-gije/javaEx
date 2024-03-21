package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.name = "nikon";
		camera.price = 400_000;
		
		//	상품 정보 출력
		System.out.printf("%s, %,d원%n", camera.name, camera.price);
	
		Goods gram = new Goods();
		
		gram.name = "LG그램";
		gram.price = 900_000;
		
		System.out.printf("%s, %,d원%n", gram.name, gram.price);
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2_000;
		
		System.out.printf("%s, %,d원%n", cup.name, cup.price);
	}

}
