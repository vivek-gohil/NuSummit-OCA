package com.nusummit.main;

import com.nusummit.main.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("main start");
		Employee employee = new Employee(); // As we are creating object it will invoke default constructor
		employee.printEmployeeDetails();
		
		System.out.println();
		
		Employee employee2 = new Employee(101, "Seema", 90000);
		employee2.printEmployeeDetails();

		System.out.println("main end");
	}
}
