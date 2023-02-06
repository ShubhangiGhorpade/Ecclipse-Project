package com.java.association.main;

public class Temple {
	public String name;
	public int time;
	public int noOfGod;
	public God g = new God();

	public void init(String name, int time, int noOfGod) {
		this.name = name;
		this.time = time;
		this.noOfGod = noOfGod;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("Time :" + this.time);
		System.out.println("No of God :" + this.noOfGod);
		System.out.println("   Association       ");
		this.g.show();
	}
}
