package com.xworkz.collection.lambdaExp.util;

import com.xworkz.collection.lambdaExp.functionalInterface.Runner;

public class RunnerUtil {

	public static void test(Runner runner) {

		double running = runner.running(500d);
		System.out.println("Running:" + running);
	}

}
