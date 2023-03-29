package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class FestivalDTO implements Serializable {

	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String godName;
	private String sweet;

	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", godName=" + godName + ", sweet=" + sweet + "]";
	}

	public FestivalDTO() {
		System.out.println("No arg constructor in FestivalDTO");
	}

	public FestivalDTO(int id, String name, LocalDate startDate, LocalDate endDate, String godName, String sweet) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.godName = godName;
		this.sweet = sweet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(endDate, godName, id, name, startDate, sweet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof FestivalDTO)) {
			return false;
		}
		FestivalDTO other = (FestivalDTO) obj;
		return Objects.equals(endDate, other.endDate) && Objects.equals(godName, other.godName) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(startDate, other.startDate)
				&& Objects.equals(sweet, other.sweet);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getGodName() {
		return godName;
	}

	public String getSweet() {
		return sweet;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

}
