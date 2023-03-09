package com.xworkz.boot;

import com.xworkz.implementor.Farmer;
import com.xworkz.rule.FarmRule;
import com.xworkz.usage.Person;

public class FarmRuleRunner {

	public static void main(String[] args) {
		FarmRule rule = new Farmer();

		Person person = new Person(rule);
		person.checkFarmRule();

	}

}
