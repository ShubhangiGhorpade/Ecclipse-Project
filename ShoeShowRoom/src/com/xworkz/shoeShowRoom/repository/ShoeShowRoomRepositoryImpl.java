package com.xworkz.shoeShowRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.ShoeShowRoomDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowRoomRepositoryImpl implements ShoeShowRoomRepository {

	Collection<ShoeShowRoomDTO> showRoom = new ArrayList<>();

	@Override
	public boolean save(ShoeShowRoomDTO dto) {

		return showRoom.add(dto);
	}

}
