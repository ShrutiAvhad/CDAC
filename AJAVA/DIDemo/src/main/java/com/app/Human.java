package com.app;

public class Human {
	 
	private Heart heart;

	public Human() {
		System.out.println("Default constructor of Human..");
	}

	public Human(Heart heart) {
		super();
		System.out.println("Parameterized constructor of Human..");
		this.heart = heart;
	}
	
	//setter injection 
	public void setHeart(Heart heart)
	{
		System.out.println("Setter Called..");
		this.heart = heart;
	}
	
	public void pump()
	{
		if(heart != null)
		{
			heart.pumping();
		}
		else
		{
			System.out.println("You are dead..");
		}
	}
	
	
	
}
