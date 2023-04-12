package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Runner;
import com.xworkz.collection.lambdaExp.util.RunnerUtil;

public class RunnerMain {

	public static void main(String[] args) {
		Runner runner1 = (dist) -> {

			System.out.println("Distance:" + dist);
			return 0;

		};
		RunnerUtil.test(runner1);
	}

}
