package com.xworkz.usage;

import com.xworkz.rule.CricketRule;

public class Player {
	public CricketRule cricketRule;

	public Player(CricketRule cricketRule) {
		this.cricketRule = cricketRule;
	}

	public void checkCricketRule() {
		double overs = this.cricketRule.over(20);
		int player = this.cricketRule.noOfPlayers();

		if (player <= CricketRule.PLAYER && overs == 20) {
			System.out.println("No of Player are 11");
		} else {
			System.out.println("No of Player are 0");
		}
	}
}
