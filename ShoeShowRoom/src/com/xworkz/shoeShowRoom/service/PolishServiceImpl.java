package com.xworkz.shoeShowRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.PolishDTO;
import com.xworkz.shoeShowRoom.repository.PolishRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {

	private PolishRepository polishRepository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(PolishDTO dto) {
		if (dto != null) {
			System.out.println("Dto:" + dto);
			Set<ConstraintViolation<PolishDTO>> validate = validator
					.validate(dto);
			validate.forEach(cv -> System.err.println(
					cv.getPropertyPath() + " " + cv.getMessage()));
			if (validate.isEmpty()) {
				return this.polishRepository.save(dto);
			}
		}
		return false;
	}

}
