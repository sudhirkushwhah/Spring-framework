package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.beans.Employee;

@Configuration
@ComponentScan(basePackages ="com.kodewala")
public class configurjava {
	
	@Bean("emp1")
	public Employee employee() {
		Employee emp = new Employee();
		emp.setFirstName("Sudhir");
		emp.setLastName("Maurya");
		return emp;
	}
	@Bean("emp2")
	@Primary
	public Employee employee2() {
		Employee emp = new Employee();
		emp.setFirstName("kernatak");
		emp.setLastName("benglouru");
		return emp;
	}

}
