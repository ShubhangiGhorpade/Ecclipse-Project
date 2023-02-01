package com.file.instanceVarRunner;

import com.file.instanceVar.Flight;

public class FlightRunner {

	public static void main(String[] args) {
		Flight ref=new Flight();
		ref.display();
		System.out.println("After Instantiation");
		ref.initVar("IndiGo", 20000, "Domestic", 150, 'B', "BA", "Belgavi", 12,2491 , false);
		ref.display();
        System.out.println("         ");
        Flight ref1=new Flight();
        ref1.initVar("Private Jet", 30000, "private", 200, 'A', "A+", "pune", 10, 55541, true);
        ref1.display();
	}

}