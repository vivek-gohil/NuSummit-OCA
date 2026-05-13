package com.nusummit.main;

import com.nusummit.main.domain.Employee;

public class ObjectMain {
	public static void main(String[] args) {
		System.out.println("main start");
		Employee employee1 = new Employee(); // 1
		employee1.setEmployeeId(101);
		employee1.setName("Rajkumar");
		employee1.setSalary(70000);
		System.out.println("EmployeeId = " + employee1.getEmployeeId());
		System.out.println("Name = " + employee1.getName());
		System.out.println("Salary = " + employee1.calculateSalary(1000, 0.2f));
		// employee1.printEmployeeDetails();

		System.out.println();

		Employee employee2 = new Employee(); // 2
		employee2.setEmployeeId(102);
		employee2.setName("Amit");
		employee2.setSalary(70000);
		System.out.println("EmployeeId = " + employee2.getEmployeeId());
		System.out.println("Name = " + employee2.getName());
		System.out.println("Salary = " + employee2.calculateSalary(1000, 0.2f));
		// employee2.printEmployeeDetails();
		System.out.println("main end");
	}
}
