package com.xworkz.association.thing;

public class City {
	public String name;
	public String district;
	public boolean capital;
	public Area area;

	public void setName(String name) {
		this.name = name;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	public void show() {
		System.out.println("Details of City");
		System.out.println("City Name :"+this.name);
		System.out.println("City District :"+this.district);
		System.out.println("Capital :"+this.capital);
		if(this.area!=null) {
			this.area.show();
		}else {
			System.err.println("this.area is null....");
		}
	}
}
