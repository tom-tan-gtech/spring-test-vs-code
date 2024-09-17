package com.tomtan.spring_test_vs_code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	@Autowired
	@Qualifier(value="first_address") // specifies to use the first_address
	private Address address;

	public Student () {

	}

	public Student(Address address) {
		this.address = address;
	}

	public void showInfo() {
		System.out.println("Address is: " + address);
	}
}
