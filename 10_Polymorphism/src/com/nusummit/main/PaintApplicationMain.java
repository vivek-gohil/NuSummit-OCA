package com.nusummit.main;

import java.util.Scanner;

public class PaintApplicationMain {
	public static void main(String[] args) {
		Shapes shapes = null;
		int shapeChoice;
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Line");
		System.out.println("Enter your choice");
		shapeChoice = scanner.nextInt();

		switch (shapeChoice) {
		case 1:
			
			//Upcasting 
			shapes = new Circle();
			break;
		case 2:
			shapes = new Triangle();
			break;
		case 3:
			shapes = new Line();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

		shapes.draw();
		if (shapeChoice > 0 && shapeChoice < 4) {
			shapes.draw(); // ??
		}
	}
}
