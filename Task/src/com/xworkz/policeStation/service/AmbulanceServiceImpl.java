package com.xworkz.policeStation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policeStation.dto.AmbulanceDTO;
import com.xworkz.policeStation.repository.AmbulanceRepository;
import com.xworkz.policeStation.util.ValidateUtil;

public class AmbulanceServiceImpl implements AmbulanceService {

	private AmbulanceRepository ambulanceRepository;
	private ValidateUtil<AmbulanceDTO> validateUtil = new ValidateUtil<AmbulanceDTO>();

	public AmbulanceServiceImpl(AmbulanceRepository ambulanceRepository) {
		this.ambulanceRepository = ambulanceRepository;
	}

	@Override
	public boolean save(AmbulanceDTO dto) {
		if (dto != null) {
			System.out.println("Running in save:" + dto);
			if (validateUtil.validate(dto)) {
				return this.ambulanceRepository.save(dto);
			}
		}
		return false;
	}

}
