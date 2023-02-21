package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		Cake cake = new Cake("Chocalate", 250, "Pyramid", 500);
		System.out.println(cake);

		Cake cake1 = new Cake("Chocalate", 250, "Pyramid", 500);
		System.out.println(cake1);

		Cake cake2 = new Cake("BlackBerry", 300, "Round", 600);
		System.out.println(cake2);

		boolean equal = cake.equals(cake1);
		System.out.println(equal);

		boolean equal1 = cake.equals(cake2);
		System.out.println(equal1);

		boolean equal2 = cake1.equals(cake2);
		System.out.println(equal2);

	}

}
