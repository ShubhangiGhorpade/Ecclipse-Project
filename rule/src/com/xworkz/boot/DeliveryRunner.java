package com.xworkz.boot;

import com.xworkz.implementor.Dunzo;
import com.xworkz.implementor.Rapido;
import com.xworkz.rule.Delivery;
import com.xworkz.usage.Person1;

public class DeliveryRunner {

	public static void main(String[] args) {
		Delivery delivery = new Rapido();

		Person1 person = new Person1(delivery);
		person.check();

		System.out.println("    ");
		Delivery delivery1 = new Dunzo();

		Person1 person1 = new Person1(delivery1);
		person1.check();

	}

}
