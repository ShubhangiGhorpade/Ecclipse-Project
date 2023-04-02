package com.xworkz.application.util;

import java.time.LocalDate;

public class ValidateEducationUtil {

	public static boolean validString(String var) {
		if (var != null && !var.isEmpty() && var.length() < 300 && var.length() > 1) {
			return true;
		}
		return false;

	}

	public static boolean validInt(int value) {
		if (value > 0 && value < 500000) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double value) {
		if (value > 0 && value < 500000) {
			return true;
		}
		return false;
	}

	public static boolean validStartDate(LocalDate start) {
		LocalDate today = LocalDate.of(2022, 1, 1);
		LocalDate tmmrw = LocalDate.of(2024, 4, 1);
		if (start.isAfter(today) && start.isBefore(tmmrw)) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean temp = flag[index];
			if (!temp) {
				return false;
			}
		}
		return true;

	}
}
