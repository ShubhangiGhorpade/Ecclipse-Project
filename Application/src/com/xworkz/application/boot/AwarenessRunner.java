package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessRunner {

	public static void main(String[] args) {
		AwarenessDTO awareness = new AwarenessDTO();
		awareness.setDate(LocalDate.now());
		awareness.setInitiatedBy("Shaanu");
		awareness.setLocation("Gayatrinagar");
		awareness.setNoOfPeople(30);
		awareness.setType("No Smoking");
		System.out.println(awareness);
		System.out.println(awareness.equals(awareness));
		System.out.println(awareness.hashCode());

	}

}
