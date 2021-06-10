package com.springcore1.core1Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore1/core1Collection/newconfig.xml");
		Student1 s=(Student1) context.getBean("student1");
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getPhones());
		System.out.println(s.getLogin());
	}

}
