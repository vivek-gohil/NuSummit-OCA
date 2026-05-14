package com.nusummit.main.domain;

//Pure abstract in nature - till JDK 7 
//In JDK 8 - default method in interfaces - not pure abstract
public interface MyInterface {
	void show();

	void greet();
	// public abstract void show();
	// public abstract void greet();

	
	default void info() {
		System.out.println("This is default method");
	}
}
