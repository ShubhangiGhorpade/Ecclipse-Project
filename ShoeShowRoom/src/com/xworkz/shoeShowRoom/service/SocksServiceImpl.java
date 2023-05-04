package com.xworkz.shoeShowRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowRoom.dto.SocksDTO;
import com.xworkz.shoeShowRoom.repository.SocksRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SocksServiceImpl implements SocksService {

	private SocksRepository socksRepository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(SocksDTO dto) {
		if (dto != null) {
			System.out.println("Dto:" + dto);

			Set<ConstraintViolation<Set<ConstraintViolation<SocksDTO>>>> validate = validator
					.validate(this.validator.validate(dto));
			validate.forEach(cv -> System.err.println(
					cv.getPropertyPath() + " " + cv.getMessage()));
			if (validate.isEmpty()) {
				return this.socksRepository.save(dto);
			}

		}
		return false;
	}

}
