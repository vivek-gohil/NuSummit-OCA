package com.nusummit.main;

import com.nusummit.main.domain.Student;
import com.nusummit.main.domain.StudentUtil;

public class StudentMain {
	public static void main(String[] args) {
//		Student student = new Student();
//
//		int studentId = 101;
//		String name = "Seema";
//		int[] marks = new int[5];
//
//		marks[0] = 8;
//		marks[1] = 9;
//		marks[2] = 7;
//		marks[3] = 10;
//		marks[4] = 8;
//		//marks[5] = 8; ArrayIndexOutOfBoundsException
//
//		student.setStudentId(studentId);
//		student.setName(name);
//		student.setMarks(marks);
//
//		System.out.println("StudentId :: " + student.getStudentId());
//		System.out.println("Name :: " + student.getName());
//		System.out.println("Marks");
//		for (int m : student.getMarks()) {
//			System.out.println(m);
//		}

		StudentUtil studentUtil = new StudentUtil();
		studentUtil.acceptDetails();
	}
}
