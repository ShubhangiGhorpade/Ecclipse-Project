package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class AttendanceDTO implements Serializable {

	private String name;
	private char division;
	private boolean present;
	private LocalDate date;
	private LocalTime time;

	public AttendanceDTO() {
		System.out.println("No arg const in Attendance");
	}

	@Override
	public String toString() {
		return "AttendanceDTO [name=" + name + ", division=" + division + ", present=" + present + ", date=" + date
				+ ", time=" + time + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, division, name, present, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AttendanceDTO)) {
			return false;
		}
		AttendanceDTO other = (AttendanceDTO) obj;
		return Objects.equals(date, other.date) && division == other.division && Objects.equals(name, other.name)
				&& present == other.present && Objects.equals(time, other.time);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

}
