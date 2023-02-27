package com.xworkz.constructorChaining.data;

public class Person2 {
	public int id;
	public int age;
	public String name;
	public String email;

	public Person2() {
		System.out.println("no argument const of Person2");
	}

	public Person2(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Person2(int age, String name, String email) {
		this(age, name);
		this.email = email;
	}

	public Person2(int id, int age, String name, String email) {
		this(age, name, email);
		this.id = id;
	}
}
