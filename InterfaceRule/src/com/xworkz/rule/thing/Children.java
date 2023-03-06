package com.xworkz.rule.thing;

public class Children implements FamilyRule {

	@Override
	public double getUpTime() {

		return 8.30;
	}

	@Override
	public double tiffinTime() {

		return 9;
	}

	@Override
	public String tiffinItem() {

		return "poha";
	}

	@Override
	public double travelHours() {

		return 7;
	}

	@Override
	public String respectTo() {

		return "Elder";
	}

	@Override
	public double reachingTime() {

		return 7.30;
	}

	@Override
	public boolean functionAttend() {

		return false;
	}

	@Override
	public boolean timeLimit() {

		return false;
	}

	@Override
	public boolean pray() {

		return true;
	}

	@Override
	public String careFor() {

		return "younger";
	}

	@Override
	public boolean unity() {

		return true;
	}

	@Override
	public boolean beingIndependent() {

		return true;
	}

	@Override
	public double snacksTime() {

		return 5.30;
	}

	@Override
	public double teaTime() {

		return 6;
	}

	@Override
	public int minMembers() {

		return 5;
	}

	@Override
	public String toString() {
		return "Children [getUpTime()=" + getUpTime() + ", tiffinTime()=" + tiffinTime() + ", tiffinItem()="
				+ tiffinItem() + ", travelHours()=" + travelHours() + ", respectTo()=" + respectTo()
				+ ", reachingTime()=" + reachingTime() + ", functionAttend()=" + functionAttend() + ", timeLimit()="
				+ timeLimit() + ", pray()=" + pray() + ", careFor()=" + careFor() + ", unity()=" + unity()
				+ ", beingIndependent()=" + beingIndependent() + ", snacksTime()=" + snacksTime() + ", teaTime()="
				+ teaTime() + ", minMembers()=" + minMembers() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {

		return 500;
	}

}
