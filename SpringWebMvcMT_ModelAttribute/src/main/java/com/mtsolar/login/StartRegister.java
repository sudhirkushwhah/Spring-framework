package com.mtsolar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class StartRegister {
	@PostMapping("/register")
	public String doRegistration(@ModelAttribute UserInfo info, Model model) {
		System.out.println("name :"+info.getName());
		System.out.println("name :"+info.getContact());
		System.out.println("name :"+info.getEmail());
		
		String uniqueId = java.util.UUID.randomUUID().toString().replaceAll("-", "").substring(0, 5);
		System.out.println("SignUp successfully : unique userId is :"+uniqueId);
		info.setUserId(uniqueId);
		model.addAttribute(info);
		
		return "ConformationPage";
		


	}
}
