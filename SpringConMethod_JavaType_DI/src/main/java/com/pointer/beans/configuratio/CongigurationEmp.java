package com.pointer.beans.configuratio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pointer.beans.Employee;
import com.pointer.beans.Students;

@Configuration
public class CongigurationEmp {

	@Bean
	public Employee employeeObj() {
		Employee emp = new Employee("Chetan", 112, 25000.0, studentObj());
		return emp;
	}

	@Bean
	public Students studentObj() {
		Students stu = new Students("Arpit", 12);
		return stu;
	}
}
