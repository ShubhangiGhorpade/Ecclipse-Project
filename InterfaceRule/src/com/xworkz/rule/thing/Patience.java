package com.xworkz.rule.thing;

public class Patience implements HospitalRule {

	@Override
	public String noVoice() {

		return "No Voice";
	}

	@Override
	public boolean wearMask() {

		return true;
	}

	@Override
	public boolean noSmoking() {

		return true;
	}

	@Override
	public boolean noParking() {

		return true;
	}

	@Override
	public boolean checkUp() {

		return true;
	}

	@Override
	public double openTiming() {

		return 6;
	}

	@Override
	public double closeTiming() {

		return 9;
	}

	@Override
	public double limitWithPatience() {

		return 3;
	}

	@Override
	public boolean minPatience() {

		return true;
	}

	@Override
	public boolean maintaience() {

		return true;
	}

	@Override
	public String toString() {
		return "Patience [noVoice()=" + noVoice() + ", wearMask()=" + wearMask() + ", noSmoking()=" + noSmoking()
				+ ", noParking()=" + noParking() + ", checkUp()=" + checkUp() + ", openTiming()=" + openTiming()
				+ ", closeTiming()=" + closeTiming() + ", limitWithPatience()=" + limitWithPatience()
				+ ", minPatience()=" + minPatience() + ", maintaience()=" + maintaience() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {

		return 500;
	}

}
