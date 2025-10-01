package com.pizza.search.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.search.beans.SearchInfo;
import com.pizza.search.entity.Pizza;
import com.pizza.search.repositery.SearchRepository;
@Service
public class PizzaService {
	@Autowired
	SearchRepository searchrepository;
	
	public SearchInfo pizzaService(Long searchString) {
		
		
		System.out.println("pizza start services :"+searchString);
		Optional<Pizza> pizzaOptional = searchrepository.findByid(searchString);
		
		Pizza pizza = pizzaOptional.get();
		SearchInfo searchInfo = new SearchInfo();
		searchInfo.setid(pizza.getid());
		searchInfo.setName(pizza.getName());
		searchInfo.setPrice(pizza.getPrice());
		return searchInfo;
	}

	

}
