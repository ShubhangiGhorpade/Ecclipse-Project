package com.xworkz.association.thing;

public class Degree {
	public String name;
	public int duration;
	public boolean pursing;
	public double precentage;
	public String branch;

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setPursing(boolean pursing) {
		this.pursing = pursing;
	}

	public void setPercentage(double precentage) {
		this.precentage = precentage;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("Duration :" + this.duration);
		System.out.println("Pursing :" + this.pursing);
		System.out.println("Percentage :" + this.precentage);
		System.out.println("Branch :" + this.branch);
	}
}
