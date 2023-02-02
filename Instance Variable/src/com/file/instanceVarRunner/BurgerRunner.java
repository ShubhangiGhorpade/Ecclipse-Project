package com.file.instanceVarRunner;

import com.file.instanceVar.Burger;

public class BurgerRunner {

	public static void main(String[] args) {
		System.out.println("Starting of main method");
		Burger burger=new Burger("Chicken Burger", 180, "Chicken", "KFC", "Chandhi chowk","Jeffery", 
				"Gain Weight", "Good for change", 22, 5,10, 2, true, true, false);
        burger.show();
	}
}