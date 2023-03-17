package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.WeaponType;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.repository.WeaponRepository;
import com.xworkz.application.repository.WeaponRepositoryImpl;
import com.xworkz.application.service.WeaponService;
import com.xworkz.application.service.WeaponServiceImp;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weapon = new WeaponDTO("Shannu", 21, 1500, "Steel", "Hassu", LocalDate.of(2020, 8, 18), "Mansik",
				"Shubhangi", "cutting", 300, WeaponType.KNIFE);

		WeaponRepository repo = new WeaponRepositoryImpl();

		WeaponService service = new WeaponServiceImp(repo);
		boolean save = service.validateAndThenSave(weapon);
		System.out.println("Saved:" + save);
		System.out.println(" ");

		WeaponDTO weapon1 = new WeaponDTO("Hassu", 21, 1500, "Steel", "shannu", LocalDate.of(2020, 8, 18), "Anita",
				"Shubhangi", "Chopping", 300, WeaponType.KNIFE);

		WeaponService service1 = new WeaponServiceImp(repo);
		boolean save1 = service1.validateAndThenSave(weapon1);
		System.out.println("Saved:" + save1);
	}

}
