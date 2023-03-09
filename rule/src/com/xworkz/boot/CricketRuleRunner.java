package com.xworkz.boot;

import com.xworkz.implementor.Cricketer;
import com.xworkz.rule.CricketRule;
import com.xworkz.usage.Player;

public class CricketRuleRunner {

	public static void main(String[] args) {
		CricketRule rule = new Cricketer();

		Player player = new Player(rule);
		player.checkCricketRule();

	}

}
