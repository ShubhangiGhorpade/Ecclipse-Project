package com.xworkz.jpaDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.jpaDemo.entity.WebSeries;
import com.xworkz.jpaDemo.service.WebSeriesService;

@Controller
@RequestMapping("/")
public class WebSeriesController {
	@Autowired
	private WebSeriesService service;
	
	@PostMapping("/send")
	public String onSave(WebSeries series) {
		boolean validateAndThenSave = service.validateAndThenSave(series);
		if(validateAndThenSave) {
			return "WebSeries.jsp";
		}else {
			return "no entity";
		}
		
	}

}
