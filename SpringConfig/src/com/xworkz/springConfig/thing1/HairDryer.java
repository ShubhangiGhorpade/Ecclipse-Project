package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hairDryer")
public class HairDryer {
	
	private String brand;
	private String type;
	@Value("Black")
	private String colour;
	@Value("22")
	private double weight;
		
	public HairDryer(@Value("Philips")String brand,@Value("HotDryer") String type) {
		super();
		this.brand = brand;
		this.type = type;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", colour=" + colour + ", weight=" + weight + "]";
	}
	
	

}
