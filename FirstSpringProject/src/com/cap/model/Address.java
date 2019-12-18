package com.cap.model;

public class Address {
private String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Address(String city) {
	super();
	this.city = city;
}

}