package com.spring.beans.configur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.MobilePhone;
import com.spring.beans.PhoneConfiguration;
@Configuration
public class ConfigurPhone {
	@Bean
	public MobilePhone mobilePhoneObj() {
		MobilePhone mPhone = new MobilePhone();
		mPhone.setPhone_Name("vivo");
		mPhone.setPhone_Model("v29Pro");
		mPhone.setPhone_price(39999.00);
		mPhone.setPhoneConfiguration(phoneConfiguration());
		return mPhone;
	}
	@Bean
	public PhoneConfiguration phoneConfiguration() {
		PhoneConfiguration cPhone = new PhoneConfiguration();
		cPhone.setProcessor_type(" MTD8200");
		cPhone.setMemory("             : 8GB 512GB");
		cPhone.setDisplay("             : super Amoled");
		return cPhone;
	}

}
