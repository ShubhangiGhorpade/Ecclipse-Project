package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {
		Alcohol alcohol = new Alcohol("KingFisher", 2, 4, "Beer");
		System.out.println(alcohol);

		Alcohol alcohol1 = new Alcohol("Signature", 3, 5, "Beer");
		System.out.println(alcohol1);

		Alcohol alcohol2 = new Alcohol("KingFisher", 2, 4, "Beer");
		System.out.println(alcohol2);

		boolean equal = alcohol.equals(alcohol1);
		System.out.println(equal);

		boolean equal1 = alcohol.equals(alcohol2);
		System.out.println(equal1);

		boolean equal2 = alcohol1.equals(alcohol2);
		System.out.println(equal2);

	}

}
