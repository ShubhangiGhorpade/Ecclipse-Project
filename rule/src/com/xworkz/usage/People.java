package com.xworkz.usage;

import com.xworkz.rule.HoliRule;

public class People {

	public HoliRule holiRule;

	public People(HoliRule holiRule) {
		this.holiRule = holiRule;
	}

	public void checkHoliRule() {
		boolean dry = this.holiRule.dryHoli(true);
		boolean dj = this.holiRule.djLimit();

		if (dj == HoliRule.DRY && dry) {
			System.out.println("Holi is Dry");
		} else {
			System.out.println("Holi is not dry");
		}

	}
}
