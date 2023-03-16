package com.xworkz.application.constant;

public enum TypeAndWeight {

	NO_EAR(20, "wireless"), OVER_EAR(16, "wire");

	private final double weight;
	private final String type;

	private TypeAndWeight(double weight, String type) {
		this.weight = weight;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public double getWeight() {
		return weight;
	}
}
