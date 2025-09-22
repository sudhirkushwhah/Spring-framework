package com.zepto.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
	@PostMapping("/register")
	public String doregister(@ModelAttribute UserInfo info, Model model) {
		System.out.println(info.getName());
		System.out.println(info.getCity());
		String uniqueId = java.util.UUID.randomUUID().toString().replaceAll("-", "").substring(0, 5);
		System.out.println("generate userid successfully : user id is :"+uniqueId);
		info.setUserId(uniqueId);

		model.addAttribute("user :" + info);
	   return "registerConfermation";

	}
}
