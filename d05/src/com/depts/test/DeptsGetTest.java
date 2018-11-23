package com.depts.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Depts;

public class DeptsGetTest {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		
		Service service = (Service) factory.getBean("dserv");
		
		try {
			Depts depts = (Depts) service.get(141);
			System.out.println("¢ºGet Depts : " + depts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
