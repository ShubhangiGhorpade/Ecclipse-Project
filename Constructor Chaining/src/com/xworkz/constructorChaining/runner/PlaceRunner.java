package com.xworkz.constructorChaining.runner;

import com.xworkz.constructorChaining.main.Place;

public class PlaceRunner {

	public static void main(String[] args) {
		Place place = new Place();
		place.show();
		System.out.println("       ");

		place.init("Mudhol", "Bagalkot", "Karnatak", "India", 71000);
		place.show();
		System.out.println("       ");

		Place place1 = new Place(65000);
		place1.show();
		System.out.println("       ");

		Place place2 = new Place("India");
		place2.show();
		System.out.println("       ");

		Place place3 = new Place("Mudhol", "Bagalkot");
		place3.show();
		System.out.println("       ");

		Place place4 = new Place("Nagral", "Bagalkot", "India", "Karnatak", 55000);
		place4.show();
	}

}
