package com.nusummit.main;

import java.time.LocalTime;

public class LocalTimeMain {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalTime specificTime = LocalTime.of(15, 3);
		System.out.println(specificTime);

		System.out.println("After 2 hours :: " + specificTime.plusHours(2));
		System.out.println("Before 15 minutes :: " + specificTime.minusMinutes(15));

	}
}
