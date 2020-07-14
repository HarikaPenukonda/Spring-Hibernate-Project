package com.udemy.SpringDemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	
	public TrackCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! "+fortuneService.getFortune();
	}

}
