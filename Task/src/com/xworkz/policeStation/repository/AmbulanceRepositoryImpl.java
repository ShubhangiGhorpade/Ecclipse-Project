package com.xworkz.policeStation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policeStation.dto.AmbulanceDTO;

public class AmbulanceRepositoryImpl implements AmbulanceRepository {

	Collection<AmbulanceDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(AmbulanceDTO dto) {

		return this.dtos.add(dto);
	}

}
