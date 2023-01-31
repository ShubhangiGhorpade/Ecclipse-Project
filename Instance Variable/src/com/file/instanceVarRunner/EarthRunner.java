package com.file.instanceVarRunner;

import com.file.instanceVar.Earth;

public class EarthRunner {
public static void main(String[] arg) {
	Earth ref=new Earth();
	ref.display();
	ref.init("Globe", "fourth", "blue and white", "prithvi","four" , "Equator", false,"Milky ", 65, 
			988, "Equator", "topic", "Brown", 150, "Fourth ", "Orbital ", false, 52, 155, 180, 
			"Billion year ago ", null, "2024 ", "Living and Non Living", "Quadilateral ");
	ref.display();

}
}