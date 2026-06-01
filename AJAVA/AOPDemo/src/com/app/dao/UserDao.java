package com.app.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	public void addAccount(int i, int b)
	{
		System.out.println("Adding user accounting");
	}
	
	public void doLogin(String uname,String pwd)
	{
		System.out.println("In doLogin of userDao");
	}
}
