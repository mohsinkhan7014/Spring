package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	@Value("#{5}")
	int x;
	
	Address address;

	public Student(Address address) {
		super();
		this.address = address;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Student [x=" + x + ", " + address + "]";
	}

	public Address getAddress() {
		
		return address;
	}

	public void setAddress(Address address) {
		
		this.address = address;
	}


	

}
