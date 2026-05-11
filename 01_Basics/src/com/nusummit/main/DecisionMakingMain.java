package com.nusummit.main;

public class DecisionMakingMain {

	public static void main(String[] args) {
		System.out.println("1. Simple if statement");
		int age = 25;

		if (age >= 18) {
			System.out.println("Eligible for voting");
			System.out.println("Your age is " + age);
		}

		System.out.println();

		System.out.println("2. If else statement");
		int number = 7;

		if (number % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");

		System.out.println();

		System.out.println("3. Nested If");
		boolean hasLicense = true;

		if (age >= 18) {
			if (hasLicense) {
				System.out.println("Can drive");
			} else {
				System.out.println("Sorry.. Cannot drive");
			}
		} else {
			System.out.println("Invalid Age");
		}

		System.out.println();

		System.out.println("4. Switch Case");
		int day = 30;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
			break;
		}

		System.out.println("5. Switch Case - String");
		String role = "ADMIN";
		switch (role) {
		case "ADMIN":
			System.out.println("Full Access");
			break;
		case "USER":
			System.out.println("Limited Access");
			break;
		default:
			System.out.println("Guest Access");
			break;
		}
	}
}
