package com.xworkz.shoeShowRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.SalesManagerDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerRepositoryImpl implements SalesManagerRepository {

	Collection<SalesManagerDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(SalesManagerDTO dto) {

		return this.dtos.add(dto);
	}

}
