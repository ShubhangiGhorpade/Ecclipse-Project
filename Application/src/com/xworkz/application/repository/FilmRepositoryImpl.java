package com.xworkz.application.repository;

import com.xworkz.application.dto.FilmDTO;
import com.xworkz.application.dto.HeadPhoneDTO;

public class FilmRepositoryImpl implements FilmRepository {

	private FilmDTO dto[] = new FilmDTO[4];
	private int index = 0;

	@Override
	public boolean save(FilmDTO dto) {
		System.out.println("running in save:" + dto);
		if (this.index < this.dto.length) {

			this.dto[index] = dto;
			System.out.println("dto is saved:"+index);
			this.index++;
			return true;
		} else {
			System.out.println("Memory out of bound");

		}
		return false;
	}

}
