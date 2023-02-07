package com.xworkz.association.boot;

import com.xworkz.association.thing.Cap;
import com.xworkz.association.thing.Sweater;

public class SweaterRunner {

	public static void main(String[] args) {
		Sweater sweater = new Sweater();
		sweater.init("Adidas", true);
		Cap cap = new Cap();
		cap.init("Rebox", "Black");
		sweater.init(cap);
		sweater.show();

	}

}
