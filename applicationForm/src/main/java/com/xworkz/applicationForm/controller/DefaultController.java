package com.xworkz.applicationForm.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.applicationForm.dto.ApplicationDTO;

@Component
@RequestMapping
public class DefaultController implements WebMvcConfigurer {

	public DefaultController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping("start")
	public String onStart(Model model) {
		System.out.println("Running onStart");
		model.addAttribute("dtos", new ApplicationDTO());
		return "/Application.jsp";
	}

}
