package com.frame;

import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LogAdvice2 {
	public void logger(JoinPoint point) {
		System.out.println("***************************************");
		System.out.println(point.getSignature().getName());
		System.out.println(point.getArgs()[0].toString());
		System.out.println("Exception Invoke..");
		System.out.println("***************************************");
	}
}
