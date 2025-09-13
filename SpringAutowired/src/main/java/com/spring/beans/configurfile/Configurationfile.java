package com.spring.beans.configurfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.bean.Address;
import com.spring.bean.Students;
@Configuration
public class Configurationfile {
	@Bean
	public Students studentsObj() {
		Students stu = new Students();
		stu.setStu_Name("Utkarsh");
		stu.setStu_RollNu(125);
		stu.setAge(1);
	//	stu.setAddress(addressObj2());  //manually 
		return stu;
	}
	
	@Bean("addr1")
	public Address addressObj1() {
		Address addr = new Address();
		addr.setCity("Kushinagar");
		addr.setPincode("274401");
		return addr;
	}
	@Bean("addr2")
	@Primary
	public Address addressObj2() {
		Address addr = new Address();
		addr.setCity("Mumbai");
		addr.setPincode("25462");
		return addr;
	}
	

}
