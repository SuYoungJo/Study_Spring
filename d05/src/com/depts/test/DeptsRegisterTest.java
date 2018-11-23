package com.depts.test;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Depts;

public class DeptsRegisterTest {
	public static void main(String[] args) {
		 AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		 
		 Service service = (Service) factory.getBean("dserv");
		 
		 Scanner sc = new Scanner(System.in);
		 Depts depts = null;
		 String name = null;
		 String location = null;
		 
		 try {
			System.out.println("¢ºInput Depts Name:");
			name = sc.nextLine();
			System.out.println("¢ºInput Depts Location:");
			location = sc.nextLine();
			depts = new Depts(name, location);
			service.register(depts);
			System.out.println("¢ºRegister Depts : " + depts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
