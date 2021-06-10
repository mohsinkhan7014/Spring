package com.springcore1.core1;

public class Employ {

	String name;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("NAme is Setting ");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Address is Setting ");
		this.address = address;
	}
	public Employ(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + ", address=" + address + "]";
	}
	
}
