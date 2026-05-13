package com.nusummit.main;

import com.nusummit.main.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		// To call default constructor
		Account account = new Account();

		System.out.println();

		// To call overloaded constructor
		Account account2 = new Account(1011, "Seema", 10000);

	}
}
