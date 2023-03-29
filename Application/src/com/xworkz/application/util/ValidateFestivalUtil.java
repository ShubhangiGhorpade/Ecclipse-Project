package com.xworkz.application.util;

import java.time.LocalDate;

public class ValidateFestivalUtil {

	public static boolean validInteger(int value) {
		if (value > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validStartDate(LocalDate value) {
		LocalDate year = LocalDate.of(2023, 12, 31);
		if (value != null && value.isBefore(year)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean flags(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean element = flag[index];
			if (!element) {
				return false;
			}
		}

		return true;

	}

}
