package com.emps.test;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Emps;

public class EmpsGetTest {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		
		Scanner sc = new Scanner(System.in);
		Service service = (Service) factory.getBean("eserv");
		Emps emps = null;
		
		try {
			System.out.println("��ID�� �Է��ϼ��� :");
			String id = sc.nextLine();
			emps = (Emps) service.get(id);
			System.out.println("��Get Emps :" + emps);
		} catch (Exception e) {
			// TODO �ڵ� ������ catch ���
		}
	}

}
