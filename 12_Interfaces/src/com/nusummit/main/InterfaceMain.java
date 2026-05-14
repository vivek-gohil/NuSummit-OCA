package com.nusummit.main;

import com.nusummit.main.domain.MyClass;
import com.nusummit.main.domain.MyInterface;

public class InterfaceMain {
	
	
	public static void main(String[] args) {
		// You cannot create object of interface
		MyInterface myInterface;

		myInterface = new MyClass();

		myInterface.greet();
		myInterface.show();

		System.out.println();

		MyClass myClass = new MyClass();
		myClass.show();
		myClass.greet();
		myClass.display();
		myClass.print();

	}

}
