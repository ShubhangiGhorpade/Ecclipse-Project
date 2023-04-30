package com.xworkz.springConfig.thing1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("barber")
public class Barber {
	
	private String name;
	private int age;
	private int experience;
	private double salary;
	private String gender;
	private long contactNo;
		
	public Barber(@Value("Ashok")String name,@Value("26") int age,@Value("6") int experience
			,@Value("12000") double salary,@Value("Male") String gender,@Value("987654376") long contactNo) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
		this.gender = gender;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", age=" + age + ", experience=" + experience + ", salary=" + salary
				+ ", gender=" + gender + ", contactNo=" + contactNo + "]";
	}
	
	

}
