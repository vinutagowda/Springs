package com.cts.service;


import java.time.LocalDateTime;

public class GreetNoteProviderTimeBasedImpl  implements GreetNoteProvider{
	public String getGreetNote() {
		
	
	LocalDateTime today= LocalDateTime.now();
			int h=today.getHour();
			String g="";
					if(h>=1 && h<12)
				g="good morning";
			else if(h>=12 && h<=16)
				g="good afternoon";
			else
				 g="good evening";
					return g;
	}
}
