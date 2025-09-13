package com.spring.beans.configur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Contents;
import com.spring.beans.Quantum;
import com.spring.beans.Topics;

@Configuration
public class ConfigurationBook {
	@Bean
	public Quantum bookObj() {
		Quantum quantum = new Quantum("Data structure", "KCS456", 458.00, contentsObj());
		return quantum;

	}

	@Bean
	public Contents contentsObj() {
		Contents contents = new Contents(1, "Arrays and Linked list", topicsObj());
		return contents;
	}

	@Bean
	public Topics topicsObj() {
		Topics topics = new Topics("1. Introduction"," "
				        + "        2. Algorithm", "         "
						+ "3. Asymptotic_Notation" ,"        "
						+ " 4. Time-Space" ,"        "
						+ " 5. Array_Linked list");
		return topics;
	}

}
