package com.app.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@AfterReturning(pointcut = "execution(* com.app.aopdemo)")
}
