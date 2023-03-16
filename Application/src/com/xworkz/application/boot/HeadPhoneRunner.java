package com.xworkz.application.boot;

import java.time.LocalDate;
import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Colour;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadPhoneDTO;
import com.xworkz.application.service.HeadPhoneService;
import com.xworkz.application.service.HeadPhoneServiceImp;

public class HeadPhoneRunner {

	public static void main(String[] args) {
		HeadPhoneDTO head = new HeadPhoneDTO("2Lb17", 500, false, "Shannu", 28, LocalDate.of(2021, 2, 5), 6, Brand.BOAT,
				Colour.BLACK, TypeAndWeight.NO_EAR);

		HeadPhoneService phone = new HeadPhoneServiceImp();
		boolean save = phone.validateAndThenSave(head);
		System.out.println(save);
	}
}
