package com.kodewala.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {

	@RequestMapping("/showRegPage")
	public ModelAndView showRegPage() {
		System.out.println("RMvcController.showRegPage()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registration");
		return mv;
	}

	@PostMapping("/register")
	@ResponseBody
	public String processRegistration(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("password") String password) {
		System.out.println("MvcController.processRegistration()");
		System.out.println(" First Name " + firstName);
		System.out.println(" Last Name " + lastName);
		System.out.println(" Enter Password "+  password);
		return "You registration has been done and your submitted details are : " + firstName + " and " + lastName + " and "+ password;
	}
}
