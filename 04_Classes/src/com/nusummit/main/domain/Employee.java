package com.nusummit.main.domain;

public class Employee {
	// Instance level variables - private - accessible within the class only
	private int employeeId;
	private String name;
	private double salary;

	// Constructor - default constructor
	// 1. Method without return type
	// 2. It has same name as of class
	// 3. No need to call constructor, it invoke automatically at the time object
	// creation
	public Employee() {
		System.out.println("Employee default constructor called!!");
	}

	// Constructor overloading - as my class has an existing default constructor
	public Employee(int employeeId, String name, double salary) {
		System.out.println("Employee overloaded constructor called!!");
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	// Method - non static method - public - accessible outside the class
	public void printEmployeeDetails() {
		System.out.println("EmployeeId = " + employeeId);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
	}

	public double calculateSalary(double bonus, float tax) {
		double grossSalary = salary + bonus;
		return grossSalary - (grossSalary * tax);
	}

	// Method with parameters - Setter methods
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Method with return type - Getter Methods
	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

}
