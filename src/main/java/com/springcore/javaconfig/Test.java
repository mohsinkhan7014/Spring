package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/javaconfig/javaconfig.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student st=context.getBean("student",Student.class);
		
		//if i remove @componaant then i have to give thw bean details here which constructor i am returning 
		//now i do't need componant scan packagr declaration 
		Student st=context.getBean("Temp",Student.class);
		System.out.println(st);
	}

}
