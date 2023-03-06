package com.xworkz.rule.boot;

import com.xworkz.rule.thing.HospitalRule;
import com.xworkz.rule.thing.Patience;

public class PatienceRunner {

	public static void main(String[] args) {
		Patience patience = new Patience();
		boolean checkUp = patience.checkUp();
		System.out.println(checkUp);
		double closeTiming = patience.closeTiming();
		System.out.println(closeTiming);
		double limitWithPatience = patience.limitWithPatience();
		System.out.println(limitWithPatience);
		boolean maintaience = patience.maintaience();
		System.out.println(maintaience);
		boolean minPatience = patience.minPatience();
		System.out.println(minPatience);
		boolean noParking = patience.noParking();
		System.out.println(noParking);
		boolean noSmoking = patience.noSmoking();
		System.out.println(noSmoking);
		String noVoice = patience.noVoice();
		System.out.println(noVoice);
		double openTiming = patience.openTiming();
		System.out.println(openTiming);
		boolean wearMask = patience.wearMask();
		System.out.println(wearMask);
		int hashCode = patience.hashCode();
		System.out.println(hashCode);
		String string = patience.toString();
		System.out.println(string);
		boolean equals = patience.equals(patience);
		System.out.println(equals);

		HospitalRule rule = new Patience();
		boolean checkUp1 = rule.checkUp();
		System.out.println(checkUp1);
		double closeTiming1 = rule.closeTiming();
		System.out.println(closeTiming1);
		double limitWithPatience1 = rule.limitWithPatience();
		System.out.println(limitWithPatience1);
		boolean maintaience1 = rule.maintaience();
		System.out.println(maintaience1);
		boolean minPatience1 = rule.minPatience();
		System.out.println(minPatience1);
		boolean noParking1 = rule.noParking();
		System.out.println(noParking1);
		boolean noSmoking1 = rule.noSmoking();
		System.out.println(noSmoking1);
		String noVoice1 = rule.noVoice();
		System.out.println(noVoice1);
		double openTiming1 = rule.openTiming();
		System.out.println(openTiming1);
		boolean wearMask1 = rule.wearMask();
		System.out.println(wearMask1);
		int hashCode1 = rule.hashCode();
		System.out.println(hashCode1);
		String string1 = rule.toString();
		System.out.println(string1);
		boolean equals1 = rule.equals(patience);
		System.out.println(equals1);

	}

}
