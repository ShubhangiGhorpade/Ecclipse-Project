package com.xworkz.association.boot;

import com.xworkz.association.thing.Brand;
import com.xworkz.association.thing.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		Fridge fridge = new Fridge();
		fridge.init("Godrej", 55000);
		Brand brand = new Brand();
		brand.init("Godrej", "Black");
		fridge.init(brand);
		fridge.show();
	}

}
