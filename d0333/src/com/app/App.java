package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");

		Biz biz = (Biz) factory.getBean("cbiz");

		Cust cust = new Cust("id02", "pw01", "jsy", 10);

		// Regigster, Modify -> Before, Around
		System.out.println("************Register************");
		try {
			biz.register(cust);
		} catch (Exception e) {
			System.out.println("Register Exception..");
		} finally {
			System.out.println("Register Finally..");
		}
		
		System.out.println();
		System.out.println("************Modify************");
		try {
			biz.modify(cust);
		} catch (Exception e) {
			System.out.println("Modify Exception..");
		} finally {
			System.out.println("Modify Finally..");
		}
		
		// Remove -> After, Around
		System.out.println();
		System.out.println("************Remove************");
		try {
			biz.remove("id01");
		} catch (Exception e) {
			System.out.println("Remove Exception..");
		} finally {
			System.out.println("Remove Finally..");
		}
		
		// Get, GetAll -> After Returning, Around
		Cust gcust = null;
		ArrayList<Cust> list = null;
		System.out.println();
		System.out.println("************Get************");
		try {
			gcust = (Cust) biz.get("id100");
			System.out.println(gcust);
		} catch (Exception e) {
			System.out.println("Get Exception..");
		} finally {
			System.out.println("Get Finally..");
		}
		
		System.out.println();
		System.out.println("************GetAll************");
		try {
			list = biz.get();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println("GetAll Exception..");
		} finally {
			System.out.println("GetAll Finally..");
		}

	}
}
