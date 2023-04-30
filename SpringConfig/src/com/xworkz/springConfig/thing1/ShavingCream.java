package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("shavingCream")
public class ShavingCream {

	private String brand;
	private double price;
	@Value("very good")
	private String quality;

	public ShavingCream(@Value("Glitte") String brand, @Value("500") double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quality=" + quality + "]";
	}

}
