	package com.xworkz.collection.lambdaExp.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class EmailRunner {

	public static void main(String[] args) {
		Collection<String> emails = new ArrayList<>();
		emails.add("shubhangi@gmail.com");
		emails.add("akshata@gmail.com");
		emails.add("anita@gmail.com");
		emails.add("shannu@gmail.com");
		emails.add("hassu@gmail.com");
		emails.add("mansik@outlook.com");
		emails.add("paani@outlook.com");
		emails.add("sahana@outlook.com");
		emails.add("muskan@outlook.com");
		emails.add("sneha@outlook.com");
		emails.add("mamta@yahoo.com");
		emails.add("annu@yahoo.com");
		emails.add("suchitra@yahoo.com");
		emails.add("keertana@yahoo.com");
		emails.add("annakarmel@yahoo.com");
		emails.add("shruti@xworkz.com");
		emails.add("bhairavi@xworkz.com");
		emails.add("yogita@xworkz.com");
		emails.add("sangeeta@xworkz.com");
		emails.add("veda@xworkz.com");
		emails.add("sushma@xworkz.com");
		emails.add("suman@xworkz.com");
		emails.add("karishma@xworkz.com");
		emails.add("tanjum@xworkz.com");
		emails.add("pallavi@xworkz.com");

		emails.stream().map(element -> element).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref.toUpperCase()));
		System.out.println("  ");
		System.out.println("only with gmail.com  ");
		emails.stream().filter(element -> element.endsWith("@gmail.com")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("  ");
		System.out.println("only with xworkz.com  ");
		emails.stream().filter(element -> element.endsWith("@xworkz.com")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("  ");
		System.out.println("only with yahoo.com  ");
		emails.stream().filter(element -> !element.endsWith("@xworkz.com") && !element.endsWith("@gmail.com"))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println("  ");
		System.out.println("Without domain ");
		emails.stream().map(e -> e.split("@")).collect(Collectors.toList())
		.forEach(ref -> System.out.println(ref[0]));
		System.out.println("  ");
		System.out.println("With only domain ");
	
		emails.stream().map(e -> e.split("@")).collect(Collectors.toList())
		.forEach(ref -> System.out.println(ref[1]));
		
		

	}

}
