package com.xworkz.constructorChaining.dataRunner;

import com.xworkz.constructorChaining.data.Doctor2;
import com.xworkz.constructorChaining.data.Engineer2;
import com.xworkz.constructorChaining.data.Person2;

public class Person2Runner {

	public static void main(String[] args) {
		Person2 person2 = new Engineer2(32, "Kalavati");
		System.out.println(person2);
		Person2 person3 = new Engineer2(32, "Kalavati", "kalavati@gmail.com");
		System.out.println(person3);
		Person2 parson4 = new Engineer2(32, 12344321, "Kalavati", "kalavati@gmail.com");
		System.out.println(parson4);

		System.out.println("          ");

		Person2 pr1 = new Doctor2(32, "Sunil");
		System.out.println(pr1);
		Person2 pr2 = new Doctor2(32, "sunil", "sunil@gmail.com", "Dhanvatri");
		System.out.println(pr2);

		boolean cl = person3.equals(parson4);
		System.out.println(cl);

		boolean cl1 = person2.equals(parson4);
		System.out.println(cl1);
	}

}
