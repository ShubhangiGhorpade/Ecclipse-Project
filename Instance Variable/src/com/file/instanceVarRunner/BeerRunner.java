package com.file.instanceVarRunner;

import com.file.instanceVar.Beer;

public class BeerRunner {

	public static void main(String[] arg) {
		Beer ref=new Beer();
		ref.display();
		System.out.println("      ");
		ref.init("King Fisher", 2000, "Beer", 2, 500, 4, 5, "Cyclindrical", "Grape",
				15, 2022, 2023, 5, true, 20, "shyam", "sameer", "Gandhi circle", "Mumbai", "Bangalore",
				"ship", "ship",15555, "good for cough", "Kidney Failure", "Glass", "wine factory", 2, "beer");
		ref.display();
		System.out.println("      ");
		Beer ref1=new Beer();
		ref1.init("Old Monk", 1500, "Beer", 4, 600, 3, 8, "Spherical","sugarcane", 12, 
				2021, 2022, 4, false, 20, "Avinash", "Akshay", "shivaji circle", "Hyderabad", "pune", "train", 
				"train", 26395, "good for heart", "Liver failure", "Glass", "wine factory", 2, "beer");
		ref.display();
		
	}
}