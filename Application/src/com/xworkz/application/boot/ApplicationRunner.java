package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRunner {
	public static void main(String[] args) {
		ApplicationDTO application = new ApplicationDTO();
		application.setAppName("Instagram");
		application.setDate(LocalDate.of(1999, 8, 21));
		application.setDevelopedBy("Shaanu");
		application.setSince(1988);
		application.setSize(22);
		System.out.println(application);
		System.out.println(application.hashCode());
		System.out.println(application.equals(application));
	}
}
