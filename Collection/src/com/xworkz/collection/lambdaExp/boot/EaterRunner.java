package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Eater;
import com.xworkz.collection.lambdaExp.util.EaterUtil;

public class EaterRunner {

	public static void main(String[] args) {
		Eater eater = (item, quantity) -> {

			return item;

		};
		Eater eater1 = (item, quantity) -> {

			return item.toLowerCase();

		};
		Eater eater2 = (item, quantity) -> {

			return item.toUpperCase();

		};
		EaterUtil.test(eater);
		EaterUtil.test(eater1);
		EaterUtil.test(eater2);
	}

}
