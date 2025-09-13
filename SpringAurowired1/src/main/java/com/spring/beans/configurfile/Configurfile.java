package com.spring.beans.configurfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Address;
import com.spring.beans.Classes;
import com.spring.beans.Students;

@Configuration
public class Configurfile {
	@Bean
	public Classes classesObj() {
		Classes cls = new Classes();
		cls.setSchool_Name("Primary");
		cls.setClass_Name("Nursury");
	//	cls.setStudents(studentsObj());
		return cls;
	}

	@Bean
	public Students studentsObj() {
		Students stu = new Students();
		stu.setStu_Name("Utkarsh");
		stu.setStu_RollNo("25");
		stu.setAge(1);
		return stu;
	}

	@Bean("adrobj1")
	public Address addressObj1() {
		Address addr = new Address();
		addr.setCity("Kushinagar");
		addr.setPincode("274401");
		return addr;
	}
	
	@Bean("adrObj2")
	public Address addressObj2() {
		Address addr = new Address();
		addr.setCity("Gorakhpur");
		addr.setPincode("568263");
		return addr;
	}

}
