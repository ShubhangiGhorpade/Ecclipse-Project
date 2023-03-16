package com.xworkz.application.util;

import java.time.LocalDate;

public class ValidateHeadPhoneUtil {

	private ValidateHeadPhoneUtil() {
		System.out.println("No agr const in ValidateHeadPhoneUtil");
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validPrice(double value) {
		if (value > 0 && value < 2000) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int value) {
		if (value > 0 && value < 200) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date, LocalDate past) {
		LocalDate now = LocalDate.now().plusDays(1);
		if (date != null && date.isAfter(past) && date.isBefore(now)) {
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
