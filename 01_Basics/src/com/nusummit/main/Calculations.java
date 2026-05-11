package com.nusummit.main;

import java.util.Scanner;

public class Calculations {

	// variables - CamelCase
	static double numberOne, numberTwo, result;

	// methods - CamelCase
	public static void setValue() {
		//numberOne = 10;
		//numberTwo = 20;
		//Accept values from user - user input using Scanner
		//Creating object of Scanner class 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number one");
		numberOne = scanner.nextDouble();
		System.out.println("Enter number two");
		numberTwo = scanner.nextDouble();
	}
	
	// methods - CamelCase
	public static void addition() {
		result = numberOne + numberTwo;
	}
	
	// methods - CamelCase
	public static void printResult() {
		System.out.println("Result of Addition :: " + result);
	}

	public static void main(String[] args) {
		System.out.println("main start");
		setValue();
		addition();
		printResult();
		System.out.println("main end");
	}
}
//Everything is static in our program
// All variables are static
// All methods are static
// main method is static

// Rule = Static function contains only static variables and call only static methods
