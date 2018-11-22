package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Biz biz = 
		(Biz) factory.getBean("cbiz");
		
//		Cust cust = 
//		new Cust("id01", "pwd01", "james", 10);
//		
//		try {
//			biz.register(cust);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Cust dbcust = null;
		ArrayList<Cust> list = null;
		try {
//			dbcust = (Cust) biz.get("id03");
			list = biz.get();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println(dbcust);
	}

}




