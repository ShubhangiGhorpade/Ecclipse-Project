package com.xworkz.constructorChaining.data;

public class Doctor2 extends Person2 {
	public String specialist;
	public String hospitalNmae;

	public Doctor2(int id, int age, String name, String email, String hospitalNmae, String specialist) {
		super(id, age, name, email);
		this.hospitalNmae = hospitalNmae;
		this.specialist = specialist;
		System.out.println("Super chainng in Doctor");
	}

	public Doctor2(int age, String name, String email, String hospitalNmae) {
		super(age, name, email);
		this.hospitalNmae = hospitalNmae;
		System.out.println("chaining super constructor");
	}

	public Doctor2(int age, String name) {
		super(age, name);
		System.out.println("chaining super constructor");
	}

	@Override
	public String toString() {

		return "[ID : " + this.id + "\nAge : " + this.age + "\nName : " + this.name + "\nEmail : " + this.email
				+ "\nSpecialist : " + this.specialist + "\nHospitalName : " + this.hospitalNmae;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Doctor2 " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Engineer) {
				System.out.println("obj is Doctor2");
				Doctor2 casted = (Doctor2) obj;
				Doctor2 left = this;
				Doctor2 right = casted;
				if (left.age == right.age && left.id == right.id && left.name.equals(right.name)
						&& left.email.equals(right.email) && left.hospitalNmae.equals(right.hospitalNmae)
						&& left.specialist.equals(right.specialist)) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.out.println("left is not equals to right");
				}
			} else {
				System.err.println("obj is not Engineer2");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {

		return 500;
	}
}