package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;

public class CustSelectTest {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Biz biz = 
		(Biz) factory.getBean("cbiz");
		
		ArrayList<Cust> list = null;
		try {
			list = biz.get();
			for(Cust c:list) {
				System.out.println(c);
			}
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}




