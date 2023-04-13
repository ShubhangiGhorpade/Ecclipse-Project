package com.xworkz.collection.lambdaExp.util;

import com.xworkz.collection.lambdaExp.functionalInterface.Eater;

public class EaterUtil {

	public static void test(Eater eater) {
		String eat = eater.eat("Pani-Puri", 20d);
		System.out.println("Eat:" + eat);
	}

}
