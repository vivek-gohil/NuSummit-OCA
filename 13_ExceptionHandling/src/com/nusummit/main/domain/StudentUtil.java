package com.nusummit.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentUtil {

	private Student student = new Student();

	public void acceptDetails() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter studentId");
			int studentId = scanner.nextInt();

			System.out.println("Enter name");
			String name = scanner.next();

			System.out.println("Enter marks for 5 subjects");
			int[] marks = new int[5];
			for (int i = 0; i < 5; i++) {
				marks[i] = scanner.nextInt();
			}
			student.setStudentId(studentId);
			student.setName(name);
			student.setMarks(marks);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input From User");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is 5");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Opps.. try again");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("In finally");
			scanner.close();
		}
	}

}
