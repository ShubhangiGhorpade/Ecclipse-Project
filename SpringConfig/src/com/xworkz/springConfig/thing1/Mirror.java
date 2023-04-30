package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mirror")
public class Mirror {

	private String shape;
	@Value("23")
	private double height;
	@Value("20")
	private double weight;

	public Mirror(@Value("Rectangular") String shape) {
		super();
		this.shape = shape;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mirror [shape=" + shape + ", height=" + height + ", weight=" + weight + "]";
	}

}
