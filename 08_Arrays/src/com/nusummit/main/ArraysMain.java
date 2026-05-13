package com.nusummit.main;

public class ArraysMain {
	public static void main(String[] args) {
		// Declare array
//		int[] numbers = new int[5];

// Initializing array
//		numbers[0] = 10;
//		numbers[1] = 20;
//		numbers[2] = 30;
//		numbers[3] = 40;
//		numbers[4] = 50;

		int[] numbers = { 10, 20, 30, 40, 50 };

		// Printing elements of array - foreach loop - read only - you cannot change
		// original array
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println();

		// Printing elements of array - for loop - you can change value of array using
		// index
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
