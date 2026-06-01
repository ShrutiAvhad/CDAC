package com.app.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public String addSilly()
	{
		return getClass() + "Doing my memDB work" + "Adding an membership account";
	}
	
	public void goToSleep()
	{
		System.out.println(getClass() + "I am going to sleep now");
	}
}
