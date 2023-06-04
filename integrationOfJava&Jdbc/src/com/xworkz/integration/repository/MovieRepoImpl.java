package com.xworkz.integration.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.integration.dto.MovieDTO;

public class MovieRepoImpl implements MovieRepo{
	
	
	Collection<MovieDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(MovieDTO dto) {

		return this.dtos.add(dto);
	}


}
