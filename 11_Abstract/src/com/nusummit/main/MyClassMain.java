package com.nusummit.main;

import com.nusummit.main.domain.MyChildClass;
import com.nusummit.main.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		// MyClass myClass = new MyClass(); // you cannot create object of MyClass -
		// Abstract Class

		MyClass myClass = null; // we are not creating object - its a variable/reference

		// Upcasting - we can call only common methods which present in both classes and
		// all methods of parent class
		myClass = new MyChildClass(); // We can assign child class object to base class reference - Polymorphism

		myClass.display();
		
		// Inorder to call show function - we need Downcasting - avoid doing this as its costly or not safe 
		MyChildClass myChildClass = (MyChildClass) myClass;
		myChildClass.show();
	}
}
