package com.xworkz.policeStation.boot;

import java.time.LocalDate;

import com.xworkz.policeStation.dto.AmbulanceDTO;
import com.xworkz.policeStation.repository.AmbulanceRepository;
import com.xworkz.policeStation.repository.AmbulanceRepositoryImpl;
import com.xworkz.policeStation.service.AmbulanceService;
import com.xworkz.policeStation.service.AmbulanceServiceImpl;

public class AmbulanceRunner {

	public static void main(String[] args) {
		AmbulanceDTO dto = new AmbulanceDTO(20, 1234, 1234345l, "Shaanu", LocalDate.of(2022, 8, 21), "Shaan",
				LocalDate.of(2024, 2, 16));

		AmbulanceRepository ambulanceRepository = new AmbulanceRepositoryImpl();

		AmbulanceService ambulanceService = new AmbulanceServiceImpl(ambulanceRepository);
		boolean save = ambulanceService.save(dto);
		System.out.println(save);

	}

}
