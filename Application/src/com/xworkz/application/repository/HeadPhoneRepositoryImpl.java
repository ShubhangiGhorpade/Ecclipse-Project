package com.xworkz.application.repository;

import com.xworkz.application.dto.HeadPhoneDTO;

public class HeadPhoneRepositoryImpl implements HeadPhoneRepository {

	private HeadPhoneDTO head[] = new HeadPhoneDTO[3];
	private int index = 0;

	@Override
	public boolean save(HeadPhoneDTO dto) {
		System.out.println("running in HeadPhoneRepositoryImpl: " + dto);
		if (this.index < this.head.length) {
			this.head[index] = dto;
			System.out.println("dto is saved at: " + index);
			this.index++;
			return true;
		} else {
			System.out.println("Memory is out of bound");
		}
		return false;
	}

}
