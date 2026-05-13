package com.nusummit.main;

public class LoopsMain {
	public static void forLoopExample() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void whileLoopExample() {
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
	}

	public static void doWhileLoopExample() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);
	}

	public static void enhancedForLoopExample() {
		int[] numbers = { 10, 20, 30, 40, 50, 60 };

		for (int i : numbers) {
			System.out.println(i);
		}
	}

	public static void breakStatementExample() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}
	}

	public static void continueStatementExample() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
	}

	public static void nestedForLoopExample() {
		// Rows
		for (int i = 1; i <= 5; i++) {
			// Columns
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		System.out.println("Using For loop");
		forLoopExample();
		System.out.println("Using While loop");
		whileLoopExample();
		System.out.println("Using Do While loop");
		doWhileLoopExample();
		System.out.println("Using Enhanced For loop");
		enhancedForLoopExample();
		System.out.println("Break Statement");
		breakStatementExample();
		System.out.println("Continue Statement");
		continueStatementExample();
		System.out.println("Nested For loop Example");
		nestedForLoopExample();
		System.out.println("Print Sum");
		printSum();
	}
}
