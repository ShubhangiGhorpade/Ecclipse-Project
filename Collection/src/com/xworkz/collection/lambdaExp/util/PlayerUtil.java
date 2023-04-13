package com.xworkz.collection.lambdaExp.util;

import com.xworkz.collection.lambdaExp.functionalInterface.Player;

public class PlayerUtil {

	public static void test(Player player) {

		String on = player.on("Hardik", "Mumbai");
		System.out.println("On:" + on);
	}

}
