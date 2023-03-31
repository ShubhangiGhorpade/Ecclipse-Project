package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepository;

import static com.xworkz.application.util.ValidateFestivalUtil.*;

public class FestivalServiceImpl implements FestivalService {

	private FestivalRepository repo;

	public FestivalServiceImpl(FestivalRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException {
		if (dto != null) {
			System.out.println("Dto is not null");
			int id = dto.getId();
			String name = dto.getName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			String godName = dto.getGodName();
			String sweet = dto.getSweet();

			boolean validId = false;
			boolean validName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validGodName = false;
			boolean validSweet = false;

			if (validInteger(id)) {
				System.out.println("Id is valid");
				validId = true;
			} else {
				System.err.println("Id is invalid");
			}
			if (validString(name)) {
				System.out.println("Name is valid");
				validName = true;
			} else {
				System.err.println("Name is invalid");
			}
			if (validStartDate(startDate)) {
				System.out.println("Start Date is valid");
				validStartDate = true;
			} else {
				System.err.println("Start Date is valid");
			}
			if (validStartDate(endDate) && endDate.isAfter(startDate)) {
				System.out.println("End Date is valid");
				validEndDate = true;
			} else {
				System.err.println("End Date is invalid");
			}
			if (validString(godName)) {
				System.out.println("GodName is valid");
				validGodName = true;
			} else {
				System.err.println("GodName is invalid");
			}
			if (validString(sweet)) {
				System.out.println("Sweet is valid");
				validSweet = true;
			} else {
				System.err.println("Sweet is invalid");
			}
			if (flags(validId && validName && validEndDate && validGodName && validStartDate && validSweet)) {
				System.out.println("Dto is valid");
				boolean exists = this.repo.isExist(dto);
				if (!exists) {
					boolean save = this.repo.save(dto);
					return save;
				} else {
					System.out.println("Doesnot Exists");
				}
			} else {
				System.err.println("Dto is invalid");
				throw new InvalidFestivalException("fill the proper requriment");
			}

		} else {
			System.err.println("Dto is null");
		}
		return false;
	}

	@Override
	public int totalCount() {
		return this.repo.totalCount();
	}

}
