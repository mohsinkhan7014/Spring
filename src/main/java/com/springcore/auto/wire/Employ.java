package com.springcore.auto.wire;

public class Employ {
	String name;
	Address address;
	public Employ(Address address) {
		super();
		System.out.println("Address Value is Seeting by Constructor bacuase autowire mode is constructor but name is seeting by  setname setter");
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Name is Setting by Seeter using p schema ");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
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
