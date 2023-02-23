package com.xworkz.constructorChaining.data;

public class Doctor extends Person {
	public String specialist;
	public String hospitalName;

	public Doctor() {
		System.out.println("NO arg constructor in Doctor");
	}

	public Doctor(int age, int id, String name, String email) {
		super(age, id, name, email);
		System.out.println("Super chainng in Doctor");
	}

	public Doctor(int age, String name) {
		super(name, age);
		System.out.println("Super chainng in Doctor");
	}

	public Doctor(int age, String name, String email) {
		super(age, name, email);
		System.out.println("Super chainng in Doctor");
	}

	public Doctor(int age, int id, String name, String email, String specialist) {
		super(age, id, email, name);
		this.specialist = specialist;
		System.out.println("super Chaining in Doctor");
	}

	public Doctor(int age, int id, String name, String email, String specialist, String hospitalName) {
		super(age, id, email, name);
		this.specialist = specialist;
		this.hospitalName = hospitalName;
		System.out.println("super Chaining in Doctor");
	}

	@Override
	public String toString() {
		return "\nName: " + this.name + "\nId: " + this.id + "\nAge: " + this.age + "\nEmail: " + this.email
				+ "\nSpecialist: " + this.specialist + "\nHospitalName: " + this.hospitalName;
	}

}
