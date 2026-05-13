package com.nusummit.main;

import java.util.Scanner;

import com.nusummit.main.domain.Account;

public class AccountMain {
	public static void main(String[] args) {

		int transactionChoice;
		double amount;
		boolean transactionResult;
		String continueChoice;
		Scanner scanner = new Scanner(System.in);
		Account account1 = new Account();
		account1.setAccountNumber(101);
		account1.setName("Kalyan");
		account1.setBalance(100000);
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getName());
		System.out.println(account1.getBalance());
		do {
			System.out.println("Transaction Choice");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("Enter your choice");
			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to be withdraw");
				amount = scanner.nextDouble();
				transactionResult = account1.withdraw(amount);
				if (transactionResult == true) {
					System.out.println("Withdraw successfull!!");
					System.out.println("Updated Balance :: " + account1.getBalance());
				} else {
					System.out.println("Withdraw failed");
					System.out.println("Balance :: " + account1.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to be deposit");
				amount = scanner.nextDouble();
				transactionResult = account1.deposit(amount);
				if (transactionResult == true) {
					System.out.println("Deposit successfull!!");
					System.out.println("Updated Balance :: " + account1.getBalance());
				} else {
					System.out.println("Deposit failed");
					System.out.println("Balance :: " + account1.getBalance());
				}
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));

	}
}
