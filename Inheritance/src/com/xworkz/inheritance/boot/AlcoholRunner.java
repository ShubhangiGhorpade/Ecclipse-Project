package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Alcohol;
import com.xworkz.inheritance.thing.Whiskey;

public class AlcoholRunner {

	public static void main(String[] args) {
		Whiskey whiskey = new Whiskey();
		whiskey.brand();
		whiskey.setCost(2500);
		int cost = whiskey.getCost();
		System.out.println("Cost :" + cost);
		whiskey.Bad();

		Alcohol alcohol1 = new Whiskey();
		alcohol1.brand();
		alcohol1.setCost(3000);
		int cost1 = alcohol1.getCost();
		System.out.println("Cost1: " + cost1);

		Whiskey casted = (Whiskey) alcohol1;
		casted.Bad();

	}

}
