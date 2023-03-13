package com.xworkz.application.boot;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.application.dto.AttendanceDTO;

public class AttendanceRunner {

	public static void main(String[] args) {
		AttendanceDTO attendance = new AttendanceDTO();
		attendance.setDate(LocalDate.now());
		attendance.setDivision('B');
		attendance.setName("Shaanu");
		attendance.setPresent(true);
		attendance.setTime(LocalTime.now());
		System.out.println(attendance);
		System.out.println(attendance.equals(attendance));
		System.out.println(attendance.hashCode());

	}

}
