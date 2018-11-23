package com.emps.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Depts;
import com.vo.Emps;

public class EmpsRegisterTest {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		
		Service eService = (Service) factory.getBean("eserv");
		Service dService = (Service) factory.getBean("dserv");
		Emps emps = null;
		
		try {
			emps = new Emps("id03", "Kang", 3400, 141);
			eService.register(emps);
			Depts depts = (Depts) dService.get(emps.getDid());
			String name = depts.getName();
			emps.setDname(name);
			System.out.println("¢ºInsert : " + emps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
