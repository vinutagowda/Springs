package com.cts.swrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.swrd.exception.EmployeeException;
import com.cts.swrd.model.Employee;
import com.cts.swrd.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/emps")
public class EmployeeAPI {
	
	@Autowired
	public EmployeeService empService;
	
	
	@GetMapping
	public ResponseEntity<List<Employee>> findAll(){
		
		return new ResponseEntity<List<Employee>>(empService.findAll(),HttpStatus.OK);
		
	}
	@GetMapping("/{empId:[0-9]{1,4}}")
	public ResponseEntity<Employee>findById(@PathVariable("empId")Long empId){
		ResponseEntity<Employee> response=null;
		Employee emp=empService.findById(empId);
		if(emp==null) {
			response=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			response=new ResponseEntity<>(HttpStatus.OK);
		}
		return response;
	}


@GetMapping("/{mno:{1-0][0-9]{9}}")
public ResponseEntity<Employee>findByMobileNumber(@PathVariable("mobileNumber")String mobileNumber){
	ResponseEntity<Employee> response=null;
	Employee emp=empService.findByMobileNumber(mobileNumber);
	if(mobileNumber==null) {
		response=new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}else {
		response=new ResponseEntity<>(HttpStatus.OK);
	}
	return response;
}


@PostMapping
public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp)throws EmployeeException{
	emp=empService.add(emp);
	return new ResponseEntity<>(emp,HttpStatus.OK);
}

@DeleteMapping("/{empId}")
public ResponseEntity<Void> deleteEmployee(@PathVariable("empId")Long empId){
	ResponseEntity<Void> response =null;
	Employee empTemp=empService.findById(empId);
	if(empTemp==null) {
		response= new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}else {
		empService.deleteById(empId);
		response=new ResponseEntity<>(HttpStatus.OK);
	}
	return response;
}
}


