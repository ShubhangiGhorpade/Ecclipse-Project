package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Cricket;
import com.xworkz.inheritance.thing.Sport;

public class SportRunner {

	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		cricket.setPlayer(12);
		int players = cricket.getPlayer();
		System.out.println("Players: " + players);
		cricket.caption();

		Sport sport = new Cricket();
		sport.setPlayer(12);
		int players1 = sport.getPlayer();
		System.out.println("Players: " + players1);

		Cricket casted = (Cricket) sport;
		casted.caption();

	}

}
