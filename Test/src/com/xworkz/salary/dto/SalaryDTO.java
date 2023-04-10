package com.xworkz.salary.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class SalaryDTO implements Serializable {

	private String name;
	private double salary;
	private LocalDate givenOn;
	private String givenBy;
	private String company;

	public SalaryDTO() {
		System.out.println("No Arg constructor in SalaryDTO");
	}

	public SalaryDTO(String name, double salary, LocalDate givenOn, String givenBy, String company) {
		super();
		this.name = name;
		this.salary = salary;
		this.givenOn = givenOn;
		this.givenBy = givenBy;
		this.company = company;
	}

	@Override
	public String toString() {
		return "SalaryDTO [name=" + name + ", salary=" + salary + ", givenOn=" + givenOn + ", givenBy=" + givenBy
				+ ", company=" + company + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, givenBy, givenOn, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SalaryDTO)) {
			return false;
		}
		SalaryDTO other = (SalaryDTO) obj;
		return Objects.equals(company, other.company) && Objects.equals(givenBy, other.givenBy)
				&& Objects.equals(givenOn, other.givenOn) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getGivenOn() {
		return givenOn;
	}

	public String getGivenBy() {
		return givenBy;
	}

	public String getCompany() {
		return company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setGivenOn(LocalDate givenOn) {
		this.givenOn = givenOn;
	}

	public void setGivenBy(String givenBy) {
		this.givenBy = givenBy;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
