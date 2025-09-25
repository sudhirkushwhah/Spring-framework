package com.zomatto.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	@RequestMapping("/login")
	public ModelAndView view() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RegistrationForm");
		return mv;
	}
	@PostMapping("/RegisterServlet")
	@ResponseBody
	public String processRegister(
			@RequestParam("userId") String userId,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email){
		
	    System.out.println("userId : "+userId);
		System.out.println("firstName : "+firstName);
		System.out.println("lastName : "+lastName);
		System.out.println("email : "+email);
		
		return "ConformationPage";
		
	}
}
