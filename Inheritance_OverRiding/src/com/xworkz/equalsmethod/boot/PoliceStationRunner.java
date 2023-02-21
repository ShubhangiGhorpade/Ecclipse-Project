package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		PoliceStation station = new PoliceStation("Government PoliceStation", 2, 15, 4, 2, "Pune", "Shivaji Nagar",
				"Maharshtra", 20, 4);
		System.out.println(station);

		PoliceStation station1 = new PoliceStation("Government PoliceStation", 2, 15, 4, 2, "Pune", "Shivaji Nagar",
				"Maharshtra", 20, 4);
		System.out.println(station1);

		boolean equal = station.equals(station1);
		System.out.println(equal);

	}

}
