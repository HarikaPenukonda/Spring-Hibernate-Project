package com.udemy.SpringDemo;

public class GolfCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService fortuneService)
	{	
		System.out.println("GolfCoach : inside constructor");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Job well done!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff()
	{
		System.out.println(" Trackcoach : inside the method - doMyStartupStuff ");
	}
	
	// add a destroy method 
	public void doMyCleanupStuff()
	{
		System.out.println(" Trackcoach : inside the method - doMyCleanupStuff ");
	}

}
