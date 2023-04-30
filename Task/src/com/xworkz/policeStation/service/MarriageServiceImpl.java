package com.xworkz.policeStation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policeStation.dto.MarriageDTO;
import com.xworkz.policeStation.repository.MarriageRepository;
import com.xworkz.policeStation.util.ValidateUtil;

public class MarriageServiceImpl implements MarriageService {

	private MarriageRepository marriageRepository;
	private ValidateUtil<MarriageDTO> validateUtil = new ValidateUtil<MarriageDTO>();

	public MarriageServiceImpl(MarriageRepository marriageRepository) {
		this.marriageRepository = marriageRepository;
	}

	@Override
	public boolean validateAndThenSave(MarriageDTO dto) {
		System.out.println("Running validate and save:" + dto);

		if (validateUtil.validate(dto)) {
			return this.marriageRepository.save(dto);
		}
		return false;
	}

}
