package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.thing.Hunter;
import com.xworkz.collection.lambdaExp.util.Util;

public class HunterRunner {

	public static void main(String[] args) {
		Hunter hunter = (total) -> {
			System.out.println("Running in main:" + total);
		};

		Util.test(hunter);
	}

}
