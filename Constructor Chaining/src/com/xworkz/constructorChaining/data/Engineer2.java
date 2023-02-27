package com.xworkz.constructorChaining.data;

public class Engineer2 extends Person2 {
	public Engineer2(int age, int id, String name, String email) {
		super(age, id, name, email);
		System.out.println("chaining super constructor");
	}

	public Engineer2(int age, String name, String email) {
		super(age, name, email);
		System.out.println("chaining super constructor");
	}

	public Engineer2(int age, String name) {
		super(age, name);
		System.out.println("chaining super constructor");
	}

	@Override
	public String toString() {

		return "[ID : " + this.id + "\nAge : " + this.age + "\nName : " + this.name + "\nEmail : " + this.email;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Engineer " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Engineer) {
				System.out.println("obj is Engineer2");
				Engineer2 casted = (Engineer2) obj;
				Engineer2 left = this;
				Engineer2 right = casted;
				if (left.age == right.age && left.id == right.id && left.name.equals(right.name)
						&& left.email.equals(right.email)) {
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
