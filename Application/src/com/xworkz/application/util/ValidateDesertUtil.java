package com.xworkz.application.util;

public class ValidateDesertUtil {

	public static boolean validString(String var) {
		if (var != null && !var.isEmpty() && var.length() > 3 && var.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int value) {
		if (value > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double value) {
		if (value > 0) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean element = flag[index];
			if (!element) {
				return false;
			}
		}
		return true;

	}
}
