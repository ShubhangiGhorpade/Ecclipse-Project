package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Gambler;
import com.xworkz.collection.lambdaExp.util.GamblerUtil;

public class GamblerRunner {

	public static void main(String[] args) {
		Gambler gambler = (principal) -> {
			if (principal > 500 && principal < 1000) {
				System.out.println("Principal is less than 1000: " + principal);
				return 0;
			} else {
				System.out.println("Principal is less than 1000: " + principal);
				return 100;
			}

		};
		GamblerUtil.test(gambler);
	}

}
