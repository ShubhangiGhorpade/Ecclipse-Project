package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.ChiefMinister;

public class ChiefMinisterRunner {

	public static void main(String[] args) {
		ChiefMinister minister = new ChiefMinister("Narendar Modi", 60000d, 60, "BJP", 5, 2015, true, true, "Gujrat",
				"Surat", "Tulsi", 0, true);
		System.out.println(minister);

		ChiefMinister minister1 = new ChiefMinister("Narendar Modi", 60000d, 60, "BJP", 5, 2015, true, true, "Gujrat",
				"Surat", "Tulsi", 0, true);
		System.out.println(minister1);

		boolean equal=minister.equals(minister1);
		System.out.println(equal);
	}

}
