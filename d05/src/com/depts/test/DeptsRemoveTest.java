package com.depts.test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Depts;

public class DeptsRemoveTest {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		
		Service service = (Service) factory.getBean("dserv");
		
		
		try {
			ArrayList<Depts> list = service.getall();
			Depts dept = list.get(list.size() - 1);
			int id = dept.getId();
			System.out.println("¢ºRemove Depts : " + dept);
			service.remove(id);
			System.out.println("¢ºClear");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
