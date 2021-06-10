package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean  {
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "(B):::  Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("(A) ::::This is called for property set of pepsi initiolizing method");
		
	}

	public void destroy() throws Exception {
       System.out.println("(C)::::Pepsi Object is destrooyig");
		
	}
	

}
