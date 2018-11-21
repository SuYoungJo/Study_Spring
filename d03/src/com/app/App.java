package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Biz biz = (Biz) factory.getBean("cbiz");
		
		Cust cust = new Cust("id01", "pw01", "jsy", 10);
		
		try {
			biz.register(cust);
		} catch (Exception e) {
			System.out.println("Ex ....");
		} finally {
			System.out.println("Final ....");
		}
//		biz.remove("id01");
//		biz.modify(cust);
		
//		Cust gcust = null;
//		gcust = (Cust) biz.get("id100");
//		System.out.println(gcust);
//		
//		ArrayList<Cust> list = null;
//		list = biz.get();
//		System.out.println(list);
			
	}
}
