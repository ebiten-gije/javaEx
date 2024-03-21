package com.javaex.oop.methods;

public class Ex1 {
	public static void main(String[] args) {
        int[] numbers = {7, 5, 11, 2, 8, 4};
        
        int max = findMax(numbers);
        int min = findMin(numbers);
        
        System.out.println("배열의 최댓값: " + max);
        System.out.println("배열의 최솟값: " + min);
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

