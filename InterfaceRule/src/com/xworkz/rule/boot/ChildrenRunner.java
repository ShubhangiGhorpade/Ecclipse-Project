package com.xworkz.rule.boot;

import com.xworkz.rule.thing.FamilyRule;

import com.xworkz.rule.thing.Children;

public class ChildrenRunner {

	public static void main(String[] args) {
		Children children = new Children();
		boolean beingIndependent = children.beingIndependent();
		System.out.println(beingIndependent);
		String careFor = children.careFor();
		System.out.println(careFor);
		boolean functionAttend = children.functionAttend();
		System.out.println(functionAttend);
		double upTime = children.getUpTime();
		System.out.println(upTime);
		int minMembers = children.minMembers();
		System.out.println(minMembers);
		boolean pray = children.pray();
		System.out.println(pray);
		double reachingTime = children.reachingTime();
		System.out.println(reachingTime);
		String respectTo = children.respectTo();
		System.out.println(respectTo);
		double snacksTime = children.snacksTime();
		System.out.println(snacksTime);
		double teaTime = children.teaTime();
		System.out.println(teaTime);
		String tiffinItem = children.tiffinItem();
		System.out.println(tiffinItem);
		double tiffinTime = children.tiffinTime();
		System.out.println(tiffinTime);
		boolean timeLimit = children.timeLimit();
		System.out.println(timeLimit);
		double travelHours = children.travelHours();
		System.out.println(travelHours);
		boolean unity = children.unity();
		System.out.println(unity);
		boolean equals = children.equals(children);
		System.out.println(equals);
		int hashCode = children.hashCode();
		System.out.println(hashCode);
		String string1 = children.toString();
		System.out.println(string1);

		FamilyRule rule = new Children();
		boolean beingIndependent1 = rule.beingIndependent();
		System.out.println(beingIndependent1);
		String careFor1 = rule.careFor();
		System.out.println(careFor1);
		boolean functionAttend1 = rule.functionAttend();
		System.out.println(functionAttend1);
		double upTime1 = rule.getUpTime();
		System.out.println(upTime1);
		int minMembers1 = rule.minMembers();
		System.out.println(minMembers1);
		boolean pray1 = rule.pray();
		System.out.println(pray1);
		double reachingTime1 = rule.reachingTime();
		System.out.println(reachingTime1);
		String respectTo1 = rule.respectTo();
		System.out.println(respectTo1);
		double snacksTime1 = rule.snacksTime();
		System.out.println(snacksTime1);
		double teaTime1 = rule.teaTime();
		System.out.println(teaTime1);
		String tiffinItem1 = rule.tiffinItem();
		System.out.println(tiffinItem1);
		double tiffinTime1 = rule.tiffinTime();
		System.out.println(tiffinTime1);
		boolean timeLimit1 = rule.timeLimit();
		System.out.println(timeLimit1);
		double travelHours1 = rule.travelHours();
		System.out.println(travelHours1);
		boolean unity1 = rule.unity();
		System.out.println(unity1);
		boolean equals1 = rule.equals(rule);
		System.out.println(equals1);
		int hashCode1 = rule.hashCode();
		System.out.println(hashCode1);
		String string2 = rule.toString();
		System.out.println(string2);
	}

}
