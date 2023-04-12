package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Eater;
import com.xworkz.collection.lambdaExp.util.EaterUtil;

public class EaterRunner {

	public static void main(String[] args) {
		Eater eater = (item, quantity) -> {
			System.out.println("Item:" + item);
			System.out.println("Item in lowercase:" + item.toLowerCase());
			System.out.println("Item in uppercase:" + item.toUpperCase());

			return null;

		};
		EaterUtil.test(eater);
	}

}
