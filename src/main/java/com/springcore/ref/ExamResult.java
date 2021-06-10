package com.springcore.ref;

public class ExamResult {
	private int p;
	private int c;
	private int m;
	@Override
	public String toString() {
		return "ExamResult [p=" + p + ", c=" + c + ", m=" + m + "]";
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public ExamResult(int p, int c, int m) {
		super();
		this.p = p;
		this.c = c;
		this.m = m;
	}
	public ExamResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
