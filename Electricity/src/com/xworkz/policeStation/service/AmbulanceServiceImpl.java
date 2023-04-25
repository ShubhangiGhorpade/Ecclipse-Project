package com.xworkz.policeStation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policeStation.dto.AmbulanceDTO;
import com.xworkz.policeStation.repository.AmbulanceRepository;

public class AmbulanceServiceImpl implements AmbulanceService {

	private AmbulanceRepository ambulanceRepository;

	public AmbulanceServiceImpl(AmbulanceRepository ambulanceRepository) {
		this.ambulanceRepository = ambulanceRepository;
	}

	@Override
	public boolean save(AmbulanceDTO dto) {
		if (dto != null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<AmbulanceDTO>> validate = validator.validate(dto);
			System.out.println(validate.size());
			validate.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (validate.isEmpty()) {
				return this.ambulanceRepository.save(dto);
			}
		}
		return false;
	}

}
