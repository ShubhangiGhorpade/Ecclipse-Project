package com.xworkz.association.boot;

import com.xworkz.association.thing.Isro;
import com.xworkz.association.thing.Scientist;

public class IsroRunner {

	public static void main(String[] args) {
		Isro isro = new Isro();
		String[] loc = { "Bangalore", "Mysore", "Hassan" };
		isro.setLocation(loc);

		int[] sat = { 21, 9, 18, 7 };
		isro.setSatelliteNo(sat);

		Scientist scientist = new Scientist();
		scientist.setName("Adul Kalam");
		scientist.setDesignation("Director");

		Scientist scientist1 = new Scientist();
		scientist1.setName("CV Raman");
		scientist1.setDesignation("Engineer");

		Scientist[] ref = { scientist, scientist1 };
		isro.setScientist(ref);

		isro.show();

	}

}
