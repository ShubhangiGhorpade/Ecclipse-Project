package com.xworkz.rule.boot;

import com.xworkz.rule.thing.Member;

import com.xworkz.rule.thing.PubRule;

public class MemberRunner {

	public static void main(String[] args) {
		Member member = new Member();
		double ageLimit = member.ageLimit();
		System.out.println(ageLimit);
		boolean childrenAllowance = member.childrenAllowance();
		System.out.println(childrenAllowance);
		double endTiming = member.endTiming();
		System.out.println(endTiming);
		boolean mobile = member.mobile();
		System.out.println(mobile);
		double openTiming = member.openTiming();
		System.out.println(openTiming);
		String string = member.toString();
		System.out.println(string);
		int hashCode = member.hashCode();
		System.out.println(hashCode);
		boolean equals = member.equals(member);
		System.out.println(equals);

		PubRule rule = new Member();
		double ageLimit1 = rule.ageLimit();
		System.out.println(ageLimit1);
		boolean childrenAllowance1 = rule.childrenAllowance();
		System.out.println(childrenAllowance1);
		double endTiming1 = rule.endTiming();
		System.out.println(endTiming1);
		boolean mobile1 = rule.mobile();
		System.out.println(mobile1);
		double openTiming1 = rule.openTiming();
		System.out.println(openTiming1);
		String string1 = rule.toString();
		System.out.println(string1);
		int hashCode1 = rule.hashCode();
		System.out.println(hashCode1);
		boolean equals1 = rule.equals(member);
		System.out.println(equals1);

	}

}
