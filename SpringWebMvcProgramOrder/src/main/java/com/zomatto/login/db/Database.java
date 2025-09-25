package com.zomatto.login.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class Database {
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/students");
		dataSource.setUsername("root");
		dataSource.setPassword("Test@123");
		return dataSource;
	}
	@Bean
	public JdbcTemplate myjbbcTemplate() {
		JdbcTemplate jdbctemple = new JdbcTemplate();
		jdbctemple.setDataSource(myDataSource());
		return jdbctemple;
	}

}
