package com.xworkz.stringobj.boot;

import java.security.PublicKey;

public class DairyRunner {

	public static void main(String[] args) {
		String brand = "Nike";
		String type = "Sneaker";
		char brand1 = brand.charAt(1);// returns char of the particular index.
		System.out.println(brand1);// returns type char.

		System.out.println("      ");

		int brand2 = brand.codePointAt(0);// return the Unicode of particular index
		System.out.println(brand2);// return type is int

		int brand3 = brand.codePointBefore(1);// return the unicode of 0 when we give index of 1 den it prints before
												// index value
		System.out.println(brand3);// return type is int

		// the value of index codePointAt(0) is same as codePointBefore(1);

		int brand4 = brand.codePointCount(0, 4);// returns the int value or total char in the String
		System.out.println(brand4);// returns type is int

		int type1 = brand.compareTo(type);// compareTo is not understood
		System.out.println(type1);

		int type2 = brand.compareToIgnoreCase(type);// not understood
		System.out.println(type2);

		String brand5 = brand.concat("Collection");// it is used to add two string
		System.out.println(brand5);// return type is String

		boolean brand6 = brand.contains(type);// return and checks whether the cointains in the two string is same
		System.out.println(brand6);// returns boolean in form of true/false.

		boolean brand7 = brand.contentEquals(type);
		System.out.println(brand7);

		int b = brand.hashCode();
		System.out.println(b);

		int b1 = brand.length();
		System.out.println(b1);

		char ch[] = brand.toCharArray();
		System.out.println(ch);

		String b2 = brand.toLowerCase();
		System.out.println(b2);

		String b3 = brand.toUpperCase();
		System.out.println(b3);

		String b4 = brand.trim();
		System.out.println(b4);

		String c = brand.replace('k', 'c');// it vl replace only 1 char
		System.out.println(c);// return string

		String d = brand.replace("ke", "ci");// it vl replace two char
		System.out.println(d);// return String

		String e = brand.replaceAll("Nike", "Mace");// it vl replace all the string
		System.out.println(e);// return String

		String f = brand.replaceFirst("Nike", "Mace");
		System.out.println(f);

		char[] ch1 = { 'S', 'U', 'G' };
		System.out.println(brand.copyValueOf(ch1));

		boolean g = brand.endsWith("ke");
		System.out.println(g);

		boolean equal = type.equals(brand);
		System.out.println(equal);

		boolean a1 = brand.isEmpty();
		System.out.println(a1);

		byte by[] = brand.getBytes();
		System.out.println(by);

		int i = brand.indexOf(2);
		System.out.println(i);

		String s = brand.intern();
		System.out.println(s);

		System.out.println(brand.valueOf(type));

		CharSequence ch3 = brand.subSequence(1, 3);
		System.out.println(ch3);

		String sb = brand.substring(3);
		System.out.println(sb);

		String s1 = "You are mine";
		System.out.println(s1.toString());

		String temp = "xworkx:raj:odc";
		String[] split = temp.split(":");

		for (String string : split) {
			System.out.println(string);
		}

//		for(String array:s2) {
//			System.out.println(array);
//		}

	}

}
