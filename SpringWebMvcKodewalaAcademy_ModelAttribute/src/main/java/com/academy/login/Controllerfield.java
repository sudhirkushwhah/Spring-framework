package com.academy.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerfield {
@RequestMapping("/login")
	public String registrationform() {
		System.out.println("registratio is continue ----------------");
		return "registeration";
	}
}
