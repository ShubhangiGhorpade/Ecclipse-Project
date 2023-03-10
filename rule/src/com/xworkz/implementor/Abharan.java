package com.xworkz.implementor;

import com.xworkz.rule.GoldSeller;

public class Abharan implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running in price per gram in Abharan");
		return 5000;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running in get gst No in Abharan");
		return "2Lb17EC";
	}

	@Override
	public String getLocation() {
		System.out.println("Running in get Location in Abharan");
		return "Gandhi Chowk";
	}

}
