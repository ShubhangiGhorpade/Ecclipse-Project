package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Feb14;
import com.xworkz.inheritance.thing.ValentineDay;

public class ValentineDayRunner {

	public static void main(String[] args) {
		Feb14 feb=new Feb14();
		feb.setPatnerName("*****");
		String name=feb.getPatnerName();
		System.out.println("Name : "+name);
		feb.day();
		
		ValentineDay day=new Feb14();
		day.setPatnerName("****");
		String name1=day.getPatnerName();
		System.out.println("Name : "+name1);
		
		Feb14 casted=(Feb14)day;
		casted.day();

	}

}
