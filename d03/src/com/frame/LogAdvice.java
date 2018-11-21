package com.frame;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public void logger(JoinPoint jp, Object obj) {
		System.out.println("--------------------------------------");
//		Date d = new Date();
//		String str = "";
//		str += d.toString();
//		str += d.getTime();
//		System.out.println(str);
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println(obj.toString());
		System.out.println("--------------------------------------");
	}
}
