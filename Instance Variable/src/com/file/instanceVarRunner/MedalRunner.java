package com.file.instanceVarRunner;


import com.file.instanceVar.Medal;

public class MedalRunner {

	public static void main(String[] args) {
		Medal ref=new Medal();
		ref.display();
		System.out.println("After Instantiation");
		ref.initVar("Gold", "chairman", "Badminton", 250, "Annual day", 10, "Secured first in Badminton",
				"21/01/2022", 3, "First", "Tuesday", "Shubhangi", "Gold Miles", true);
        ref.display();
        System.out.println("      ");
        Medal ref1=new Medal();
        ref1.initVar("Diamond", "president", "Tennis", 300, "Sports day",9, "Secured second in Tennis",
        		"18/01/2023", 2, "second", "Wednesday", "Ram", "Diamond miles", true);
        ref1.display();
	}

}
