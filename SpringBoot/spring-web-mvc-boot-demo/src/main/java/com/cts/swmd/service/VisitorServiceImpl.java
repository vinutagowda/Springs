package com.cts.swmd.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

import com.cts.swmd.model.Visitor;
@Service
public class VisitorServiceImpl implements VisitorService {

	public Visitor computAge(Visitor visitor) {
		if(visitor!=null) {
			LocalDate today=LocalDate.now();
			int age=Period.between(visitor.getDateOfbirth(), today).getYears();
			visitor.setAge(age);
		}
		
		return visitor;
	}

}
