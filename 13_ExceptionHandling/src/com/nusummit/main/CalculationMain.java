package com.nusummit.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationMain {
	public static void main(String[] args) {
		try {
			int numberOne, numberTwo, result;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter numberOne");
			numberOne = scanner.nextInt();
			System.out.println("Enter numberTwo");
			numberTwo = scanner.nextInt();
			result = numberOne + numberTwo;
			System.out.println("Result = " + result);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input!!");
		}
	}
}
