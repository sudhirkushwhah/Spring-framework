package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerForm {
	@RequestMapping("/click")
	public String startApplication() {
		System.out.println("start the application form  ......");
		return "RegisterForm";
	}
}
