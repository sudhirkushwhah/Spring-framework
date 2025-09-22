package com.zepto.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZeptoLoginController {
@RequestMapping("/login")
	public String startApplication() {
		System.out.println("startapplication-----------");
		return "showRegform";
	}
}
