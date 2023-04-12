package com.xworkz.collection.lambdaExp.boot;

import com.xworkz.collection.lambdaExp.functionalInterface.Shooter;
import com.xworkz.collection.lambdaExp.util.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {
		Shooter shooter = (gunType) -> {
			System.out.println("Shooter:" + gunType);

			return false;

		};
		ShooterUtil.test(shooter);
	}

}
