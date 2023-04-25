package com.xworkz.policeStation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policeStation.dto.MarriageDTO;
import com.xworkz.policeStation.repository.MarriageRepository;

public class MarriageServiceImpl implements MarriageService {

	private MarriageRepository marriageRepository;

	public MarriageServiceImpl(MarriageRepository marriageRepository) {
		this.marriageRepository = marriageRepository;
	}

	@Override
	public boolean validateAndThenSave(MarriageDTO dto) {
		System.out.println("Running validate and save:" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MarriageDTO>> validate = validator.validate(dto);
		System.out.println(validate.size());
		validate.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
		if (validate.isEmpty()) {
			return this.marriageRepository.save(dto);
		}
		return false;
	}

}
