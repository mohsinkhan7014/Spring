package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		//by deafult it will take as a student of Student class as a Camel cashe
		//Student s=context.getBean("student",Student.class);
		
		Student s=context.getBean("mystereoObj",Student.class);
//		System.out.println(s);
//		System.out.println(s.getMarks().getClass().getName());
		//System.out.println(s.hashCode());

		
		//this is siglton
		//measn ioc conatiner by default make singlton obj measn same hash code for differnet object 
		//in actuallly it will make only one object every time whenever we call it it will return same singlton object
		
		//System.out.println(context.getBean("mystereoObj",Student.class).hashCode());
		
		
		Teacher t1=(Teacher) context.getBean("teacher");
		Teacher t2=(Teacher) context.getBean("teacher");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
