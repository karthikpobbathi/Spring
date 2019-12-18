package com.capgemini.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
	@Autowired
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
