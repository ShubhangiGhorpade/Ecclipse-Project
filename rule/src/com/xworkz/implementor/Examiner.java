package com.xworkz.implementor;

import com.xworkz.rule.ExamRule;

public class Examiner implements ExamRule {
	private int usn;

	public Examiner() {
		System.out.println("Examiner constructor....");
	}

	@Override
	public boolean hallTicket(int usn) {
		this.usn = usn;
		if (this.usn != 0 && usn == 221) {
			System.out.println("usn is same...");
			return false;
		} else {
			System.out.println("usn is not same...");
			return true;
		}
	}

	@Override
	public boolean copyCheat() {
		if (this.usn == 221) {
			System.out.println("usn is equal to 221");
			return true;
		} else {
			return false;
		}
	}

}
