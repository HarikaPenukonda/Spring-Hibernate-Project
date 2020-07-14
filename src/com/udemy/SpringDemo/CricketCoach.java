package com.udemy.SpringDemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	// create no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	// create a setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricketCoach : inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
