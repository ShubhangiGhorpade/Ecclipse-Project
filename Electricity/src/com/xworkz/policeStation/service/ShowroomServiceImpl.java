package com.xworkz.policeStation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policeStation.dto.ShowroomDTO;
import com.xworkz.policeStation.repository.ShowroomRepository;

public class ShowroomServiceImpl implements ShowroomService {
	private ShowroomRepository showroomRepository;

	public ShowroomServiceImpl(ShowroomRepository showroomRepository) {
		this.showroomRepository = showroomRepository;
	}

	@Override
	public boolean validateAndThanSave(ShowroomDTO dto) {
		System.out.println("Running validateAndThanSave in ShowroomServiceImpl: " + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<ShowroomDTO>> constrints = validator.validate(dto);
			System.out.println("Total violation :" + constrints.size());
			constrints.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (constrints.isEmpty()) {
				System.out.println("no violation in Constrints");

				return this.showroomRepository.save(dto);
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
