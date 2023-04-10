package com.xworkz.salary.service;

import java.time.LocalDate;

import com.xworkz.salary.dto.SalaryDTO;
import com.xworkz.salary.exception.InvalidDataException;
import com.xworkz.salary.repository.SalaryRepository;

import static com.xworkz.salary.util.SalaryUtil.*;

public class SalaryServiceImp implements SalaryService {

	private SalaryRepository repository;

	public SalaryServiceImp(SalaryRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndThenSave(SalaryDTO dto) throws InvalidDataException {
		if (dto != null) {
			System.out.println("dto is not null");

			String name = dto.getName();
			double salary = dto.getSalary();
			LocalDate givenOn = dto.getGivenOn();
			String givenBy = dto.getGivenBy();
			String company = dto.getCompany();

			boolean validName = false;
			boolean validSalary = false;
			boolean validGivenOn = false;
			boolean validGivenBy = false;
			boolean validCompany = false;

			if (validString(name)) {
				System.out.println("Name is valid");
				validName = true;
			} else {
				System.err.println("Name is not valid");
			}

			if (validString(company)) {
				System.out.println("company is valid");
				validCompany = true;
			} else {
				System.err.println("company is not valid");
			}
			if (validString(givenBy)) {
				System.out.println("givenBy is valid");
				validGivenBy = true;
			} else {
				System.err.println("givenBy is not valid");
			}
			if (validDouble(salary)) {
				System.out.println("salary is valid");
				validSalary = true;
			} else {
				System.err.println("salary is invalid");
			}
			if (date(givenOn)) {
				System.out.println("givenOn is valid");
				validGivenOn = true;
			} else {
				System.err.println("givenOn is invalid");
			}
			if (validFlag(validCompany && validGivenBy && validGivenOn && validName && validSalary)) {

				boolean exists = this.repository.isExist(dto);
				if (!exists) {
					boolean save = this.repository.save(dto);
					System.out.println("dto saved");
					return save;
				}
			} else {
				System.out.println("Dto not saved");
			}

		} else {

			System.err.println("dto is null");
			throw new InvalidDataException("Fill proper Data");
		}
		return false;
	}

	@Override
	public SalaryDTO find(SalaryDTO dto) {
		if (dto != null) {
			return this.repository.find(dto);
		}
		return null;
	}

	@Override
	public SalaryDTO findByNameAndSalary(String name, double salary) {
		if (validString(name) && validDouble(salary)) {
			return this.repository.findByNameAndSalary(name, salary);
		}
		return null;
	}

	@Override
	public SalaryDTO findBySalaryOrNameOrGivenBy(String name, String givenBy, double salary) {
		if (validString(name) && validString(givenBy) && validDouble(salary)) {
			return this.repository.findBySalaryOrNameOrGivenBy(name, givenBy, salary);
		}
		return null;
	}

	@Override
	public String findNameByNameAndGivenBy(String name, String givenBy) {
		if (validString(name) && validString(givenBy)) {
			return this.repository.findNameByNameAndGivenBy(name, givenBy);
		}
		return null;
	}

	@Override
	public SalaryDTO[] findAll() {
		SalaryDTO[] ownDto = new SalaryDTO[3];
		SalaryDTO[] repoDto = this.repository.findAll();

		int i = 0;
		if (i < repoDto.length) {
			for (int j = 0; j < repoDto.length; j++) {
				if (repoDto[j] != null) {
					ownDto[i] = repoDto[j];
					System.out.println(ownDto[i]);
					i++;
				}
			}
		}

		return ownDto;

	}

}