package com.nusummit.main.util;

public class StaticDemo {

	private int numberOne = 10;
	// There will be only one instance available in memory
	private static int numberTwo = 10;

	public void display() {
		System.out.println("non static numberOne = " + numberOne); // 10
		System.out.println("static numberTwo = " + numberTwo); // 10
		numberOne += 5;
		numberTwo += 5;
		System.out.println("non static numberOne = " + numberOne); // 15
		System.out.println("static numberTwo = " + numberTwo); // 15
	}

	public static void printNumbers() {
		// System.out.println(numberOne); // Error - as numberOne is non static,
		// printNumber() is static method
		System.out.println(numberTwo);
	}
}
