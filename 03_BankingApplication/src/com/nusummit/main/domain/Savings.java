package com.nusummit.main.domain;

//Inheritance - allows child class to access parents public and protected variables and function
public class Savings extends Account {

	// isSalary = true - zero balance
	// isSalary = false - need to maintain minimum balance
	private boolean isSalary;
	private double minimumBalance = 1500;

	// function overriding
	public boolean withdraw(double amount) {
		// check if you have salary account - zero balance account
		if (isSalary == true) {
			if (amount > 0 && amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
		} else {
			if (amount > 0 && getBalance() - amount >= minimumBalance) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}

	// function overriding
	public boolean deposit(double amount) {
		return false;
	}
}
