package com.xworkz.policeStation.boot;

import java.time.LocalDate;

import com.xworkz.policeStation.dto.MarriageDTO;
import com.xworkz.policeStation.repository.MarriageRepository;
import com.xworkz.policeStation.repository.MarriageRepositoryImpl;
import com.xworkz.policeStation.service.MarriageService;
import com.xworkz.policeStation.service.MarriageServiceImpl;

public class MarriageRunner {

	public static void main(String[] args) {
		MarriageDTO dto = new MarriageDTO(21, "Akashata", "Hassu", false, LocalDate.of(2024, 5, 26), "swapna", 100,
				false);

		MarriageRepository marriageRepository = new MarriageRepositoryImpl();

		MarriageService marriageService = new MarriageServiceImpl(marriageRepository);
		boolean save = marriageService.validateAndThenSave(dto);
		System.out.println(save);

	}

}
