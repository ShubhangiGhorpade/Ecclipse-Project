package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExamSchedule {

	public static void main(String[] args) {
		Collection<String> examSchedules = new ArrayList<>();
		examSchedules.add("Date");
		examSchedules.add("Month");
		examSchedules.add("Morning");
		examSchedules.add("ExaminerName");
		examSchedules.add("CoOrdinatorName");
		examSchedules.add("Subject");
		examSchedules.add("Monday");
		examSchedules.add("Present");
		examSchedules.add("BenchNo");
		examSchedules.add("RegisterNo");

		System.out.println("Total Number of elements are :" + examSchedules.size());

		System.out.println("For each Loop..........");

		for (String exam : examSchedules) {
			if (exam != null) {
				System.out.println(exam);
			}
		}

		System.out.println("Iterator.........");

		Iterator<String> exam = examSchedules.iterator();
		while (exam.hasNext()) {
			String exam1 = exam.next();
			if (Objects.isNull(exam1)) {
				exam.remove();
			}
		}
		System.out.println(examSchedules);
		System.out.println(examSchedules.size());
	}

}
