package com.app.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.aopdemo.dao.AccountDAO;
import com.app.aopdemo.dao.MembershipDAO;

public class MainDemo {
	
	public static void main(String[] args) {
		
		//READ SPRING CONFIG CLASS
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//GET THE BEAN FROM THE SPRING CONTAINER
		AccountDAO theDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO memDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		Account myAccount = new Account();
		theDAO.addAccount(myAccount, true);
		theDAO.doWork();
		
		String s = memDAO.addSilly();
		System.out.println(s);
		
		memDAO.goToSleep();
		
		//CLOSE THE CONTEXT
		context.close();
	}
}
