package com.xworkz.boot;

import com.xworkz.implementor.Dancer;
import com.xworkz.rule.DanceRule;
import com.xworkz.usage.DanceAcademy;

public class DanceRuleRunner {

	public static void main(String[] args) {
		DanceRule rule = new Dancer();

		DanceAcademy dance = new DanceAcademy(rule);
		dance.checkDanceAcademy();

	}

}
