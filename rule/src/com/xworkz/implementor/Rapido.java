package com.xworkz.implementor;

import com.xworkz.rule.Delivery;

public class Rapido implements Delivery {

	@Override
	public double charges() {
		System.out.println("Running in charge");
		return 32;
	}

	@Override
	public double timeTaken() {
		return 90;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Running in agentName");
		if (rating == 1) {
			return "basavraj";
		}
		if (rating == 2) {
			return "Dinakar";
		}
		if (rating == 3) {
			return "Shivu";
		}
		return "other";
		
	}

}
