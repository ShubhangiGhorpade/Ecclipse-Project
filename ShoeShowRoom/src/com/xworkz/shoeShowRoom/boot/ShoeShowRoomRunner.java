package com.xworkz.shoeShowRoom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowRoom.configuration.SpringConfiguration;
import com.xworkz.shoeShowRoom.dto.ShoeShowRoomDTO;
import com.xworkz.shoeShowRoom.service.ShoeShowroomService;

public class ShoeShowRoomRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);
		ShoeShowroomService showroomService = spring
				.getBean(ShoeShowroomService.class);

		ShoeShowRoomDTO dto = new ShoeShowRoomDTO(3, "Adidas",
				"Bangalor", "GST9876");

		boolean saved = showroomService.validateAndThenSave(dto);
		System.out.println("Saved:" + saved);

	}

}
