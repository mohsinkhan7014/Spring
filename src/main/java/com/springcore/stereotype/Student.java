package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.*;

@Component("mystereoObj")
@Scope("prototype")
public class Student {
	@Value("Mohsin")
	private String name;
	@Value("Makrana")
	private String city;
	@Value("#{mymap}")
	private Map<String,Integer> marks;
	
	
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	

}
