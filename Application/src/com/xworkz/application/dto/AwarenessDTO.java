package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AwarenessDTO implements Serializable {

	private String location;
	private String type;
	private int noOfPeople;
	private String initiatedBy;
	private LocalDate date;

	public AwarenessDTO() {
		System.out.println("No Arg constrt in Awareness");
	}

	@Override
	public String toString() {
		return "AwarenessDTO [location=" + location + ", type=" + type + ", noOfPeople=" + noOfPeople + ", initiatedBy="
				+ initiatedBy + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, initiatedBy, location, noOfPeople, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AwarenessDTO)) {
			return false;
		}
		AwarenessDTO other = (AwarenessDTO) obj;
		return Objects.equals(date, other.date) && Objects.equals(initiatedBy, other.initiatedBy)
				&& Objects.equals(location, other.location) && noOfPeople == other.noOfPeople
				&& Objects.equals(type, other.type);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public String getInitiatedBy() {
		return initiatedBy;
	}

	public void setInitiatedBy(String initiatedBy) {
		this.initiatedBy = initiatedBy;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
