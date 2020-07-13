package com.udemy.SpringDemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout()
	{
		return "Spending 30 minutes in batting cage";
	}

}
