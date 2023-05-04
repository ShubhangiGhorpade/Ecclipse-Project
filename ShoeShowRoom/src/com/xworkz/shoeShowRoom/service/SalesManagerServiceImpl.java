package com.xworkz.shoeShowRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.SalesManagerDTO;
import com.xworkz.shoeShowRoom.repository.SalesManagerRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagerService {

	private SalesManagerRepository salesManagerRepository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(SalesManagerDTO dto) {
		if (dto != null) {
			System.out.println("Dto:" + dto);
			Set<ConstraintViolation<SalesManagerDTO>> validate = validator
					.validate(dto);
			validate.forEach(cv -> System.err.println(
					cv.getPropertyPath() + " " + cv.getMessage()));
			if (validate.isEmpty()) {
				return this.salesManagerRepository.save(dto);
			}

		}
		return false;
	}
}
