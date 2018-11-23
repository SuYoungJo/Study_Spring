package com.emps.test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Emps;

public class EmpsRemoveTest {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		
		Service service = (Service) factory.getBean("eserv");
		
		try {
			ArrayList<Emps> list = service.getall();
			Emps emp = list.get(list.size()-1);
			String id = emp.getId();
			System.out.println("¢ºRemove Emps : " + emp);
			service.remove(id);
			System.out.println("¢ºClear");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
