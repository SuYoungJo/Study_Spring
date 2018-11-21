package com.frame;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice2 {
	public void logger(JoinPoint point) {
		System.out.println("***************************************");
		System.out.println(point.getSignature().getName());
		System.out.println(point.getArgs()[0].toString());
		System.out.println("Exception Invoke..");
		System.out.println("***************************************");
	}
	
	// around
		public Object aroundLogger(
				ProceedingJoinPoint pjp) throws Throwable {
			Object result = null;
			System.out.println("Before....");
			System.out.println(pjp.getSignature().getName().toString());
			System.out.println(pjp.getArgs()[0].toString());
			System.out.println("----------------------");
			result = pjp.proceed();
			System.out.println("----------------------");
			System.out.println(result);
			System.out.println("After....");
			result = pjp.proceed();
			
			return result;
		}
}
