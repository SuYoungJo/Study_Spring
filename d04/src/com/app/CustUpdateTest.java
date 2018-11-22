package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;

public class CustUpdateTest {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Biz biz = 
		(Biz) factory.getBean("cbiz");
		
		Cust cust = 
		new Cust("id55", "pwd11", "james", 20);
		
		try {
			biz.modify(cust);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*Cust dbcust = null;
		dbcust = (Cust) biz.get("id03");
		
		System.out.println(dbcust);*/
	}

}




