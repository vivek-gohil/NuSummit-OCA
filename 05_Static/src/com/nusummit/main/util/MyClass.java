package com.nusummit.main.util;

public class MyClass {

	static {
		System.out.println("static blocked called");
	}

	public MyClass() {
		System.out.println("default constructor of MyClass called");
	}

	public void greet() {
		System.out.println("greet() - non static function called");
	}

	public static void show() {
		System.out.println("show() - static function called");
	}
}
