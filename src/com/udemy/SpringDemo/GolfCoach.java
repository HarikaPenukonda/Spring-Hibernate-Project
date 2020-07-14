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

}
