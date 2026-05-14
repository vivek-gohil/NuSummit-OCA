package com.nusummit.main.domain;

public abstract class Printer {
	// No body only declaration - child class will provide body/implementation
	public abstract void doPrinting();

	//Abstract class can have non abstract method
	public void test() {
		System.out.println("This is testing method");
	}
}
