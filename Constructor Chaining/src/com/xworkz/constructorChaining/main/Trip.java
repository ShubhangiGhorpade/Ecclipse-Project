package com.xworkz.constructorChaining.main;

//10
public class Trip {
	public String place;
	public String location;
	public String source;
	public String destination;
	public int noOfPeople;
	public String traveller;
	public int budget;
	public int noOfDays;
	public int date;
	public String day;

	public Trip() {
		System.out.println("No-arg Constructor");
	}

	public Trip(String place) {
		this.place = place;
	}

	public Trip(String place, String location) {
		this(place);
		this.location = location;
	}

	public Trip(String place, String location, String source) {
		this(place, location);
		this.source = source;
	}

	public Trip(String place, String location, String source, String destination) {
		this(place, location, source);
		this.destination = destination;
	}

	public Trip(String place, String location, String source, String destination, int noOfPeople) {
		this(place, location, source, destination);
		this.noOfPeople = noOfPeople;
	}

	public Trip(String place, String location, String source, String destination, int noOfPeople, String traveller) {
		this(place, location, source, destination);
		this.traveller = traveller;
	}

	public Trip(String place, String location, String source, String destination, int noOfPeople, String traveller,
			int budget) {
		this(place, location, source, destination);
		this.budget = budget;
	}

	public Trip(String place, String location, String source, String destination, int noOfPeople, String traveller,
			int budget, int noOfDays) {
		this(place, location, source, destination, noOfPeople, traveller, budget);
		this.noOfDays = noOfDays;
	}

	public Trip(String place, String location, String source, String destination, int noOfPeople, String traveller,
			int budget, int noOfDays, int date) {
		this(place, location, source, destination, noOfPeople, traveller, budget, noOfDays);
		this.date = date;
	}

	public Trip(String place, String location, String source, String destination, int noOfPeople, String traveller,
			int budget, int noOfDays, int date, String day) {
		this(place, location, source, destination, noOfPeople, traveller, budget, noOfDays, date);
		this.day = day;
	}

	public void init(String place, String location, String source, String destination, int noOfPeople, String traveller,
			int budget, int noOfDays, int date, String day) {
		this.place = place;
		this.location = location;
		this.source = source;
		this.destination = destination;
		this.noOfPeople = noOfPeople;
		this.traveller = traveller;
		this.budget = budget;
		this.noOfDays = noOfDays;
		this.date = date;
		this.day = day;
	}

	public void show() {
		System.out.println("Place :" + this.place);
		System.out.println("Location :" + this.location);
		System.out.println("Source :" + this.source);
		System.out.println("Destination :" + this.destination);
		System.out.println("No of people :" + this.noOfPeople);
		System.out.println("Traveller :" + this.traveller);
		System.out.println("Budget :" + this.budget);
		System.out.println("No of Days :" + this.noOfDays);
		System.out.println("Date :" + this.date);
		System.out.println("Day :" + this.day);
	}
}
