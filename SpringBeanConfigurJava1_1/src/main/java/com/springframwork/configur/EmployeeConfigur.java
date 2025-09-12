package com.springframwork.configur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springframwork.beans.Employee;



@Configuration
public class EmployeeConfigur {
	
	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setEmployeeName("Nitesh");
		emp.setEmployeeSurname("Kushwaha");
		emp.setEmployeeSalary(22000);
		return emp;
	}



}
