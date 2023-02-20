package com.xworkz.inheritance.objRunner;

import com.xworkz.inheritance.obj.Cricket;
import com.xworkz.inheritance.obj.ODICricket;
import com.xworkz.inheritance.obj.Sport;
import com.xworkz.inheritance.obj.T20Cricket;
import com.xworkz.inheritance.obj.TestCricket;

public class Converter {

	public void display() {
		Sport sport = new Sport();
		int total = sport.getTotal();
		System.out.println("Total: " + total);
	}

	public void display1() {
		Sport sport1 = new Cricket();
		Cricket casted = (Cricket) sport1;
		String country = casted.getCountry();
		System.out.println("Country: " + country);
		String coach = casted.getCoachName();
		System.out.println("CoachName: " + coach);
	}

	public void display2() {
		Sport sport2 = new TestCricket();
		int total1 = sport2.getTotal();
		System.out.println("Total in TestCricket: " + total1);
		TestCricket casted1 = (TestCricket) sport2;
		String captainName = casted1.getCaptainName();
		System.out.println("Captain Name:" + captainName);
		String coach1 = casted1.getCoachName();
		System.out.println("Coach in TestCricket: " + coach1);
		String captain = casted1.getCaptainName();
		System.out.println("Captain in TestCricket: " + captain);
		String country1 = casted1.getCountry();
		System.out.println("Country in TestCricket: " + country1);
	}

	public void display3() {
		Sport sport3 = new ODICricket();
		int total2 = sport3.getTotal();
		System.out.println("Total in ODICricket: " + total2);
		ODICricket casted2 = (ODICricket) sport3;
		String coach2 = casted2.getCoachName();
		System.out.println("Coach in ODICricket: " + coach2);
		String ground = casted2.getGroundName();
		System.out.println("Ground name in ODICricket: " + ground);
		String country2 = casted2.getCountry();
		System.out.println("Country in ODICricket: " + country2);
	}

	public void display4() {
		Sport sport4 = new T20Cricket();
		int total3 = sport4.getTotal();
		System.out.println("Total in T20Cricket: " + total3);
		T20Cricket casted3 = (T20Cricket) sport4;
		String coach3 = casted3.getCoachName();
		System.out.println("Coach in T20Cricket: " + coach3);
		String country3 = casted3.getCountry();
		System.out.println("Country in T20Cricket: " + country3);
		String ground1 = casted3.getGroundName();
		System.out.println("Ground in T20Cricket: " + ground1);
		String sponsor = casted3.getSponsorName();
		System.out.println("Sponsor in T20Cricket: " + sponsor);
	}
}
