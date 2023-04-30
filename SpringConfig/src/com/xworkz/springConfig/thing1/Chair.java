package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("chair")
public class Chair {

	@Value("Black")
	private String colour;
	@Value("Round")
	private String shape;
	@Value("Sitting")
	private String type;

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chair [colour=" + colour + ", shape=" + shape + ", type=" + type + "]";
	}

}
