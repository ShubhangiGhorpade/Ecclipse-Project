package com.xworkz.application.repository;

import com.xworkz.application.dto.WeaponDTO;

public class WeaponRepositoryImpl implements WeaponRepository {
	private WeaponDTO weapon[] = new WeaponDTO[3];
	private int index = 0;

	@Override
	public boolean save(WeaponDTO dto) {
		System.out.println("Running in weaponRepository: " + dto);
		if (this.index < this.weapon.length) {
			this.weapon[index] = dto;
			System.out.println("dto is saved: " + index);
			this.index++;
			return true;
		} else {
			System.out.println("Memory is out of bound");
		}
		return false;
	}

}
