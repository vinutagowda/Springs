package com.cts.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.GreetNoteServiceAdvanceImpl;
import com.cts.service.GreetServiceEnhancedImpl;


public class DidApp2 {

	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
	
		GreetServiceEnhancedImpl gs2= (GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs2.greet("vinu"));
		GreetServiceEnhancedImpl gs3= (GreetServiceEnhancedImpl) context.getBean("g2");
		
		System.out.println(gs3.greet("vonakkam"));
        GreetNoteServiceAdvanceImpl gs4= (GreetNoteServiceAdvanceImpl) context.getBean("g3");
		
		System.out.println(gs4.greet("namskar"));
		
	}
}

