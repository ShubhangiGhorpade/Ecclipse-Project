package com.xworkz.usage;

import com.xworkz.rule.EatingRule;

public class Military  {

	public EatingRule eatingRule;
	
	public Military(EatingRule eatingRule) {
		this.eatingRule = eatingRule;
	}
	
	public void checkEatingRule() {
		boolean wash=this.eatingRule.washedHands("Akshu");
		double duration=this.eatingRule.durationTaken();
		
		if(duration <=EatingRule.DURATION && wash) {
			System.out.println("Eating is good");
		}else {
			System.out.println("Eating is bad");
		}
	}
}
