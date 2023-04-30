package com.xworkz.policeStation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policeStation.dto.MarriageDTO;

public class MarriageRepositoryImpl implements MarriageRepository {

	Collection<MarriageDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(MarriageDTO dto) {
		System.out.println("Running save:" + dto);

		return this.dtos.add(dto);
	}

}
