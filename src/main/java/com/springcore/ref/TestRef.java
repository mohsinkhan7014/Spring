package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
	

	public static void main(String[]arg)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		Details d=(Details)context.getBean( "detailsRef");
		System.out.println("Name of Student : " +d.getName());
		System.out.println("Roll no :"+d.getRollno());
		System.out.println("PCM MArks :"+d.getEr());
		System.out.println("Percentage of PCM is : "+((100*(d.getEr().getP()+d.getEr().getC()+d.getEr().getM()))/300)+"%");
		System.out.println(d);
		
	}

}
