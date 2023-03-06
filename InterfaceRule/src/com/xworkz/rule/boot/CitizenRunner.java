package com.xworkz.rule.boot;

import com.xworkz.rule.thing.Citizen;

import com.xworkz.rule.thing.RailwayStationRule;

public class CitizenRunner {

	public static void main(String[] args) {
		Citizen citizen = new Citizen();
		boolean arrivingTime = citizen.arrivingTime();
		System.out.println(arrivingTime);
		boolean beAware = citizen.beAware();
		System.out.println(beAware);
		boolean clean = citizen.clean();
		System.out.println(clean);
		String dontStandNearDoor = citizen.dontStandNearDoor();
		System.out.println(dontStandNearDoor);
		boolean entryCompartment = citizen.entryCompartment();
		System.out.println(entryCompartment);
		int hashCode = citizen.hashCode();
		System.out.println(hashCode);
		String reachingInTime = citizen.reachingInTime();
		System.out.println(reachingInTime);
		boolean stayInWaitingRoom = citizen.stayInWaitingRoom();
		System.out.println(stayInWaitingRoom);
		boolean ticketComplation = citizen.ticketComplation();
		System.out.println(ticketComplation);
		String string = citizen.toString();
		System.out.println(string);
		boolean equals = citizen.equals(citizen);
		System.out.println(equals);

		RailwayStationRule station = new Citizen();
		boolean arrivingTime1 = station.arrivingTime();
		System.out.println(arrivingTime1);
		boolean beAware1 = station.beAware();
		System.out.println(beAware1);
		boolean clean1 = station.clean();
		System.out.println(clean1);
		String dontStandNearDoor1 = station.dontStandNearDoor();
		System.out.println(dontStandNearDoor1);
		boolean entryCompartment1 = station.entryCompartment();
		System.out.println(entryCompartment1);
		int hashCode1 = station.hashCode();
		System.out.println(hashCode1);
		String reachingInTime1 = station.reachingInTime();
		System.out.println(reachingInTime1);
		boolean stayInWaitingRoom1 = station.stayInWaitingRoom();
		System.out.println(stayInWaitingRoom1);
		boolean ticketComplation1 = station.ticketComplation();
		System.out.println(ticketComplation1);
		String string1 = station.toString();
		System.out.println(string1);
		boolean equals1 = station.equals(citizen);
		System.out.println(equals1);
	}

}
