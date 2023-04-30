package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("scissor")
public class Scissor {

	private String type;
	private double weight;
	@Value("Black")
	private String colour;

	public Scissor(@Value("Bandage") String type, @Value("23.5d") double weight) {
		this.type = type;
		this.weight = weight;
	}

	public void setColour(String colour) {
		this.colour=colour;
	}

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", colour=" + colour + "]";
	}
	
	
}
