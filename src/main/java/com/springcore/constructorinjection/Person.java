package com.springcore.constructorinjection;
import java.util.*;

public class Person {

	private String name;
	private int id;
	Certificate certificate;
	List<String> phones;
	
	public Person(String name,int id, Certificate certificate ,List<String> phones)
	{
		
		this.name=name;
		this.id=id;
		this.certificate=certificate;
		this.phones=phones;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+":"+this.id+"  "+this.certificate.cName+""+this.phones;
	}
	
}
