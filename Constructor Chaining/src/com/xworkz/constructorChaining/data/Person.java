package com.xworkz.constructorChaining.data;

public class Person {
	public String name;
	public int age;
	public String email;
	public int id;

	public Person() {
		System.out.println("No Arg in constructor in Person");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(int age, String name, String email) {
		this(name, age);
		this.email = email;
	}

	public Person(int age, int id, String name, String email) {
		this(age, email,name);
		this.id = id;
	}
}
