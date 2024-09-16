package com.tomtan.spring_test_vs_code;

public class Student {
	private Address address;

	public Student(Address address) {
		this.address = address;
	}

	public void showInfo() {
		System.out.println("Address is: " + address);
	}
}
