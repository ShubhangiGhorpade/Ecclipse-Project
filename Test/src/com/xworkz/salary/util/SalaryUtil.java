package com.xworkz.salary.util;

import java.time.LocalDate;

public class SalaryUtil {

	public static boolean validString(String var) {
		if (var != null && !var.isEmpty() && var.length() > 3 && var.length() < 100) {
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

	public static boolean date(LocalDate val) {
		LocalDate start = LocalDate.of(2022, 1, 1);
		if (val.isAfter(start)) {
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
