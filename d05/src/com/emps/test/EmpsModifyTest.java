package com.emps.test;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Emps;

public class EmpsModifyTest {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");

		Scanner sc = new Scanner(System.in);
		Service service = (Service) factory.getBean("eserv");

		Emps emps = null;
		String id = null;
		String name = null;
		int salary = 0;
		int did = 0;

		try {
			if (service.getall().size() < 10) {
				id = "id" + "0" + service.getall().size();
			} else {
				id = "id" + service.getall().size();
			}
			System.out.println("¢ºInput Emps Name:");
			name = sc.nextLine();
			System.out.println("¢ºInput Depts Salary:");
			salary = sc.nextInt();
			System.out.println("¢ºInput Depts Did:");
			did = sc.nextInt();
			emps = new Emps(id, name, salary, did);
			service.modify(emps);
			System.out.println("¢ºModify Depts :" + emps);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
