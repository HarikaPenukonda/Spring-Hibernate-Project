package com.udemy.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(" pointing to the same object " +result);
		
		System.out.println(" memory location of theCoach " +theCoach);
		
		System.out.println(" memory location of alphaCoach " +alphaCoach);
		
		context.close();

	}

}
