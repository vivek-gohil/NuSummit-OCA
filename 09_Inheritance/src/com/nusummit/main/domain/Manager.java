package com.nusummit.main.domain;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
		System.out.println("Default constructor of Manager");
	}

	public Manager(int employeeId, String name, double salary, double bonus) {
		super(employeeId, name, salary); // call overloaded constructor of Employee class
		this.bonus = bonus;
		System.out.println("Overloaded constructor of Manager");
	}

}
