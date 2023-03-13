package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.TravelDTO;

public class TravelRunner {

	public static void main(String[] args) {
		TravelDTO travel = new TravelDTO();
		travel.setDate(LocalDate.now());
		travel.setDestination("Lonavla");
		travel.setNoOfPeople(2);
		travel.setSource("Satara");
		travel.setTravelBy("Bike");
		System.out.println(travel);
		System.out.println(travel.equals(travel));
		System.out.println(travel.hashCode());

	}

}
