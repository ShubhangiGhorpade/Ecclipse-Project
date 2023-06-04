package com.xworkz.integration.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.integration.dto.MovieDTO;
import com.xworkz.integration.repository.MovieRepo;

public class MovieServiceImpl implements MovieService {

	private MovieRepo repo;

	@Override
	public boolean validateAndThenSave(MovieDTO dto) {
		if (dto != null) {

			ValidatorFactory factory = Validation
					.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<MovieDTO>> validate = validator
					.validate(dto);
			validate.forEach(cv -> System.out.println(
					cv.getPropertyPath() + " " + cv.getMessage()));
			if (validate.isEmpty()) {
				return this.repo.save(dto);
			} else {
				System.err.println("Not saved");
			}

		}
		return false;
	}

}
