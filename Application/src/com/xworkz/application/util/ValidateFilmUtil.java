package com.xworkz.application.util;

public class ValidateFilmUtil {

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty()  && value.length() > 3 && value.length() < 30) {
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
