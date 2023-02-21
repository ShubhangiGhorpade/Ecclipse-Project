package com.xworkz.equalsmethod.thing;

//10
public class PoliceStation {
	private String name;
	private int noOfDoor;
	private int noOfPolice;
	private int noOfConstables;
	private int noOfPSI;
	private String city;
	private String location;
	private String state;
	private int noOfChair;
	private int noOfTable;

	public PoliceStation(String name, int noOfDoor, int noOfPolice, int noOfConstables, int noOfPSI, String city,
			String location, String state, int noOfChair, int noOfTable) {
		this.name = name;
		this.noOfDoor = noOfDoor;
		this.noOfPolice = noOfPolice;
		this.noOfConstables = noOfConstables;
		this.noOfPSI = noOfPSI;
		this.city = city;
		this.location = location;
		this.state = state;
		this.noOfChair = noOfChair;
		this.noOfTable = noOfTable;
	}

	@Override
	public String toString() {

		return "[Name: " + this.name + "][No Of Door: " + this.noOfDoor + "][NoOfConstables: " + this.noOfConstables
				+ "][NoOfPolice: " + this.noOfPolice + "][NoOfChair: " + this.noOfChair + "][NoOfTable: "
				+ this.noOfTable + "][NoOfPSI: " + this.noOfPSI + "][Location: " + this.location + "][State: "
				+ this.state + "][City: " + this.city + "]";

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("PoliceStation running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof PoliceStation) {
				PoliceStation casted = (PoliceStation) obj;
				PoliceStation station = this;
				PoliceStation station1 = casted;

				if (station.name.equals(station1.name) && station.noOfChair == (station1.noOfChair)
						&& station.noOfConstables == (station1.noOfConstables)
						&& station.noOfDoor == (station1.noOfDoor) && station.noOfPSI == station1.noOfPSI
						&& station.city.equals(station1.city) && station.location.equals(station1.location)
						&& station.state.equals(station1.state) && station.noOfPolice == (station1.noOfPolice)
						&& station.noOfTable == (station1.noOfTable)) {
					return true;
				} else {
					System.out.println("station and station1 are not same");
				}
			} else {
				System.out.println("station1 is not station type");

			}

		} else {
			System.out.println("obj is null");
		}

		return super.equals(obj);
	}

}
