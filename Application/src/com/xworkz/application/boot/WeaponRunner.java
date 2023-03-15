package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.WeaponType;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.service.WeaponService;
import com.xworkz.application.service.WeaponServiceImp;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weapon = new WeaponDTO("Shannu", 21, 1500, "Steel", "Hassu", LocalDate.of(2020, 8, 18), "Mansik",
				"Shubhangi", "cutting", 300, WeaponType.KNIFE);

		WeaponService service = new WeaponServiceImp();
		boolean save = service.validateAndThenSave(weapon);
		System.out.println("Saved:" + save);
	}

}
