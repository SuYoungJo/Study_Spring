package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;
import com.product.Product;

public class ProductSelectAllTest {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Biz biz = 
		(Biz) factory.getBean("pbiz");
		
		ArrayList<Product> list = null;
		
		
		try {
			list = biz.get();
			for(Product p:list) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*Cust dbcust = null;
		dbcust = (Cust) biz.get("id03");
		
		System.out.println(dbcust);*/
	}

}




