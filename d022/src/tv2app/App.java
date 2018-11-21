package tv2app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import tv2.TV;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("myspring.xml");
	
		TV stv = (TV)factory.getBean("sstv");
		stv.turnOn();
		stv.volumeUp(10);
		System.out.println(stv);
		
	}

}




