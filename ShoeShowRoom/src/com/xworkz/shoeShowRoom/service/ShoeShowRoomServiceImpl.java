package com.xworkz.shoeShowRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.ShoeShowRoomDTO;
import com.xworkz.shoeShowRoom.repository.ShoeShowRoomRepositoryImpl;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowRoomServiceImpl implements ShoeShowroomService {

	private ShoeShowRoomRepositoryImpl shoeShowRoomRepositoryImpl;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(ShoeShowRoomDTO dto) {
		if (dto != null) {
			System.out.println("dto :" + dto);

			Set<ConstraintViolation<ShoeShowRoomDTO>> validate = this.validator
					.validate(dto);

			if (!validate.isEmpty()) {
				validate.forEach(cv -> System.err.println(
						cv.getPropertyPath() + " " + cv.getMessage()));
				return false;
			} else {
				return this.shoeShowRoomRepositoryImpl.save(dto);
			}
		}
		return false;
	}

}
