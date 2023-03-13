package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO implements Serializable {

	private String source;
	private String destination;
	private String travelBy;
	private int noOfPeople;
	private LocalDate date;

	public TravelDTO() {
		System.out.println("No Arg const in travel");
	}

	@Override
	public String toString() {
		return "TravelDTO [source=" + source + ", destination=" + destination + ", travelBy=" + travelBy
				+ ", noOfPeople=" + noOfPeople + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, destination, noOfPeople, source, travelBy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TravelDTO)) {
			return false;
		}
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(date, other.date) && Objects.equals(destination, other.destination)
				&& noOfPeople == other.noOfPeople && Objects.equals(source, other.source)
				&& Objects.equals(travelBy, other.travelBy);
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTravelBy() {
		return travelBy;
	}

	public void setTravelBy(String travelBy) {
		this.travelBy = travelBy;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
