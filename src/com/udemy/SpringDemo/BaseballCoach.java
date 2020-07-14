package com.udemy.SpringDemo;

public class BaseballCoach implements Coach {
	
	// define a private feild for the dependency
	private FortuneService fortuneService; // Define feild
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) // Define constructor
	{
		this.fortuneService = theFortuneService; 
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spending 30 minutes in batting cage";
	}

	@Override
	public String getDailyFortune() {
		// use FortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
