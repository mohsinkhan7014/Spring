package com.springcore.constructorinjection;

public class Certificate {
    String cName;
	public Certificate(String cName)
	{
		this.cName=cName;
	}
	@Override
	public String toString() {
		
		return this.cName;
	}
	

}
