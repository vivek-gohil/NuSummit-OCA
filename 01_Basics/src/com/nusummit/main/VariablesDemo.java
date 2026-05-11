package com.nusummit.main;

public class VariablesDemo {
	// instance level variable - declared in class, instance variables get the default value
	static int y;

	public static void main(String[] args) {

		// Local variable - declared in method, Local variables do NOT get default value
		int x = 10;
		System.out.println("local variable x = " + x);
		System.out.println("instance variable y = " + y);
	}
}
