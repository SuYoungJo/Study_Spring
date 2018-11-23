package com.depts.test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Depts;

public class DeptsModifyTest {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		
		Service service = (Service) factory.getBean("dserv");

		
		try {
			ArrayList<Depts> list = service.getall();
			int num = list.get(list.size() - 1).getId();
			Depts depts = (Depts) service.get(num);
			System.out.println("¢ºOrignal Depts : " + depts);
			depts = new Depts(num,"HumanResource", "NoWonStation");
			service.modify(depts);
			System.out.println("¢ºModify Depts : " + depts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
