package com.xworkz.application.boot;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.repository.AddressRepository;
import com.xworkz.application.repository.AddressRepositoryImpl;
import com.xworkz.application.service.AddressService;
import com.xworkz.application.service.AddressServiceImp;

public class AddressRunner {

	public static void main(String[] args) {
		AddressDTO dto = new AddressDTO("Wardno-4", "Zunjoorkhup galli", "Pune", "Maharastra", 21, 587313, 2);

		AddressRepository repo = new AddressRepositoryImpl();

		AddressService service = new AddressServiceImp(repo);
		boolean save = service.validateAndThenSave(dto);
		System.out.println(save);

		service.find(dto);
		service.findByCityAndState("Pune", "Maharastra");
		service.findByNumber(21);
		service.findByPinCode(587313);
		service.findByStreet("Wardno-4");
		service.findByStreetAndPinCodeAndArea("Wardno-4", "Zunjoorkhup galli", 587313);
		service.findCityByNumberAndFloorAndStreetAndPinCode("Wardno-4", 2, 587313, 21);
		service.findFloorByNumber(21);
		service.findPinCodeByNumber(21);
		service.total();

	}

}
