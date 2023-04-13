package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Player;
import com.xworkz.collection.lambdaExp.util.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {
		Player player = (name, state) -> {

			return name.toUpperCase();

		};
		Player player1 = (name, state) -> {

			return name.toLowerCase();

		};
		Player player2 = (name, state) -> {

			return name +" "+ state;

		};
		PlayerUtil.test(player);
		PlayerUtil.test(player1);
		PlayerUtil.test(player2);

	}

}
