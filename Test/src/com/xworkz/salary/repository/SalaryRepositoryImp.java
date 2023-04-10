package com.xworkz.salary.repository;

import com.xworkz.salary.dto.SalaryDTO;

public class SalaryRepositoryImp implements SalaryRepository {

	private SalaryDTO[] salary = new SalaryDTO[3];
	private int salaryIndex = 0;

	@Override
	public boolean save(SalaryDTO dto) {
		if (this.salaryIndex < this.salary.length) {
			this.salary[this.salaryIndex] = dto;
			System.out.println("Index:" + this.salaryIndex);
			this.salaryIndex++;
			return true;
		}
		return false;
	}

	@Override
	public boolean isExist(SalaryDTO dto) {
		if (this.salaryIndex == 0) {
			System.out.println("first element is saved");
			return false;
		} else {
			for (int index = 0; index < this.salary.length; index++) {
				SalaryDTO element = this.salary[index];
				if (element != null && element.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public SalaryDTO find(SalaryDTO dto) {
		if (dto != null) {
			System.out.println("dto not null");
			return dto;
		}

		return null;
	}

	@Override
	public SalaryDTO findByNameAndSalary(String name, double salary) {
		for (int index = 0; index < this.salaryIndex; index++) {
			SalaryDTO element1 = this.salary[index];
			if (element1 != null && element1.getName().equals(name) && element1.getSalary() == salary) {
				return element1;
			}
		}
		return null;
	}

	@Override
	public String findNameByNameAndGivenBy(String name, String givenBy) {
		for (int index = 0; index < this.salaryIndex; index++) {
			SalaryDTO element2 = this.salary[index];
			if (element2 != null && element2.getName().equals(name) && element2.getGivenBy().equals(givenBy)) {
				return element2.getName();
			}
		}
		return null;
	}

	@Override
	public SalaryDTO[] findAll() {
		if (this.salaryIndex != 0) {
			return salary;
		}
		return null;
	}

	@Override
	public SalaryDTO findBySalaryOrNameOrGivenBy(String name, String givenBy, double salary) {
		for (int index = 0; index < this.salaryIndex; index++) {
			SalaryDTO element4 = this.salary[index];
			if (element4 != null && element4.getName().equals(name) || element4.getGivenBy().equals(givenBy)
					|| element4.getSalary() == salary) {
				return element4;
			}
		}
		return null;
	}

}
