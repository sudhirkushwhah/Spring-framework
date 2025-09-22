package com.mtsolar.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerRegistration {
@RequestMapping("/signup")
	public String registration() {
		System.out.println("signup is staring ------------");
		
		return "RegPage";
	} 
}
