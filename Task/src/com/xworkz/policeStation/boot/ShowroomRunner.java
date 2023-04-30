package com.xworkz.policeStation.boot;

import java.time.LocalDate;

import com.xworkz.policeStation.constatnt.ShowroomLocation;
import com.xworkz.policeStation.dto.ShowroomDTO;
import com.xworkz.policeStation.repository.ShowroomRepository;
import com.xworkz.policeStation.repository.ShowroomRepositoryImpl;
import com.xworkz.policeStation.service.ShowroomService;
import com.xworkz.policeStation.service.ShowroomServiceImpl;

public class ShowroomRunner {

	public static void main(String[] args) {
		ShowroomDTO showroomDTO = new ShowroomDTO(13, "Adidas", ShowroomLocation.SOAPFACTORY, 123123,
				LocalDate.of(2001, 9, 27), false);
		ShowroomRepository showroomRepository = new ShowroomRepositoryImpl();
		ShowroomService showroomService = new ShowroomServiceImpl(showroomRepository);
		boolean saved = showroomService.validateAndThanSave(showroomDTO);
		System.out.println(saved);

	}

}
