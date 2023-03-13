package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO implements Serializable {

	private String developedBy;
	private int since;
	private LocalDate date;
	private String appName;
	private double size;

	public ApplicationDTO() {
		System.out.println("No Arg constr in Application");
	}

	@Override
	public String toString() {
		return "Application [developedBy=" + developedBy + ", since=" + since + ", date=" + date + ", appName="
				+ appName + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(appName, date, developedBy, since, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ApplicationDTO)) {
			return false;
		}
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(appName, other.appName) && Objects.equals(date, other.date)
				&& Objects.equals(developedBy, other.developedBy) && since == other.since
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size);
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
