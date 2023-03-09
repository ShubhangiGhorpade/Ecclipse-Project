package com.xworkz.usage;

import com.xworkz.rule.FarmRule;

public class Person {

	public FarmRule farmRule;

	public Person(FarmRule farmRule) {
		this.farmRule = farmRule;
	}

	public void checkFarmRule() {
		boolean cropGrowth = this.farmRule.cropGrowth();
		boolean soil = this.farmRule.soil("Black");

		if (cropGrowth == true && soil) {
			System.out.println("soil is same");
		} else {
			System.out.println("soil is not same");
		}
	}
}
