package com.xworkz.implementor;

import com.xworkz.rule.CricketRule;

public class Cricketer implements CricketRule {

	private double overs;

	public Cricketer() {
		System.out.println("Running in cricketer");
	}

	@Override
	public double over(double overs) {
		this.overs = overs;
		if (this.overs != 0 && overs == 15) {
			System.out.println("Over is not 20");
			return 15;
		} else {
			return 20;
		}
	}

	@Override
	public int noOfPlayers() {
		if (this.overs == 20) {
			return 20;
		} else {
			return 0;
		}
	}

}
