package com.frolov.inaction4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** Perfomance.perform(..))")
	public void performance() {}
	
//	@Before("performance()")
//	public void silence() {
//		System.out.println("Silence");
//	}
//	
//	@AfterReturning("performance()")
//	public void applause() {
//		System.out.println("Applause");
//	}

	@Around("perfomance()")
	public void watchPerform(ProceedingJoinPoint jp) {
		try {
		System.out.println("Take your seats");
		jp.proceed();
		System.out.println("Appause");
		jp.proceed();
		} catch (Throwable e) {
			System.out.println(e);
		}
		
	}
	
}
