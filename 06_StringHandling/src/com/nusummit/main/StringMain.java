package com.nusummit.main;

public class StringMain {
	public static void main(String[] args) {
		String message = "Java is best";
		String msg = new String("Java is best");

		System.out.println(message);
		System.out.println(msg);

		// compare its memory address
		if (message == msg) {
			System.out.println("String are same");
		} else {
			System.out.println("Different");
		}

		// compare it values
		if (message.equals(msg)) {
			System.out.println("String are same");
		} else {
			System.out.println("Different");
		}

		// String is immutable object
		message = message + " programming language";
		System.out.println(message);

		System.out.println("-------------------");
		System.out.println("Using String builder - Mutable class");
		// StringBuilder and StringBuffer
		StringBuilder stringBuilder = new StringBuilder("Hello");
		System.out.println(stringBuilder);
		stringBuilder.append(" World");
		System.out.println(stringBuilder);

		System.out.println("-------------------");
		System.out.println("Using StringBuffer - Mutable class");
		StringBuffer stringBuffer = new StringBuffer("Testing");
		System.out.println(stringBuffer);
		stringBuffer.append(" java code");
		System.out.println(stringBuffer);
	}
}
