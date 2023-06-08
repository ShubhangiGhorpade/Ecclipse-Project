package com.xworkz.donation.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.donation.dto.DonationDTO;

@Component
@RequestMapping("/")
public class DefaultController implements WebMvcConfigurer {

	public DefaultController() {
		System.out.println("NO-Arg constructor in DefaultController");
	}
	
	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("Running on start");
		model.addAttribute("dto", new DonationDTO());
		return "/Donation.jsp";
			
	}
}
