package com.xworkz.boot;

import com.xworkz.implementor.Citizen;
import com.xworkz.rule.HoliRule;
import com.xworkz.usage.People;

public class HoliRuleRunner {

	public static void main(String[] args) {
		HoliRule rule = new Citizen();

		People people = new People(rule);
		people.checkHoliRule();

	}

}
