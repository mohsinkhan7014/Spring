package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/studentconfig.xml");
		Student  s=(Student) context.getBean("student");
		System.out.println(s);
		//init can be call by ApplicationContext
		//it will call destroy method by abstract class method 
	    context.registerShutdownHook();
	    
	    Pepsi p=(Pepsi)context.getBean("pepsi");
	    System.out.println(p);
	    
	    Subject ws=(Subject) context.getBean("subject");
	    System.out.println(ws);
		

	}

}
