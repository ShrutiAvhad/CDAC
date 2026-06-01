package com.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
	
//	@Before("execution(public void com.app.dao.AccountDao.addAccount())")
//	public void addBeforeAdvice()
//	{
//		System.out.println("calling addBeforeAdvice");
//	}
	
	@Before("execution(*add*(..))")
	public void addBeforeAdvice()
	{
		System.out.println("Calling addBeforeAdvice");
	}
}
