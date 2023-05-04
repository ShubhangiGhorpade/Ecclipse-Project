package com.xworkz.shoeShowRoom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowRoom.configuration.SpringConfiguration;
import com.xworkz.shoeShowRoom.dto.PolishDTO;
import com.xworkz.shoeShowRoom.service.PolishService;

public class PolishRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		PolishService polishService = spring.getBean(PolishService.class);

		PolishDTO dtos = new PolishDTO(21, "Saan");

		boolean save = polishService.validateAndThenSave(dtos);
		System.out.println("Saved:" + save);

	}

}
