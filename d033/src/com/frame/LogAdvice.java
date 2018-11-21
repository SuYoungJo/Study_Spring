package com.frame;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class LogAdvice {

	@Before("execution(* com.cust..*Biz.*(..))")
	public void log1(JoinPoint jp) {
		System.out.println("--------------------------");
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
	}

	@After("execution(* com.cust..*Biz.*(..))")
	public void log2(JoinPoint jp) {
		System.out.println("--------------------------");
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
	}

	@AfterThrowing(pointcut = "execution(* com.cust..*Biz.*(..))", throwing = "ex")
	public void log3(JoinPoint jp, Exception ex) {
		System.out.println(ex.getMessage());
	}

	@AfterReturning(pointcut = "execution(* com.cust..*Biz.*(..))", returning = "obj")
	public void log4(JoinPoint jp, Object obj) {
		System.out.println("Returnning OK");
		System.out.println(obj);
	}

	@Around("execution(* com.cust..*Biz.*(..))")
	public Object log5(ProceedingJoinPoint pjp) throws Throwable{
		Object result = "";
		StopWatch watch = new StopWatch();
		watch.start();
		result = pjp.proceed();
		watch.stop();
		System.out.println("Time : "+watch.getTotalTimeMillis());
		return result;
	}
}
