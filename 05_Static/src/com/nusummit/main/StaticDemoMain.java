package com.nusummit.main;

import com.nusummit.main.util.StaticDemo;

public class StaticDemoMain {
	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		demo.display(); // 10 10 15 15

		System.out.println();

		StaticDemo demo2 = new StaticDemo();
		demo2.display(); // 10 15 15 20
		
		System.out.println();
		
		StaticDemo.printNumbers();
	}
}

// Static Keyword
// 1. static variables 
		//- There will be only one instance available in memory
// 2. static methods 
		//- Contains only static variables and call only static methods
		//- Call static methods without creating object, with reference of class name
// 3. static block 
		//- will get called at the time of class loaded in JVM