package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {

	private ApplicationDTO application[] = new ApplicationDTO[5];
	private int index = 0;

	@Override
	public boolean save(ApplicationDTO dto) {
		System.out.println("Running dto: " + dto);
		if (this.index < this.application.length) {
			this.application[index] = dto;
			System.out.println("dto is saved: " + index);
			this.index++;
			return true;
		} else {
			System.out.println("Memory is out of bound");
		}
		return false;
	}

}
