package com.nusummit.main;

import java.time.LocalDate;

public class LocalDateMain {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate customDate = LocalDate.of(2026, 5, 15);
		System.out.println(customDate);

		System.out.println("After 10 days :: " + customDate.plusDays(10));
		System.out.println("Before 2 months :: " + customDate.minusMonths(2));

	}
}
