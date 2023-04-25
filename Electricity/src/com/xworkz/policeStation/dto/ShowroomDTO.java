package com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.time.DurationMax;
import org.hibernate.validator.constraints.time.DurationMin;

import com.xworkz.policeStation.constatnt.ShowroomLocation;

public class ShowroomDTO implements Serializable, Comparable<ShowroomDTO> {
	@NotNull(message = "id is not null")
	@Max(value = 100, message = "id should be less than 100")
	@Min(value = 2, message = "id should be greater than 2")

	private int id;
	@NotNull(message = "name should not be null")
	@NotEmpty(message = "name should not bi empty")
	@Size(max = 20, min = 2, message = "name must cantaince at least 2 char and max is 20 char")

	private String name;

	private ShowroomLocation location;
	@Min(value = 1, message = "number must cantains atliast 1")
	@Max(value = 99999999, message = "max is 9999999")

	private long number;

	@PastOrPresent
	private LocalDate openDate;
	private boolean closed;

	public ShowroomDTO() {

	}

	public ShowroomDTO(int id, String name, ShowroomLocation location, long number, LocalDate openDate,
			boolean closed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.number = number;
		this.openDate = openDate;
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "ShowroomDTO [id=" + id + ", name=" + name + ", location=" + location + ", number=" + number
				+ ", openDate=" + openDate + ", closed=" + closed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(closed, id, location, name, number, openDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ShowroomDTO)) {
			return false;
		}
		ShowroomDTO other = (ShowroomDTO) obj;
		return closed == other.closed && id == other.id && location == other.location
				&& Objects.equals(name, other.name) && number == other.number
				&& Objects.equals(openDate, other.openDate);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ShowroomLocation getLocation() {
		return location;
	}

	public long getNumber() {
		return number;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(ShowroomLocation location) {
		this.location = location;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	@Override
	public int compareTo(ShowroomDTO o) {
		return this.name.compareTo(o.getName());
	}

}
