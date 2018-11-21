package app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cust.Cust;
import frame.Biz;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Biz biz = 
		(Biz) factory.getBean("cbiz");
		
		Cust cust = 
		new Cust("id01", "pwd01", "james", 10);
		
		biz.register(cust);
		
		/*Cust dbcust = null;
		dbcust = (Cust) biz.get("id03");
		
		System.out.println(dbcust);*/
	}

}




