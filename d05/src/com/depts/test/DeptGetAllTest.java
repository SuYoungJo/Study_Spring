package com.depts.test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Depts;

public class DeptGetAllTest {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		
		Service service = (Service) factory.getBean("dserv");
		
		try {
			ArrayList<Depts> list = service.getall();
			System.out.println("¢ºGetAll Depts : ");
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
