package com.xworkz.thing;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Security {

	private Things thing;

	public Security(Things thing) {
		System.out.println("Creating Security with Thing");
		this.thing = thing;
	}
}
