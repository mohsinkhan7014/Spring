package com.springcore1.core1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("IOC will Create object automatically ");
        ApplicationContext context=new ClassPathXmlApplicationContext("myconfig.xml");
        Employ e=(Employ) context.getBean("emp1");
        System.out.println((Employ)context.getBean("emp"));
        System.out.println((Employ)context.getBean("emp3"));
        System.out.println(e);
     
    }
}
