package com.nusummit.main;

import java.util.Scanner;

import com.nusummit.main.domain.Student;

public class StudentMain {
	public static void main(String[] args) {
		// Create object of Student class
		Student student = new Student();

		// Accept values from user ( studentId,name,marks of 5 subjects) and set values
		int studentId;
		String name;
		int[] marks = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter studentId");
		studentId = scanner.nextInt();
		System.out.println("Enter name");
		name = scanner.next();
		System.out.println("Enter marks of 5 subjects");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextInt();
		}

		student.setStudentId(studentId);
		student.setName(name);
		student.setMarks(marks);

		// Display accepted values - get values
		System.out.println("Student Id = " + student.getStudentId());
		System.out.println("Name = " + student.getName());
		System.out.println("Marks in each subjects");
		for (int i : marks) {
			System.out.println(i);
		}

	}
}
