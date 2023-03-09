package com.xworkz.boot;

import com.xworkz.implementor.Customer;
import com.xworkz.rule.EatingRule;
import com.xworkz.usage.Military;

public class EatingRuleRunner {

	public static void main(String[] args) {
		// create infr
		// create impl
		// create usage cls
		// assc the inf vth usage cls

		EatingRule rule = new Customer();

		Military military = new Military(rule);
		military.checkEatingRule();
	}

}
