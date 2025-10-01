package com.kodewala.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.controller.entity.DoctorApplication;

@Controller
public class StartApplication {
	@PostMapping("/registerform")
	public String startForm(@ModelAttribute DoctorApplication form, Model model) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		DoctorApplication dr = new  DoctorApplication();
//		dr.setUserId(form.getUserId());
		dr.setFirstName(form.getFirstName());
		dr.setLastName(form.getLastName());
		dr.setAge(form.getAge());
		dr.setMobileNumber(form.getMobileNumber());
		dr.setAddress(form.getAddress());
		dr.setDate(form.getDate());
		
	
		session.save(dr);
		
		tx.commit();

		model.addAttribute( "user", form);
		return "ConformationDone";
	}

}
