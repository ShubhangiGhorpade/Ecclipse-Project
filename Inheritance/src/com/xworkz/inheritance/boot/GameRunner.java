package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.CandyCrush;
import com.xworkz.inheritance.thing.Game;

public class GameRunner {

	public static void main(String[] args) {
		CandyCrush candy = new CandyCrush();
		candy.setName("CandyCrush");
		String name = candy.getName();
		System.out.println("Name :" + name);
		candy.storage();

		Game game = new CandyCrush();
		game.setName("CandyCrush");
		String name1 = game.getName();
		System.out.println("Name1 :" + name1);

		CandyCrush casted = (CandyCrush) game;
		casted.storage();
	}

}
