package com.spring.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.BankDetail;
import com.spring.bean.Employee;

@Configuration
public class ConfiguratinEmp {
	@Bean
	public Employee empObj() {
		Employee employee = new Employee("Rohit", 125, 25000.0, bankObj());
		return employee;
	}

	@Bean
	public BankDetail bankObj() {
		BankDetail bDetail = new BankDetail("UBIN", "425963842");
		return bDetail;
	}

}
