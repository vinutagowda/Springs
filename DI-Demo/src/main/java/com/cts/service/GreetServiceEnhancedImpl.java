package com.cts.service;

public class GreetServiceEnhancedImpl implements GreetService{
	private String Greeting;

	public GreetServiceEnhancedImpl() {
		super();
	}

	public GreetServiceEnhancedImpl(String greeting) {
		super();
		Greeting = greeting;
	}

	public String getGreeting() {
		return Greeting;
	}

	public void setGreeting(String greeting) {
		Greeting = greeting;
	}

	public String greet(String userName) {
		
		return "hello" + userName;
	}

	
	
}
