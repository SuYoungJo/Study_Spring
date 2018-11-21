package com.frame;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogAdvice2 {
	public void logger(JoinPoint point) {
		System.out.println("***************************************");
		System.out.println(point.getSignature().getName());
		System.out.println(point.getArgs()[0].toString());
		System.out.println("Exception Invoke..");
		System.out.println("***************************************");
	}

	// around
	public Object aroundLogger(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		System.out.println("Before....");
		System.out.println("----------------------");
		StopWatch watch = new StopWatch();
		watch.start();
		result = pjp.proceed();
		Thread.sleep(398);
		watch.stop();
		System.out.println(watch.getTotalTimeMillis());
		System.out.println("----------------------");
		System.out.println("After....");
		result = pjp.proceed();

		return result;
	}

	// After Throwing
	public void exLogger(JoinPoint jp, Exception ex) {
		System.out.println(ex.getMessage());
	}
}
