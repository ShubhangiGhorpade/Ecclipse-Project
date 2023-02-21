package com.xworkz.equalsmethod.boot;

import com.xworkz.equalsmethod.thing.Tv;

public class TVRunner {

	public static void main(String[] args) {
		Tv tv = new Tv("Sony", 55000, 25);
		System.out.println(tv);

		Tv tv1 = new Tv("Sony", 55000, 25);
		System.out.println(tv1);

		Tv tv2 = new Tv("LG", 60000, 15);
		System.out.println(tv2);

		boolean equal = tv.equals(tv1);
		System.out.println(equal);

		boolean equal1 = tv1.equals(tv2);
		System.out.println(equal1);

		boolean equal2 = tv.equals(tv1);
		System.out.println(equal2);

	}

}
