package com.springcore.lifecycle;

public class Student {
	int rollno;
	String name;
	public Student() {
		super();
		System.out.println("(Object is creating)Using non parameterize Constructor");
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
				System.out.println("(Object is creating)Using parameterize Constructor");
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public int getRollno() {
		
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("(object properties is setting) by roll is setting by method");
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("(object properties is setting) by (name  is setting by method name)");
		this.name = name;
	}
	
	public void init()
	{

		System.out.println("(Object is initiing)This is From Init Method");
	}
	public void destroy()
	{
		System.out.println("(Object is destroying)From Destroy MEthod");
	}

}
