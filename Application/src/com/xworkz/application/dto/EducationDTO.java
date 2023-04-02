package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class EducationDTO implements Serializable {

	private int id;
	private String degreeName;
	private double percentage;
	private String university;
	private LocalDate startDate;
	private LocalDate endDate;
	private int backlog;
	private String stream;
	private String candidateName;

	public EducationDTO() {
		System.out.println("No Arg const in EducationDTO");
	}

	public EducationDTO(int id, String degreeName, double percentage, String university, LocalDate startDate,
			LocalDate endDate, int backlog, String stream, String candidateName) {
		super();
		this.id = id;
		this.degreeName = degreeName;
		this.percentage = percentage;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlog = backlog;
		this.stream = stream;
		this.candidateName = candidateName;
	}

	@Override
	public String toString() {
		return "EducationDTO [id=" + id + ", degreeName=" + degreeName + ", percentage=" + percentage + ", university="
				+ university + ", startDate=" + startDate + ", endDate=" + endDate + ", backlog=" + backlog
				+ ", stream=" + stream + ", candidateName=" + candidateName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(backlog, candidateName, degreeName, endDate, id, percentage, startDate, stream, university);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EducationDTO)) {
			return false;
		}
		EducationDTO other = (EducationDTO) obj;
		return backlog == other.backlog && Objects.equals(candidateName, other.candidateName)
				&& Objects.equals(degreeName, other.degreeName) && Objects.equals(endDate, other.endDate)
				&& id == other.id && Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& Objects.equals(startDate, other.startDate) && Objects.equals(stream, other.stream)
				&& Objects.equals(university, other.university);
	}

	public int getId() {
		return id;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getUniversity() {
		return university;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public int getBacklog() {
		return backlog;
	}

	public String getStream() {
		return stream;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

}
