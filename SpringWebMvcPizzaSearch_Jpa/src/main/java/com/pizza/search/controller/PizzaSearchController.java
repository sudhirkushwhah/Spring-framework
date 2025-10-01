package com.pizza.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pizza.search.beans.SearchInfo;
import com.pizza.search.service.PizzaService;


@Controller
public class PizzaSearchController {
	@Autowired
	PizzaService pizzaservice;
	
	@GetMapping("/searchPizza")
	public String searchPizza(@RequestParam("searchString") String searchString, Model model) {

		System.out.println("seach pizza :" + searchString);
		SearchInfo info = pizzaservice.pizzaService(Long.parseLong(searchString));
		
		model.addAttribute("SearchInfo",info);
		return "showviewspage";
	}
}
