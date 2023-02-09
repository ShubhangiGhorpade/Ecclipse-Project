package com.xworkz.association.thing;

import com.xworkz.association.constant.CountryName;

public class Country {

	public String president;
	public boolean developed;
	public State state;
	public CountryName country = CountryName.INDIA;

	public void setPresident(String president) {
		this.president = president;
	}

	public void setDeveloped(boolean developed) {
		this.developed = developed;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void show() {
		System.out.println("Details of Country");
		System.out.println("Country Name: " + this.country);
		System.out.println("Country president: " + this.president);
		System.out.println("Country Developed or not: " + this.developed);
		if (this.state != null) {
			this.state.show();
		} else {
			System.err.println("this.state is null....");
		}
	}
}
