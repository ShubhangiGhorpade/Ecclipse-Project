package com.file.instanceVarRunner;

import com.file.instanceVar.Earth;

public class EarthRunner {
public static void main(String[] arg) {
	Earth ref=new Earth();
	ref.display();
	System.out.println("      ");
	ref.init("Globe", "fourth", "blue and white", "prithvi","four" , "Equator", false,"Milky ", 65, 
			988, "Equator", "topic", "Brown", 150, "Fourth ", "Orbital ", false, 52, 155, 180, 
			"Billion year ago ", null, "2024 ", "Living and Non Living", "Quadilateral ");
	ref.display();
	System.out.println("      ");
	Earth ref1=new Earth();
    ref1.init("oval", "fourth", "blue", "heaven", "four", "equator", false, "Milkyway", 60,
    		9555, "Equality", "topicon", "black", 180, "shin", "orbital", true, 51, 45, 80, "Billions of year",
    		"silicon city", null, "All species", "Quadilateral");
}
}