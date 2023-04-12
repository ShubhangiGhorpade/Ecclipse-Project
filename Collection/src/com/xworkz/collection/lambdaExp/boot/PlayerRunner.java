package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Player;
import com.xworkz.collection.lambdaExp.util.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {
		Player player = (name, state) -> {

			System.out.println("Player name in uppercase:" + name.toUpperCase());
			System.out.println("Player name in lowercase:" + name.toLowerCase());
			System.out.println("Name and State:" + name + " , " + state);
			return null;

		};
		PlayerUtil.test(player);

	}

}
