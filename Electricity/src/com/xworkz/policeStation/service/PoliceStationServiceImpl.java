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
import com.xworkz.policeStation.util.ValidateUtil;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationRepository policeStationRepository;
	private ValidateUtil<PoliceStationDTO> validateUtil=new ValidateUtil<PoliceStationDTO>();

	public PoliceStationServiceImpl(PoliceStationRepository policeStationRepository) {
		this.policeStationRepository = policeStationRepository;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {
		if (dto != null) {
			System.out.println("validate and then save in service:" + dto);
			if (validateUtil.validate(dto)) {

				this.policeStationRepository.save(dto);
				return true;
			}
		}
		return false;
	}

}
