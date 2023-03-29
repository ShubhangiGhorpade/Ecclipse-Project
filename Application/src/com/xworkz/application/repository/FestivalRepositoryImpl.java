package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class FestivalRepositoryImpl implements FestivalRepository {

	private FestivalDTO festival[] = new FestivalDTO[3];
	private int index = 0;

	@Override
	public boolean save(FestivalDTO dto) {
		System.out.println("Running in FestivalRepo:" + dto);
		if (this.index < this.festival.length) {
			this.festival[index] = dto;
			System.out.println("Dto is saved:" + index);
			this.index++;
			return true;
		} else {
			System.out.println("Memory out of bound");
			throw new FestivalMemoryFullException("Memory out of Limit");
		}

	}

}
