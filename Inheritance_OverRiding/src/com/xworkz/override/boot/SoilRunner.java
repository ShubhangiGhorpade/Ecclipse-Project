package com.xworkz.override;

import com.xworkz.override.thing.Mud;
import com.xworkz.override.thing.Soil;

public class SoilRunner {

	public static void main(String[] args) {
		Soil soil = new Mud();
		String type = soil.getType();
		System.out.println("Type: " + type);
		boolean dry = soil.getDry();
		System.out.println("Dry or not: " + dry);
	}

}
