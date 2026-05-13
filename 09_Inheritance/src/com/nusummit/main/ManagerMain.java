package com.nusummit.main;

import com.nusummit.main.domain.Manager;

public class ManagerMain {
	public static void main(String[] args) {

		// call default constructor of Employee - bcos Employee is a parent class of
		// Manager
		// call default constructor of Manager
		// Manager manager = new Manager();

		// call overloaded constructor of Employee - bcos Employee is a parent class of
		// call overloaded constructor of Manager
		Manager manager = new Manager(101, "Test", 60000, 1000);
	}
}
