package com.xworkz.association.boot;

import com.xworkz.association.thing.Brand;
import com.xworkz.association.thing.Frame;

public class BrandRunner {

	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setName("Lens");
		String[] type1 = { "lenskrat", "scoppty" };
		frame.setType(type1);
		frame.setPrice(2500);

		Frame frame1 = new Frame();
		frame1.setName("Specs");
		String[] type2 = { "lenskrat", "scoppty", "Leno" };
		frame1.setType(type2);
		frame1.setPrice(2500);
		Frame[] frame2 = { frame, frame1 };
		Brand brand = new Brand();

		brand.setBrand("Lenskart");

		brand.setFrame(frame2);

		brand.show();

	}

}
