package com.xworkz.constructorChaining.runner;

import com.xworkz.constructorChaining.main.Trip;

public class TripRunner {

	public static void main(String[] args) {
		Trip trip = new Trip();
		trip.init("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar", 17, "car", 5000, 2, 21, "Saturday");
		trip.show();
		System.out.println("      ");

		Trip trip1 = new Trip("Mahabaleshwar");
		trip1.show();
		System.out.println("      ");

		Trip trip2 = new Trip("Mahabaleshwar", "Satara");
		trip2.show();
		System.out.println("      ");

		Trip trip3 = new Trip("Mahabaleshwar", "Satara", "Karad");
		trip3.show();
		System.out.println("      ");

		Trip trip4 = new Trip("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar");
		trip4.show();
		System.out.println("      ");

		Trip trip5 = new Trip("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar", 25);
		trip5.show();
		System.out.println("      ");

		Trip trip6 = new Trip("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar", 25, "car");
		trip6.show();
		System.out.println("      ");

		Trip trip7 = new Trip("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar", 25, "car", 5000);
		trip7.show();
		System.out.println("      ");

		Trip trip8 = new Trip("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar", 25, "car", 5000, 2);
		trip8.show();
		System.out.println("      ");

		Trip trip9 = new Trip("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar", 25, "car", 5000, 2, 21);
		trip9.show();
		System.out.println("      ");

		Trip trip10 = new Trip("Mahabaleshwar", "Satara", "Karad", "Mahabaleshwar", 25, "car", 5000, 2, 21, "Saturday");
		trip10.show();
		System.out.println("      ");
	}

}
