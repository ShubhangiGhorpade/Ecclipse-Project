package com.xworkz.association.thing;

public class Address {
	public Country country;

	public void setCountry(Country country) {
		this.country = country;
	}

	public void show() {
		System.out.println("Details of address");
		if (this.country != null) {
			this.country.show();
		} else {
			System.err.println("this.country is null....");
		}
	}
}
