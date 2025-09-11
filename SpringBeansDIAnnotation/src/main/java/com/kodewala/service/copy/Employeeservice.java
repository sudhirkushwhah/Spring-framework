package com.kodewala.service.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.beans.Employee;

@Component
public class Employeeservice {

	@Autowired
	@Qualifier("emp1")
	private Employee employee;

	public void printEmployee() {
	
		System.out.print(employee.getFirstName() +" "+ employee.getLastName());
		
	}
}
