package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Hunter;
import com.xworkz.collection.lambdaExp.util.Util;

public class HunterRunner {

	public static void main(String[] args) {
		Hunter hunter = (total) -> {
			System.out.println("Running in main:" + total);
		};

		Util.test(hunter);//Explicit

		Util.test((total1) -> {
			System.out.println("Running in main:" + total1);
		});//Implicit
	}

}
