package com.xworkz.application.boot;

import java.time.LocalDate;
import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Colour;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadPhoneDTO;
import com.xworkz.application.repository.HeadPhoneRepository;
import com.xworkz.application.repository.HeadPhoneRepositoryImpl;
import com.xworkz.application.service.HeadPhoneService;
import com.xworkz.application.service.HeadPhoneServiceImp;

public class HeadPhoneRunner {

	public static void main(String[] args) {
		HeadPhoneDTO head = new HeadPhoneDTO("2Lb17", 500, false, "Shannu", 28, LocalDate.of(2021, 2, 5), 6, Brand.BOAT,
				Colour.BLACK, TypeAndWeight.NO_EAR);

		HeadPhoneRepository repo = new HeadPhoneRepositoryImpl();

		HeadPhoneService phone = new HeadPhoneServiceImp(repo);
		boolean save = phone.validateAndThenSave(head);
		System.out.println(save);
		System.out.println(" ");
		HeadPhoneDTO head1 = new HeadPhoneDTO("273SS", 500, false, "Shaho", 28, LocalDate.of(2021, 2, 5), 6, Brand.BOAT,
				Colour.WHITE, TypeAndWeight.OVER_EAR);

		HeadPhoneService phone1 = new HeadPhoneServiceImp(repo);
		boolean save1 = phone1.validateAndThenSave(head1);
		System.out.println(save1);
	}
}
