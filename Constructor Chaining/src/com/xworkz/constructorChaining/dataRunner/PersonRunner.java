package com.xworkz.constructorChaining.dataRunner;

import com.xworkz.constructorChaining.data.Doctor;
import com.xworkz.constructorChaining.data.Engineer;
import com.xworkz.constructorChaining.data.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Person engineer = new Engineer(22, "Shubhangi");
		System.out.println(engineer);

		System.out.println("         ");
		Engineer engineer1 = new Engineer(22, "Shubhangi", "shubhangighorpade21@gmail.com");
		System.out.println(engineer1);

		System.out.println("         ");
		Engineer engineer2 = new Engineer(22, 621, "Shubhangi", "shubhangighorpade21@gmail.com");
		System.out.println(engineer2);

		System.out.println("         ");
		Engineer engineer3 = new Engineer(22, 621, "Shubhangi", "shubhangighorpade21@gmail.com");
		System.out.println(engineer3);

		System.out.println("         ");
		boolean equal = engineer.equals(engineer1);
		System.out.println(equal);

		System.out.println("         ");
		boolean equal1 = engineer.equals(engineer2);
		System.out.println(equal1);

		System.out.println("         ");
		boolean equal2 = engineer1.equals(engineer2);
		System.out.println(equal2);

		System.out.println("         ");
		boolean equal3 = engineer3.equals(engineer2);
		System.out.println(equal3);

		System.out.println("         ");
		Person doctor = new Doctor(32, "Shashank Bhide");
		System.out.println(doctor);

		System.out.println("         ");
		Person doctor1 = new Doctor(32, "Shashank Bhide", "shashankbhide@gmail.com");
		System.out.println(doctor1);

		System.out.println("         ");
		Person doctor2 = new Doctor(32, 621, "Shashank Bhide", "shashankbhide@gmail.com", "Heart surgeon");
		System.out.println(doctor2);

		System.out.println("         ");
		Person doctor3 = new Doctor(32, 621, "Shashank Bhide", "shashankbhide@gmail.com", "Heart surgeon", "Shri Sai");
		System.out.println(doctor3);
	}

}
