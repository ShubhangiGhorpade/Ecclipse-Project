package com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 1)
	@Max(value = 100)
	private int id;
	@Min(value = 1)
	@Max(value = 10000)
	private int regNo;
	@Min(value = 1)
	@Max(value = 10000000)
	private long chasisNo;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String ownerName;
	@Past
	private LocalDate insuranceExpired;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String driverName;
	@Future
	private LocalDate taxStartDate;

	public AmbulanceDTO() {
		System.out.println("No Arg constructor");
	}

	public AmbulanceDTO(int id, int regNo, long chasisNo, String ownerName, LocalDate insuranceExpired,
			String driverName, LocalDate taxStartDate) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.chasisNo = chasisNo;
		this.ownerName = ownerName;
		this.insuranceExpired = insuranceExpired;
		this.driverName = driverName;
		this.taxStartDate = taxStartDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chasisNo, driverName, id, insuranceExpired, ownerName, regNo, taxStartDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AmbulanceDTO)) {
			return false;
		}
		AmbulanceDTO other = (AmbulanceDTO) obj;
		return chasisNo == other.chasisNo && Objects.equals(driverName, other.driverName) && id == other.id
				&& Objects.equals(insuranceExpired, other.insuranceExpired)
				&& Objects.equals(ownerName, other.ownerName) && regNo == other.regNo
				&& Objects.equals(taxStartDate, other.taxStartDate);
	}

	public int getId() {
		return id;
	}

	public int getRegNo() {
		return regNo;
	}

	public long getChasisNo() {
		return chasisNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public LocalDate getInsuranceExpired() {
		return insuranceExpired;
	}

	public String getDriverName() {
		return driverName;
	}

	public LocalDate getTaxStartDate() {
		return taxStartDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public void setChasisNo(long chasisNo) {
		this.chasisNo = chasisNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setInsuranceExpired(LocalDate insuranceExpired) {
		this.insuranceExpired = insuranceExpired;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setTaxStartDate(LocalDate taxStartDate) {
		this.taxStartDate = taxStartDate;
	}

	@Override
	public int compareTo(AmbulanceDTO o) {

		return this.getDriverName().compareTo(o.getDriverName());
	}

}
