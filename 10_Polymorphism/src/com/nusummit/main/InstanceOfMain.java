package com.nusummit.main;

public class InstanceOfMain {
	public static void main(String[] args) {
		
		//instanceof is used to check whether an object belongs to a particular class or not. 
		Circle circle = new Circle();
		
		System.out.println(circle instanceof Circle);  // true
		
		System.out.println(circle instanceof Shapes); // true
		
		
	}
}
