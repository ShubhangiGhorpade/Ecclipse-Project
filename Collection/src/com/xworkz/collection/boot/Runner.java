package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		Collection<Byte> floor = new ArrayList<>();
		byte b1 = 1;
		byte b2 = 1;
		byte b3 = 1;
		byte b4 = 1;
		byte b5 = 1;
		byte b6 = 1;
		byte b7 = 1;
		byte b8 = 1;
		byte b9 = 1;
		byte b10 = 2;
		floor.add(b1);
		floor.add(b2);
		floor.add(b3);
		floor.add(b4);
		floor.add(b5);
		floor.add(b6);
		floor.add(b7);
		floor.add(b8);
		floor.add(b9);
		floor.add(b10);
		int total = floor.size();
		System.out.println("total in byte:" + total);

		floor.clear();
		System.out.println("clear:" + floor.size());

		Collection<Short> age = new ArrayList<>();
		short a = 25;
		short b = 8;
		short c = 32;
		short d = 28;
		short e = 42;
		short f = 32;
		short g = 38;
		short h = 50;
		short i = 52;
		short j = 15;
		age.add(a);
		age.add(b);
		age.add(c);
		age.add(d);
		age.add(e);
		age.add(f);
		age.add(g);
		age.add(h);
		age.add(i);
		age.add(j);
		int total1 = age.size();
		System.out.println("TotalLength in short:" + total1);

		age.clear();
		System.out.println("Clear1:" + age.size());

		Collection<Integer> pinCode = new ArrayList<>();
		pinCode.add(587313);
		pinCode.add(61500);
		pinCode.add(587315);
		pinCode.add(631251);
		pinCode.add(781524);
		pinCode.add(6523319);
		pinCode.add(423761);
		pinCode.add(987543);
		pinCode.add(5432817);
		pinCode.add(6563421);

		int total2 = pinCode.size();
		System.out.println("Total1 in integer:" + total2);
		pinCode.clear();
		System.out.println("Clear2:" + pinCode.size());

		Collection<Long> phoneNum = new LinkedList<>();
		phoneNum.add(9611746564l);
		phoneNum.add(6364123100l);
		phoneNum.add(6364123101l);
		phoneNum.add(98765498765l);
		phoneNum.add(8105932128l);
		phoneNum.add(7654326565l);
		phoneNum.add(87654322345l);
		phoneNum.add(7654323457l);
		phoneNum.add(8567765221l);
		phoneNum.add(76298734876l);

		int total3 = phoneNum.size();
		System.out.println("Total2 in long:" + total3);
		phoneNum.clear();
		System.out.println("Clear3:" + phoneNum.size());

		Collection<Float> height = new LinkedList<>();
		height.add(4.7f);
		height.add(5.1f);
		height.add(4.8f);
		height.add(6.1f);
		height.add(5.8f);
		height.add(4.5f);
		height.add(4.0f);
		height.add(5.7f);
		height.add(5.2f);
		height.add(5.6f);

		int total4 = height.size();
		System.out.println("Total4 in float:" + total4);
		height.clear();
		System.out.println("Clear4:" + height.size());

		Collection<Double> salary = new LinkedList<>();
		salary.add(87654d);
		salary.add(23456d);
		salary.add(654356d);
		salary.add(34567d);
		salary.add(98764d);
		salary.add(614323d);
		salary.add(35000d);
		salary.add(45000d);
		salary.add(25000d);
		salary.add(18500d);

		int total5 = salary.size();
		System.out.println("Total5 in double:" + total5);
		salary.clear();
		System.out.println("Clear5:" + salary.size());

		Collection<Boolean> person = new ArrayList<>();
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);

		int total6 = person.size();
		System.out.println("Total6 in boolean:" + total6);
		person.clear();
		System.out.println("Clear6:" + person.size());

		Collection<Character> nameChar = new ArrayList<>();
		nameChar.add('S');
		nameChar.add('H');
		nameChar.add('U');
		nameChar.add('B');
		nameChar.add('H');
		nameChar.add('A');
		nameChar.add('N');
		nameChar.add('G');
		nameChar.add('I');
		nameChar.add('S');

		int total7 = nameChar.size();
		System.out.println("Total7 in char:" + total7);
		nameChar.clear();
		System.out.println("Clear7:" + nameChar.size());

		Collection<String> movies = new ArrayList<>();
		movies.add("Yeh jawaani hai deewani");
		movies.add("Rab ne bana di jodi");
		movies.add("Sanam teri kasam");
		movies.add("Mahanati");
		movies.add("Miss India");
		movies.add("Premam");
		movies.add("Yashoda");
		movies.add("Shershaah");
		movies.add("Kesari");
		movies.add("Airlift");

		int total8 = movies.size();
		System.out.println("Total8 in char:" + total8);
		movies.clear();
		System.out.println("Clear8:" + movies.size());

	}

}
