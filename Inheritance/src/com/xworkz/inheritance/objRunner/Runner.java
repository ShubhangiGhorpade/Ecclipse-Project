package com.xworkz.inheritance.objRunner;

import com.xworkz.inheritance.obj.Cricket;
import com.xworkz.inheritance.obj.Sport;

public class Runner {

	public static void main(String[] args) {
		Converter con = new Converter();
		Sport sport =new Cricket();
		
		con.display(sport);
	}
}
