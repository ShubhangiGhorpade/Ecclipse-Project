package com.xworkz.policeStation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policeStation.dto.ShowroomDTO;

public class ShowroomRepositoryImpl implements ShowroomRepository {
   
	Collection<ShowroomDTO> dtos=new ArrayList<>();
	
	@Override
	public boolean save(ShowroomDTO dto) {
		System.out.println("Running save in ShowroomRepositoryImpl :"+dto);
	
			return this.dtos.add(dto);
		
	
	}

}
