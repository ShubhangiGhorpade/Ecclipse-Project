package com.xworkz.shoeShowRoom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowRoom.configuration.SpringConfiguration;
import com.xworkz.shoeShowRoom.dto.SocksDTO;
import com.xworkz.shoeShowRoom.service.SocksService;

public class SocksRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		SocksService socksService = spring.getBean(SocksService.class);

		SocksDTO dto = new SocksDTO(6, "Black");

		boolean save = socksService.validateAndThenSave(dto);
		System.out.println("Saved:" + save);

	}

}
