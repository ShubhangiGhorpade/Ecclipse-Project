package com.xworkz.boot;

import com.xworkz.thing.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();
		String citizen = employee.citizen();
		System.out.println(citizen);
		boolean criminalRecord = employee.criminalRecord();
		System.out.println(criminalRecord);
		boolean jail = employee.jail();
		System.out.println(jail);
		double maxGoldLimit = employee.maxGoldLimit();
		System.out.println(maxGoldLimit);
		double minAmount = employee.minAmount();
		System.out.println(minAmount);
		boolean stayingHotel = employee.stayingHotel();
		System.out.println(stayingHotel);
		boolean followStandards = employee.followStandards();
		System.out.println(followStandards);
		boolean underStandingConcepts = employee.underStandingConcepts();
		System.out.println(underStandingConcepts);
		employee.setCreatedBy("Shubhangi...");
		employee.setCreatedBy("Shaanu....");

	}

}
