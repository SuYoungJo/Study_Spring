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

	@Before("execution(* com.cust..*Biz.register*(..))")
	public void log1(JoinPoint jp) {
		System.out.println("----------Before Start----------------");
		System.out.println("Name :" + jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("----------Before End----------------");
	}
	
	@Before("execution(* com.cust..*Biz.modify*(..))")
	public void log2(JoinPoint jp) {
		System.out.println("----------Before Start----------------");
		System.out.println("Name :" + jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("----------Before End----------------");
	}

	@After("execution(* com.cust..*Biz.remove*(..))")
	public void log3(JoinPoint jp) {
		System.out.println("----------After Start----------------");
		System.out.println("Name :" + jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("----------After End----------------");
	}

	@AfterReturning(pointcut = "execution(* com.cust..*Biz.get*(..))", returning = "obj")
	public void log4(JoinPoint jp, Object obj) {
		System.out.println("----------AfterReturning Start----------------");
		System.out.println("Returnning OK");
		System.out.println(obj);
		System.out.println("----------AfterReturning End----------------");		
	}

	@Around("execution(* com.cust..*Biz.*(..))")
	public Object log5(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("----------Around Start----------------");
		Object result = "";
		StopWatch watch = new StopWatch();
		watch.start();
		result = pjp.proceed();
		watch.stop();
		System.out.println("Time : "+watch.getTotalTimeMillis());
		System.out.println("----------Around End----------------");
		return result;
		
	}
}
