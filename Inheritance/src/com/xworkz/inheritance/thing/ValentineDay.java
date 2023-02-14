package com.xworkz.inheritance.thing;

public class ValentineDay {

	private String patnerName;

	public ValentineDay() {
		System.out.println("No Arg const in ValentineDay");
	}

	public void setPatnerName(String patnerName) {
		this.patnerName = patnerName;
		System.out.println("patnerName in ValentineDay");
	}

	public String getPatnerName() {
		return this.patnerName;
	}
}
