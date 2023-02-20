package com.xworkz.accessspecifier.boot;

import com.xworkz.accessspecifier.thing.Himalaya;
import com.xworkz.accessspecifier.thing.Mountain;

public class MountainRunner {

	public static void main(String[] args) {
		Mountain mountain = new Mountain();
		System.out.println(mountain.totalVisitors());
		mountain.display();

		System.out.println("====Himalaya Instance===");
		Mountain mount = new Himalaya();
		System.out.println(mount.totalVisitors());
		mount.display();
		Himalaya casted = (Himalaya) mount;
		casted.feet();

		System.out.println(" ");
		Himalaya him = new Himalaya();
		him.display();
		System.out.println(him.feet());
		System.out.println(him.totalVisitors());

		System.out.println("====K2Mountain Instance===");
		Mountain mount1 = new K2Mountain();
		System.out.println(mount1.totalVisitors());
		mount1.display();
		K2Mountain casted1 = (K2Mountain) mount1;
		casted1.howManyPlaceToWatch();

		System.out.println(" ");
		K2Mountain k2 = new K2Mountain();
		k2.display();
		System.out.println(k2.totalVisitors());
		System.out.println(k2.howManyPlaceToWatch());
	}
}
