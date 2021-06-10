package com.springcore.ref;

public class Details {
	int rollno;
	String name;
	ExamResult er;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(int rollno, String name, ExamResult er) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.er = er;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ExamResult getEr() {
		return er;
	}
	public void setEr(ExamResult er) {
		this.er = er;
	}
	@Override
	public String toString() {
		return "Details [rollno=" + rollno + ", name=" + name + ", er=" + er + "]";
	}
	

}
