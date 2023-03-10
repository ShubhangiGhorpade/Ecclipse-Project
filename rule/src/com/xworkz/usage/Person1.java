package com.xworkz.usage;

import com.xworkz.rule.Delivery;

public class Person1 {

	private Delivery delivery;

	public Person1(Delivery delivery) {
		System.out.println("const in Person1");
		this.delivery = delivery;
	}

	public void check() {
		double charge1 = this.delivery.charges();
		double timeTaken1 = this.delivery.timeTaken();
		String agentName1 = this.delivery.agentName(2);

		if (charge1 < 60) {
			System.out.println("charges are ok");
		} else {
			System.out.println("charges are expensive");
		}

		if (timeTaken1 <= 30) {
			System.out.println("Ontime delivery");
		} else {
			System.out.println("delayed delivery");
		}
		System.out.println("AgentName>>" + agentName1);
	}

}
