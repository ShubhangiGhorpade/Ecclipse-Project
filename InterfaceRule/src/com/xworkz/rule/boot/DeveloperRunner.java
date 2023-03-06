package com.xworkz.rule.boot;

import com.xworkz.rule.thing.CodingRule;

import com.xworkz.rule.thing.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		Developer developer = new Developer();
		String className = developer.className();
		System.out.println(className);
		String enumClass = developer.enumClass();
		System.out.println(enumClass);
		String methods = developer.methods();
		System.out.println(methods);
		boolean navigator = developer.navigator();
		System.out.println(navigator);
		String nonPrimitiveData = developer.nonPrimitiveData();
		System.out.println(nonPrimitiveData);
		int primitiveData = developer.primitiveData();
		System.out.println(primitiveData);
		boolean source = developer.source();
		System.out.println(source);
		String staticVar = developer.staticVar();
		System.out.println(staticVar);
		String syntax = developer.syntax();
		System.out.println(syntax);
		boolean window = developer.window();
		System.out.println(window);
		boolean equals = developer.equals(developer);
		System.out.println(equals);
		String string = developer.toString();
		System.out.println(string);
		int hashCode = developer.hashCode();
		System.out.println(hashCode);

		System.out.println("   ");

		CodingRule rule = new Developer();
		String className1 = rule.className();
		System.out.println(className1);
		String enumClass1 = rule.enumClass();
		System.out.println(enumClass1);
		String methods1 = rule.methods();
		System.out.println(methods1);
		boolean navigator1 = rule.navigator();
		System.out.println(navigator1);
		String nonPrimitiveData1 = rule.nonPrimitiveData();
		System.out.println(nonPrimitiveData1);
		int primitiveData1 = rule.primitiveData();
		System.out.println(primitiveData1);
		boolean source1 = rule.source();
		System.out.println(source1);
		String staticVar1 = rule.staticVar();
		System.out.println(staticVar1);
		String syntax1 = rule.syntax();
		System.out.println(syntax1);
		boolean window1 = rule.window();
		System.out.println(window1);
		boolean equals1 = rule.equals(developer);
		System.out.println(equals1);
		String string1 = rule.toString();
		System.out.println(string1);
		int hashCode1 = rule.hashCode();
		System.out.println(hashCode1);
	}

}
