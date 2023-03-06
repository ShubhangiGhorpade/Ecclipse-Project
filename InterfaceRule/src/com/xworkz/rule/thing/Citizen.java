package com.xworkz.rule.thing;

public class Citizen implements RailwayStationRule {

	@Override
	public String dontStandNearDoor() {

		return "Stay Away";
	}

	@Override
	public String reachingInTime() {

		return "Before train arrive";
	}

	@Override
	public boolean ticketComplation() {

		return true;
	}

	@Override
	public boolean beAware() {

		return true;
	}

	@Override
	public boolean entryCompartment() {

		return true;
	}

	@Override
	public boolean clean() {

		return true;
	}

	@Override
	public boolean stayInWaitingRoom() {

		return true;
	}

	@Override
	public boolean arrivingTime() {

		return true;
	}

	@Override
	public String toString() {
		return "Citizen [dontStandNearDoor()=" + dontStandNearDoor() + ", reachingInTime()=" + reachingInTime()
				+ ", ticketComplation()=" + ticketComplation() + ", beAware()=" + beAware() + ", entryCompartment()="
				+ entryCompartment() + ", clean()=" + clean() + ", stayInWaitingRoom()=" + stayInWaitingRoom()
				+ ", arrivingTime()=" + arrivingTime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {

		return 500;
	}
}
