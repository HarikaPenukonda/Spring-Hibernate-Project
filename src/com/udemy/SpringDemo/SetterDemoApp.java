package com.udemy.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
	// load the spring configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	// retrieve bean from spring container
	/* The CricketCoach class has four methods: getDailyWorkout, getDailyFortune, getTeam and setTeam 
	 * The Coach interface has two methods: getDailyWorkout and getDailyFortune*/
	CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
	// call methods on the bean
	System.out.println(theCoach.getDailyWorkout());	
	System.out.println(theCoach.getDailyFortune());
	// call the new methods to get the literal values
	System.out.println(theCoach.getEmailAddress());
	System.out.println(theCoach.getTeam());
	// close the context
	context.close();
	}

}
