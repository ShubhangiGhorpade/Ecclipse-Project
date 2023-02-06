package com.java.association.main;

public class HumanResource {
	public String name;
	public double salary;
	public boolean present;

	public void init(String name, double salary, boolean present) {
		this.name = name;
		this.salary = salary;
		this.present = present;
	}

	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("Salary :" + this.salary);
		System.out.println("Present :" + this.present);

	}
}
