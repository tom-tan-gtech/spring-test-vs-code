package com.tomtan.spring_test_vs_code;

public class Student {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void initStudent() {
		System.out.println("This is the init() method");
	}

	// this is not called when the scope="prototype"
	public void destroyStudent() {
		System.out.println("This is the destroy() method");
	}
}
