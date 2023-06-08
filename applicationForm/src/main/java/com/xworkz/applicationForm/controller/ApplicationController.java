package com.xworkz.applicationForm.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.applicationForm.dto.ApplicationDTO;

@Component
@RequestMapping("/")
public class ApplicationController implements WebMvcConfigurer {

	public ApplicationController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping("click")
	public String onClick(@Valid ApplicationDTO dto, BindingResult br,
			Model model) {
		System.out.println("DTO:" + dto);
		if (br.hasErrors()) {
			System.out.println("Data is invalid");
			model.addAttribute("errorMsg", br.getAllErrors());
			model.addAttribute("dtos", dto);
		} else {
			System.err.println("Data is valid");
			model.addAttribute("successMsg",
					dto.getName() + " Data is added successfully!!!");
		}
		return "/Application.jsp";

	}
}
