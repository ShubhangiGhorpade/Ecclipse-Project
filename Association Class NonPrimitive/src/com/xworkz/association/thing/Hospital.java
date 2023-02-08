package com.xworkz.association.thing;

public class Hospital {
	public String name;
	public Doctor[] doctors;

	public void setName(String name) {
		this.name = name;
	}

	public void setDoctor(Doctor[] doctors) {
		this.doctors = doctors;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		if (this.doctors != null) {
			for (int seq = 0; seq < this.doctors.length; seq++) {
				Doctor element = this.doctors[seq];
				element.show();
			}
		} else {
			System.out.println("this.doctor is null....");
		}
	}

}
