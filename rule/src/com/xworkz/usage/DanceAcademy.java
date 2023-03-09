package com.xworkz.usage;

import com.xworkz.rule.DanceRule;

public class DanceAcademy {
	public DanceRule danceRule;

	public DanceAcademy(DanceRule danceRule) {
		this.danceRule = danceRule;
	}

	public void checkDanceAcademy() {
		boolean hipHop = this.danceRule.hipHop();
		boolean dress = this.danceRule.dressCode("Saree");

		if (hipHop == true && dress) {
			System.out.println("Dress is not same");
		} else {
			System.out.println("Dress is same");
		}
	}
}
