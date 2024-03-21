package com.javaex.basic.reftype;

public class ArrayMultiDimEx {

	public static void main(String[] args) {
		//	2차원 배열 선언
		int [] [] twoDimen = new int [5] [10];	// 5 * 10
		
		int [] [] table = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
				{3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
				{4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
				{5, 6, 7, 8, 9, 10, 11, 12, 13, 14}
		};	//5행 10열 배열
		
		System.out.println(table);
		
		System.out.println("table.length: " + table.length);
		
		System.out.println("table[0].length: " + table[0].length);
		
		int sum = 0;	//	내부 데이터 합산

		//	행 루프
		for (int row = 0; row < table.length; row++) {
			//	열 루프
			for (int ii = 0; ii < table[row].length; ii++) {
				System.out.print(table[row][ii] + "\t");
				sum += table[row][ii];
			}
			System.out.println();
		}
		System.out.println("총합: " + sum);
	}

}
