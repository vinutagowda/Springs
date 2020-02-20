package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("g2")
public class GreetNoteServiceAdvanceImpl implements GreetService{
	public  String greet(String userName) {
		return gmp.getGreetNote() +  userName;
	
	}
	@Autowired
	@Qualifier("g4")
	private GreetNoteProvider gmp;
	public GreetNoteProvider getGmp() {
		return gmp;
	}
	public void setGmp(GreetNoteProvider gmp) {
		this.gmp = gmp;
	}
	public GreetNoteServiceAdvanceImpl() {
		super();
	}
	public GreetNoteServiceAdvanceImpl(GreetNoteProvider gmp) {
		super();
		this.gmp = gmp;
	}
	

	
}
