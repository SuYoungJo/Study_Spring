package app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import frame.Biz;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext
		factory = 
		new GenericXmlApplicationContext("mybiz.xml");
		// CustBiz
		Biz biz = (Biz)factory.getBean("cbiz");
		
		biz.register();
		biz.remove();
		biz.modify();
		
		// ProdcutBiz
		Biz pbiz = (Biz)factory.getBean("pbiz");
		
		pbiz.register();
		pbiz.remove();
		pbiz.modify();
		
	}

}




