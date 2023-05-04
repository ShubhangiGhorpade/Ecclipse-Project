package com.xworkz.shoeShowRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.PolishDTO;

@Component
public class PolishRepositoryImpl implements PolishRepository {

	Collection<PolishDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(PolishDTO dto) {

		return this.dtos.add(dto);
	}

}
