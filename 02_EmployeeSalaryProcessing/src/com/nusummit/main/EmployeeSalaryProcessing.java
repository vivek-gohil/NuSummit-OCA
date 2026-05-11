package com.nusummit.main;

import java.util.Scanner;

public class EmployeeSalaryProcessing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String employeeType = "";
		int experience = 0;
		double baseSalary = 0.0;

		double bonus = 0.0; // calculated
		double grossSalary = 0.0; // calculated
		double tax = 0.0; // calculated
		double finalSalary = 0.0;

		// Input Section
		System.out.println("Enter Employee Type Full Time(F) / Part Time (P) :: ");
		employeeType = scanner.next();

		System.out.println("Enter Experience (years) :: ");
		experience = scanner.nextInt();

		System.out.println("Enter Base Salary :: ");
		baseSalary = scanner.nextDouble();

		// Using switch case for checking employeeType
		switch (employeeType) {
		case "F":
		case "f":
			// Nested if for full time employees and calculate bonus
			if (experience > 10)
				bonus = baseSalary * 0.20;
			else if (experience > 5)
				bonus = baseSalary * 0.10;
			else
				bonus = baseSalary * 0.05;
			break;
		case "P":
		case "p":
			// Nested if for part time employees and calculate bonus
			if (experience > 5)
				bonus = baseSalary * 0.08;
			else
				bonus = baseSalary * 0.05;
			break;
		default:
			System.out.println("Invalid Employee Type");
			break;
		}

		// Calculate gross salary after bonus
		grossSalary = baseSalary + bonus;

		// Tax Calculations
		if (grossSalary > 100000)
			tax = grossSalary * 0.10;
		else if (grossSalary > 50000)
			tax = grossSalary * 0.05;
		else
			tax = grossSalary * 0.02;

		// Calculate Final Salary
		finalSalary = grossSalary - tax;

		System.out.println();

		// Print Output
		System.out.println("============= Salary Details =============");
		System.out.println("Base Salary :: " + baseSalary);
		System.out.println("Bonus :: " + bonus);
		System.out.println("Gross Salary :: " + grossSalary);
		System.out.println("Tax Deduction :: " + tax);
		System.out.println("Final Salary :: " + finalSalary);
	}
}
