package com.xworkz.implementor;

import com.xworkz.rule.HoliRule;

public class Citizen implements HoliRule {

	private boolean dry;

	@Override
	public boolean dryHoli(boolean dry) {
		if (this.dry != false) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean djLimit() {
		if (this.dry == true) {
			return true;
		}
		return false;
	}

}
