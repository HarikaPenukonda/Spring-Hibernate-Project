package com.udemy.SpringDemo;

public class SwimmingCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout () {
		return "Do 100 laps daily";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
