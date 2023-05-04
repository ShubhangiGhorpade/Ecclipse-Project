package com.xworkz.shoeShowRoom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowRoom.configuration.SpringConfiguration;
import com.xworkz.shoeShowRoom.dto.SalesManagerDTO;
import com.xworkz.shoeShowRoom.service.SalesManagerService;

public class SalesManagerRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		SalesManagerService salesManagerService = spring
				.getBean(SalesManagerService.class);

		SalesManagerDTO dtos = new SalesManagerDTO("Hassu", 23);

		boolean saved = salesManagerService.validateAndThenSave(dtos);
		System.out.println("Saved:" + saved);

	}

}
