package com.xworkz.thing;

public class Employee extends Developer implements PassportRule, DubaiVisaRule {

	@Override
	public double minAmount() {

		return 0;
	}

	@Override
	public boolean stayingHotel() {

		return false;
	}

	@Override
	public double maxGoldLimit() {

		return 0;
	}

	@Override
	public String citizen() {

		return null;
	}

	@Override
	public boolean criminalRecord() {

		return false;
	}

	@Override
	public boolean jail() {

		return false;
	}

	@Override
	public boolean followStandards() {
		return false;

	}

	@Override
	public boolean underStandingConcepts() {
		return false;

	}

}
