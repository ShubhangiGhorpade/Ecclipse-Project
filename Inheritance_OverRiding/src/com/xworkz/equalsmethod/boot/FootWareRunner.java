package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {
		FootWare foot = new FootWare("Nike", 5000, "Sneakers");
		System.out.println(foot);

		FootWare foot1 = new FootWare("Nike", 5000, "Sneakers");
		System.out.println(foot1);

		FootWare foot2 = new FootWare("Bata", 3000, "Crocs");
		System.out.println(foot2);

		boolean equal = foot.equals(foot1);
		System.out.println(equal);

		boolean equal1 = foot1.equals(foot2);
		System.out.println(equal1);
		
		boolean equal2 = foot.equals(foot2);
		System.out.println(equal2);

	}

}
