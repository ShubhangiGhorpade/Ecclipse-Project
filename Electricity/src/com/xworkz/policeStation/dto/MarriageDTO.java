package com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MarriageDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 1)
	@Max(value = 100)
	private int id;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String brideName;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String groomName;
	@NotNull
	private boolean arranged;
	@Future
	private LocalDate date;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String hallName;
	@Min(value = 1)
	@Max(value = 100)
	private int noOfPeopleInvited;
	@NotNull
	private boolean dowry;

	public MarriageDTO() {
		// TODO Auto-generated constructor stub
	}

	public MarriageDTO(int id, String brideName, String groomName, boolean arranged, LocalDate date, String hallName,
			int noOfPeopleInvited, boolean dowry) {
		super();
		this.id = id;
		this.brideName = brideName;
		this.groomName = groomName;
		this.arranged = arranged;
		this.date = date;
		this.hallName = hallName;
		this.noOfPeopleInvited = noOfPeopleInvited;
		this.dowry = dowry;
	}

	@Override
	public String toString() {
		return "MarriageDTO [id=" + id + ", brideName=" + brideName + ", groomName=" + groomName + ", arranged="
				+ arranged + ", date=" + date + ", hallName=" + hallName + ", noOfPeopleInvited=" + noOfPeopleInvited
				+ ", dowry=" + dowry + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(arranged, brideName, date, dowry, groomName, hallName, id, noOfPeopleInvited);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MarriageDTO)) {
			return false;
		}
		MarriageDTO other = (MarriageDTO) obj;
		return arranged == other.arranged && Objects.equals(brideName, other.brideName)
				&& Objects.equals(date, other.date) && dowry == other.dowry
				&& Objects.equals(groomName, other.groomName) && Objects.equals(hallName, other.hallName)
				&& id == other.id && noOfPeopleInvited == other.noOfPeopleInvited;
	}

	public int getId() {
		return id;
	}

	public String getBrideName() {
		return brideName;
	}

	public String getGroomName() {
		return groomName;
	}

	public boolean isArranged() {
		return arranged;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getHallName() {
		return hallName;
	}

	public int getNoOfPeopleInvited() {
		return noOfPeopleInvited;
	}

	public boolean isDowry() {
		return dowry;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrideName(String brideName) {
		this.brideName = brideName;
	}

	public void setGroomName(String groomName) {
		this.groomName = groomName;
	}

	public void setArranged(boolean arranged) {
		this.arranged = arranged;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public void setNoOfPeopleInvited(int noOfPeopleInvited) {
		this.noOfPeopleInvited = noOfPeopleInvited;
	}

	public void setDowry(boolean dowry) {
		this.dowry = dowry;
	}

	@Override
	public int compareTo(AmbulanceDTO o) {

		return this.getBrideName().compareTo(brideName);
	}

}
