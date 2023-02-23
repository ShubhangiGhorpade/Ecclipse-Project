package com.xworkz.constructorChaining.data;

public class Engineer extends Person {

	public Engineer() {
		System.out.println("NO Arg constructor in Engineer");
	}

	public Engineer(int age, int id, String name, String email) {
		super(age, id, email, name);
		System.out.println("Super chainng in Engineer");
	}

	public Engineer(int age, String name) {
		super(name, age);
		System.out.println("Super chainng in Engineer");
	}

	public Engineer(int age, String name, String email) {
		super(age, name, email);
		System.out.println("Super chainng in Engineer");
	}

	@Override
	public String toString() {

		return "\nName: " + this.name + "\nId: " + this.id + "\nAge: " + this.age + "\nEmail: " + this.email;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running in Engineer: " + obj);
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof Engineer) {
				Engineer casted = (Engineer) obj;
				Engineer right = this;
				Engineer left = casted;
				System.out.println("Engineer is a same type ");
				if (left.name.equals(right.name) && left.id == right.id && left.age == right.age
						&& left.email.equals(right.email)) {
					return true;
				} else {
					System.out.println("Engineer is not equal to Person");
				}
			} else {
				System.out.println("Engineer is not type of Person");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {

		return 500;
	}
}
