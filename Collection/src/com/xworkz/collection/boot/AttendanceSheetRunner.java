package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AttendanceSheetRunner {

	public static void main(String[] args) {
		Collection<String> attendance = new ArrayList<>();
		attendance.add("Roll NO");
		attendance.add("Date");
		attendance.add("Week");
		attendance.add("TakenBy");
		attendance.add("GivenBy");
		attendance.add("Present");
		attendance.add("Student");
		attendance.add("Id");
		attendance.add("BenchNo");
		attendance.add("Female/Male");
		attendance.add(null);

		System.out.println("Total elements :" + attendance.size());

		System.out.println("For each Loop............");

		for (String attend : attendance) {
			if (Objects.nonNull(attend))
				System.out.println(attend);
		}
		System.out.println("iterator..........");

		Iterator<String> attend = attendance.iterator();
		while (attend.hasNext()) {
			String object = attend.next();
			if (Objects.isNull(object)) {
				attend.remove();
			}
		}
		System.out.println(attendance);
		System.out.println(attendance.size());
	}
}
