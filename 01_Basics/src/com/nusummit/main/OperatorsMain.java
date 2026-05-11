package com.nusummit.main;

public class OperatorsMain {
	public static void testArithmaticOperators() {
		// local variables
		int a = 10;
		int b = 3;

		System.out.println("Addition :: " + (a + b));
		System.out.println("Subtraction :: " + (a - b));
		System.out.println("Multiplication :: " + (a * b));
		System.out.println("Division :: " + (a / b));
		System.out.println("Modulus :: " + (a % b));
	}

	public static void testUnariOperators() {
		// local variable
		int x = 5;

		System.out.println("Orignal x = " + x); // 5
		System.out.println("Pre Increment = " + (++x)); // 6
		System.out.println("Post Increment = " + (x++)); // 6 but in memory value of x is 7
		System.out.println("After Post Increment = " + x); // 7

		System.out.println("Pre Decrement = " + (--x)); // 6
		System.out.println("Post Decrement = " + (x--)); // 6 but in memory value of x is 5
		System.out.println("After Post Decrement = " + x); // 5
	}

	public static void testRelationalOperators() {
		int a = 20;
		int b = 10;

		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a >= b); // true
		System.out.println(a <= b); // false
	}

	public static void testLogicalOperators() {
		int age = 25;
		boolean hasLicense = true;

		System.out.println(age >= 18 && hasLicense); // T && T = T
		System.out.println(age < 18 && hasLicense); // F && T = F

		System.out.println(age < 18 || hasLicense); // F || T = T
		System.out.println(!hasLicense); // false
	}

	public static void testAssignmentOperators() {
		int num = 10;
		num += 5; // num = num + 5
		System.out.println(num); // 15

		num -= 2;
		System.out.println(num); // 13

	}

	public static void testOperatorPrecedence() {
		int result = 10 + 5 * 2;
		System.out.println(result);

	}

	public static void main(String[] args) {
		System.out.println("1. Testing Arithmatic Operators");
		testArithmaticOperators();

		System.out.println();

		System.out.println("2. Testing Unary Operators");
		testUnariOperators();

		System.out.println();

		System.out.println("3. Testing Relational Operators");
		testRelationalOperators();

		System.out.println();

		System.out.println("4. Testing Logical Operators");
		testLogicalOperators();

		System.out.println();

		System.out.println("5. Testing Assignment Operators");
		testAssignmentOperators();
		
		System.out.println("6. Testing Operator Precedence");
		testOperatorPrecedence();
	}

}
