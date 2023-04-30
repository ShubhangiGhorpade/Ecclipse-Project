package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("trimmer")
public class Trimmer {

	private String brand;
	private String colour;
	@Value("1500")
	private double price;
	@Value("25")
	private double height;

	public Trimmer(@Value("Philips") String brand, @Value("Pink") String colour) {
		super();
		this.brand = brand;
		this.colour = colour;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", colour=" + colour + ", price=" + price + ", height=" + height + "]";
	}

}
