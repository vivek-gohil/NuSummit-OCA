package com.nusummit.main.domain;

//A class can implement more than one interfaces but extends only one other class
public class MyClass extends MyParent implements MyInterface, YourInterface {

	public MyClass() {
		test();
	}

	private void test() {
		System.out.println("Testing");
	}

	@Override
	public void show() {
		System.out.println("Hi");
	}

	@Override
	public void greet() {
		System.out.println("Hello");
	}

	@Override
	public void display() {
		System.out.println("Display !!");

	}

}
