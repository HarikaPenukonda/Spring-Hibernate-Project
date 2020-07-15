package com.udemy.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		// check if they are same
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n pointing to the same object: " + result);
		
		System.out.println("\n memory location of theCoach: " + theCoach);
		
		System.out.println("\n memory location of alphaCoach: " + alphaCoach + "\n");
		
		context.close();
		
		/* scope : singleton
		 * pointing to the same object: true
		 * memory location of theCoach: com.udemy.SpringDemo.TrackCoach@72e5a8e
		 * memory location of alphaCoach: com.udemy.SpringDemo.TrackCoach@72e5a8e*/
		
		/* scope : prototype
		 * pointing to the same object: false
		 * memory location of theCoach: com.udemy.SpringDemo.TrackCoach@72e5a8e
		 * memory location of alphaCoach: com.udemy.SpringDemo.TrackCoach@54e1c68b*/

	}

}
