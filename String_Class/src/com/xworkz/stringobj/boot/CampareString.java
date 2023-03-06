package com.xworkz.stringobj.boot;

public class CampareString {

	public static void main(String[] args) {
		String name = "Anvita";
		/*
		 * String name1 = "Anvita"; String name2 = "Ankita"; int name0 =
		 * name.compareTo(name1); System.out.println(name0);
		 * 
		 * int name9 = name.compareTo(name2); System.out.println(name9);
		 * 
		 * int name8 = name2.compareTo(name); System.out.println(name8);
		 */
		String rev = "";
		char ch[] = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println("origional String :" + name);
		System.out.println("reversed String :" + rev);

		System.out.println("          ");

		System.out.println("count number of words in given sentence");
		String sent = " i want to go from here";
		String[] length1 = sent.split(" ");
		int count1 = length1.length;
		System.out.println(count1);
	}

}
