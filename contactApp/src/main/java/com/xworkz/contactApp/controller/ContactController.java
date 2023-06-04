package com.xworkz.contactApp.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.contactApp.dto.ContactDTO;

@Component
@RequestMapping("/")
public class ContactController implements WebMvcConfigurer {

	private Collection<ContactDTO> collectionDtos = new ArrayList<>();

	public ContactController() {
		System.out.println(
				"ContactController:" + this.getClass().getSimpleName());
	}

	@RequestMapping("/save")
	public String send(ContactDTO dto, Model model) {
		System.out.println("Running send Method");
		System.out.println(dto);
		model.addAttribute("msg",
				"saved successfully...." + dto.getName());

		this.collectionDtos.add(dto);
		for (ContactDTO contactDTO : collectionDtos) {
			System.out
					.println("Contact saved in collection:" + contactDTO);
		}

		return "display.jsp";
	}

	@RequestMapping("/view")
	public String view(Model model) {
		model.addAttribute("collections", collectionDtos);
		return "view.jsp";
	}

}
