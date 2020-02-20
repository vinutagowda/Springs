package com.cts.service;

public class GreetNoteServiceAdvanceImpl implements GreetService{
	public  String greet(String userName) {
		return gmp.getGreetNote() +  userName;
	
	}
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
