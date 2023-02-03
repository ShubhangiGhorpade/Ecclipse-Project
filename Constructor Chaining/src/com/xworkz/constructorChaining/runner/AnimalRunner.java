package com.xworkz.constructorChaining.runner;

import com.xworkz.constructorChaining.main.Animal;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.init("Puppy", false, true, "Black", 110);// kg
		System.out.println("        ");

		Animal animal1 = new Animal("jeme");
		animal1.show();
		System.out.println("        ");

		Animal animal2 = new Animal("jeme", true);
		animal2.show();
		System.out.println("        ");

		Animal animal3 = new Animal("jeme", true, true);
		animal3.show();
		System.out.println("        ");

		Animal animal4 = new Animal("jeme", true, true, "white");
		animal4.show();
		System.out.println("        ");

		Animal animal5 = new Animal("jeme", true, true, "white", 105);
		animal5.show();
	}

}
