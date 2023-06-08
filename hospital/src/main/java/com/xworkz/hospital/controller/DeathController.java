package com.xworkz.hospital.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.hospital.dto.DeathDTO;

@Component
@RequestMapping
public class DeathController implements WebMvcConfigurer {

	Collection<DeathDTO> dtos = new ArrayList<>();

	public DeathController() {
		System.out.println("Running DeathController:"
				+ this.getClass().getSimpleName());
	}

	@RequestMapping("/click")
	public String onclick(@Valid DeathDTO dto,BindingResult validateError, Model model
			) {
		if (validateError.hasErrors()) {
			model.addAttribute("errorMsg", "Data is invalid");
			model.addAttribute("error", validateError.getAllErrors());
			validateError.getAllErrors().forEach(
					e -> System.out.println(e.getDefaultMessage()));
			return "display.jsp";
		}
		model.addAttribute("msg", "Saved successfully..." + dto.getName());
		this.dtos.add(dto);
		for (DeathDTO deathDTO : dtos) {
			System.out.println("DeathDTO:" + deathDTO);
		}
		return "display.jsp";
	}

	@RequestMapping("/view")
	public String view(Model model) {
		model.addAttribute("view", dtos);
		return "view.jsp";
	}

}
