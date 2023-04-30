package com.xworkz.policeStation.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policeStation.dto.MarriageDTO;

public class ValidateUtil<S> {

	public boolean validate(S s) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<S>> validate = validator.validate(s);
		validate.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
		return validate.isEmpty();
	}

}
