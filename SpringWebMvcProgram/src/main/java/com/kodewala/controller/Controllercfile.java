package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllercfile {
	@RequestMapping("/regform")
	public ModelAndView regform() {
		System.out.println("registration.controller");
		ModelAndView mva = new ModelAndView();
		mva.setViewName("registeration");
		return mva;
	}

	@PostMapping("/register")
	@ResponseBody
	public String processRgistration(@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("password") String password,
			@RequestParam("checkbox") String checkbox, @RequestParam("radio") String radio) {
		System.out.println("firstName :" + firstName);
		System.out.println("lastName :" + lastName);
		System.out.println("password :" + password);
		System.out.println("check :" + checkbox);
		System.out.println("click :" + radio);

		return ("successfully form summition");
	}

}
