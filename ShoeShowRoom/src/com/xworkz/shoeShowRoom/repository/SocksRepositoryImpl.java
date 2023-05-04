package com.xworkz.shoeShowRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.SocksDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SocksRepositoryImpl implements SocksRepository {

	Collection<SocksDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(SocksDTO dto) {

		return this.dtos.add(dto);
	}

}
