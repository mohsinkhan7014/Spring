package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
	String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Subject [sub=" + sub + "]";
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start()
	{
		System.out.println("initializing Method with Annonation ");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("DEstroing method with annonatioj");
	}

}
