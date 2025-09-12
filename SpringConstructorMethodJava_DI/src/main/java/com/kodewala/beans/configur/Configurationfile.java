package com.kodewala.beans.configur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.beans.Academy;
import com.kodewala.beans.Students;

@Configuration
public class Configurationfile {
	@Bean
	public Academy academyObj() {
		Academy acd = new Academy("Kodewala", "Benglouru", studentsObj());

		return acd;

	}

	@Bean
	public Students studentsObj() {
		Students stu = new Students("Sudhir", "CSE", "Lucknow");

		return stu;
	}
}
