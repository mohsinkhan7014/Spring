package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		Demo d=con.getBean("demo",Demo.class);
		System.out.println(d);
		SpelExpressionParser sep=new SpelExpressionParser();
		System.out.println(sep.parseExpression("12+7987").getValue());

	}

}
