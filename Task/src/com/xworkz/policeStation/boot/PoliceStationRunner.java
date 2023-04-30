package com.xworkz.policeStation.boot;

import com.xworkz.policeStation.constatnt.CellNum;
import com.xworkz.policeStation.dto.PoliceStationDTO;
import com.xworkz.policeStation.repository.PoliceStationRepository;
import com.xworkz.policeStation.repository.PoliceStationRepositoryImpl;
import com.xworkz.policeStation.service.PoliceStationService;
import com.xworkz.policeStation.service.PoliceStationServiceImpl;

public class PoliceStationRunner {

	public static void main(String[] args) {
		PoliceStationDTO policeStationDTO = new PoliceStationDTO(0, "Sangram", "Mumbai", CellNum.THREE, "Akash");
		PoliceStationRepository policeStationRepository = new PoliceStationRepositoryImpl();
		PoliceStationService policeStationService = new PoliceStationServiceImpl(policeStationRepository);
		boolean save = policeStationService.validateAndSave(policeStationDTO);
		System.out.println(save);

	}

}
