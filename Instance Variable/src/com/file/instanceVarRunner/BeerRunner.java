package com.file.instanceVarRunner;

import com.file.instanceVar.Beer;

public class BeerRunner {

	public static void main(String[] arg) {
		Beer ref=new Beer();
		ref.display();
      
		ref.init("King Fisher", 2000, "Beer", 2, 500, 4, 5, "Cyclindrical", "Grape",
				15, 2022, 2023, 5, true, 20, "shyam", "sameer", "Gandhi circle", "Mumbai", "Bangalore",
				"ship", "ship",15555, "good for cough", "Kidney Failure", "Glass", "wine factory", 2, "beer");
		ref.display();
	}
}