package com.springcore1.core1Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student1 {
	String name;
	List<String> phones;
	Map<String, String> course;
	Properties login;
	public Properties getLogin() {
		return login;
	}
	public void setLogin(Properties login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Student1(String name, List<String> phones, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", phones=" + phones + ", course=" + course + ", login=" + login + "]";
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, List<String> phones, Map<String, String> course, Properties login) {
		super();
		this.name = name;
		this.phones = phones;
		this.course = course;
		this.login = login;
	}
	

}
