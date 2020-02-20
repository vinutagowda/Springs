package com.cts.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.GreetService;
import com.cts.service.GreetServiceSimpleImpl;


public class DidApp01 {

	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		GreetService gs= (GreetService) context.getBean("g1");
		System.out.println(gs.greet("vinu"));
		GreetService gs2= (GreetService) context.getBean("g2");
		System.out.println(gs2.greet("vinu"));
		GreetService gs3= (GreetService) context.getBean("g4");
		System.out.println(gs3.greet("vinu"));
		
	}
}
