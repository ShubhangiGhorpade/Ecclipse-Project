package com.xworkz.policeStation.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policeStation.dto.PoliceStationDTO;
import com.xworkz.policeStation.repository.PoliceStationRepository;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationRepository policeStationRepository;

	public PoliceStationServiceImpl(PoliceStationRepository policeStationRepository) {
		this.policeStationRepository = policeStationRepository;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {
		if (dto != null) {
			System.out.println("validate and then save in service:" + dto);

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<PoliceStationDTO>> validate = validator.validate(dto);
			System.out.println("total violation:" + validate.size());
			validate.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (validate.isEmpty()) {

				this.policeStationRepository.save(dto);
				return true;
			}
		}
		return false;
	}

}
