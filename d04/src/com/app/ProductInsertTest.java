package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;
import com.product.Product;

public class ProductInsertTest {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Biz biz = 
		(Biz) factory.getBean("pbiz");
		
		Product p = 
		new Product("pants", 10000, 
				"pants.jpg");
		
		try {
			biz.register(p);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*Cust dbcust = null;
		dbcust = (Cust) biz.get("id03");
		
		System.out.println(dbcust);*/
	}

}




