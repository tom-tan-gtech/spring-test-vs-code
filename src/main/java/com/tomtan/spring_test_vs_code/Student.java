package com.tomtan.spring_test_vs_code;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	@Autowired
	private Address address;

	public Student(Address address) {
		this.address = address;
	}

	public void showInfo() {
		System.out.println("Address is: " + address);
	}
}
