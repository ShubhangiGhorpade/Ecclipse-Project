package com.xworkz.rule.thing;

public class Member implements PubRule {

	@Override
	public double ageLimit() {

		return 18;
	}

	@Override
	public boolean mobile() {

		return true;
	}

	@Override
	public boolean childrenAllowance() {

		return false;
	}

	@Override
	public double openTiming() {

		return 9;
	}

	@Override
	public double endTiming() {

		return 2;
	}

	@Override
	public int hashCode() {

		return 500;
	}

	@Override
	public String toString() {
		return "Member [ageLimit()=" + ageLimit() + ", mobile()=" + mobile() + ", childrenAllowance()="
				+ childrenAllowance() + ", openTiming()=" + openTiming() + ", endTiming()=" + endTiming()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

}
