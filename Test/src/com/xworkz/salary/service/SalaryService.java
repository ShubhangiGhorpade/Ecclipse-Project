package com.xworkz.salary.service;

import com.xworkz.salary.dto.SalaryDTO;
import com.xworkz.salary.exception.InvalidDataException;

public interface SalaryService {

	boolean validateAndThenSave(SalaryDTO dto) throws InvalidDataException;

	SalaryDTO find(SalaryDTO dto);

	SalaryDTO findByNameAndSalary(String name, double salary);

	SalaryDTO findBySalaryOrNameOrGivenBy(String name, String givenBy, double salary);

	String findNameByNameAndGivenBy(String name, String givenBy);

	SalaryDTO[] findAll();
}
