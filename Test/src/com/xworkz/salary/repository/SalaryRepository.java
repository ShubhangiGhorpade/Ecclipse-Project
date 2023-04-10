package com.xworkz.salary.repository;

import com.xworkz.salary.dto.SalaryDTO;

public interface SalaryRepository {

	boolean save(SalaryDTO dto);

	boolean isExist(SalaryDTO dto);

	SalaryDTO find(SalaryDTO dto);

	SalaryDTO findByNameAndSalary(String name, double salary);

	SalaryDTO findBySalaryOrNameOrGivenBy(String name, String givenBy, double salary);

	String findNameByNameAndGivenBy(String name, String givenBy);

	SalaryDTO[] findAll();

}
