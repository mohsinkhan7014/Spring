package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	@Bean
	public Address getAddress()
	{
				Address a=new Address();
				a.setAdd("Ajam Market Station Road Makrana ");
				return a;
	}
	@Bean(name={"firstStudent","Temp"})
	public Student getStudent()
	{
		return new Student(getAddress());
	}

}
