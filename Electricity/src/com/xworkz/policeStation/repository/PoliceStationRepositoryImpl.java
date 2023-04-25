package com.xworkz.policeStation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policeStation.dto.PoliceStationDTO;

public class PoliceStationRepositoryImpl implements PoliceStationRepository {

	Collection<PoliceStationDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(PoliceStationDTO dto) {
		System.out.println("Running save in PoliceStationRepositoryImpl :"+dto);
			return this.dtos.add(dto);
		
	}

}
