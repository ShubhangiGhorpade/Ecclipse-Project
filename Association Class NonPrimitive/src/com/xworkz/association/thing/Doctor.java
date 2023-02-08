package com.xworkz.association.thing;

public class Doctor {
	public String name;
	public String[] specializations;
	public double experience;

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecialization(String[] specializations) {
		this.specializations = specializations;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		for (int num = 0; num < this.specializations.length; num++) {
			String element = this.specializations[num];
			System.out.println(element);
		}
		System.out.println("Experience :" + this.experience);
	}
}
