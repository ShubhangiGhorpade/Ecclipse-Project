package com.xworkz.association.thing;

public class State {
	public String name;
	public String cmName;
	public String lang;
	public City city;

	public void setName(String name) {
		this.name = name;
	}

	public void setCmName(String cmName) {
		this.cmName = cmName;
	}
	public void setLang(String lang) {
		this.lang=lang;
	}
	public void setCity(City city) {
		this.city=city;
	}
	public void show() {
		System.out.println("Details of States");
		System.out.println("Name: "+this.name);
		System.out.println("CMName :"+this.cmName);
		System.out.println("Lang :"+this.lang);
		if(this.city!=null) {
			this.city.show();
		}else {
			System.out.println("this.city is null");
		}
	}
}
