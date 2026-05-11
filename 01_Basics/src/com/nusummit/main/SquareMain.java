package com.nusummit.main;

import java.util.Scanner;

//Write a Java program to accept number from user and print square of same.
//Create two functions 
	//1. Accept number from user
	//2. Calculate square of number
// Call both function from main
//Example of Class name = PascalCase =  CalculationUtil - Every word first letter caps 
//Example of Method name = CamelCase = calculateSqure - First word first letter small but second word onwrds every word first letter will be caps
// printUserDetails();
// acceptLowerCaseString();

//snake_case = user_details - Database
//kabab-case = user-details - Angular,Node JS
public class SquareMain {
	
	//Variables - camelCase 
	static int number,result;
	
	//To accept number from user
	static void acceptNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		number = scanner.nextInt();
	}
	
	//To calculate square of number
	static void calcuateSquare() {
		result = number * number;
		System.out.println("Square of number is :: " + result);
	}
	
	public static void main(String[] args) {
		acceptNumber();
		calcuateSquare();
		System.out.println("Square of number is :: " + result);
	}
}
