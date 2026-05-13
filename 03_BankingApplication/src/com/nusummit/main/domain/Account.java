package com.nusummit.main.domain;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	// create default constructor
	public Account() {
		System.out.println("Account default constructor called");
	}

	// create overloaded constructor
	public Account(int accountNumber, String name, double balance) {
		System.out.println("Account overloaed constructor called");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	// New Java class AccountMainV2 and call both constructors by creating object

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Create getter methods
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	// withdraw - amount
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	// deposit - amount
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

	public void printAccountDetails() {
		System.out.println("Account Number = " + accountNumber);
		System.out.println("Name = " + name);
		System.out.println("Balance = " + balance);
	}
}
