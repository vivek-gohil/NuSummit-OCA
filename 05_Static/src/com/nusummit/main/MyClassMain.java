package com.nusummit.main;

import com.nusummit.main.util.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		// Static block will get call at the time of class loading.
		MyClass.show(); // No need to create object to call static method
	}
}
