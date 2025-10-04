package com.academy.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.login.utils.Utils;

@Controller
public class Registrationform {
	@Autowired
	public JdbcTemplate jdbctemple;

	@PostMapping("/registerSuccess")
	public String doRegistration(@ModelAttribute DetailUser info, Model model) {
		/*
		 * System.out.println(info.getName()); System.out.println(info.getCity());
		 * System.out.println(info.getContact()); System.out.println(info.getCourse());
		 */

		String uniqueId = java.util.UUID.randomUUID().toString().replaceAll("-", "").substring(0, 5);
		String name = info.getName();
		String city = info.getCity();
		String contact = info.getContact();
		String course = info.getCourse();
		
		
		info.setUserId(uniqueId);
		String status = Utils.PENDING;
		
		String userId = info.getUserId();

		String insert_queryString = "INSERT INTO DetailUser values('" + name + "','" + city + "','" + contact + "','"
				+ course + "','" + userId + "','" + status + "')";

		jdbctemple.execute(insert_queryString);
		System.out
				.println("Registration successfull : user id is :" + uniqueId );
		
		String verifyLink = "http://localhost:8080/emailverify?userId=" + uniqueId;
		
		model.addAttribute("user", info);
        model.addAttribute("verifyLink", verifyLink);

		return "email_verification";
	}

	@GetMapping("/emailverify")
	public String veryRegistration(@RequestParam("userId") String userId, Model model) {
		String statusVerify = Utils.ACTIVE;
		String queryString = "update DetailUser set status='" + statusVerify + "' where userId ='" + userId + "' ";
		int update = jdbctemple.update(queryString);
		
		 if (update > 0) {
	            System.out.println("User verified successfully: " + userId);
	        } else {
	            System.out.println("Verification failed. User not found: " + userId);
	        }

		model.addAttribute("userId", userId);

		return "ConformationPage";
		
		
	}
}
