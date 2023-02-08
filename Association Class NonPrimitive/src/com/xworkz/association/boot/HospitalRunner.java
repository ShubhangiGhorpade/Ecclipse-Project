package com.xworkz.association.boot;

import com.xworkz.association.thing.Doctor;
import com.xworkz.association.thing.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("Shri Sai");

		Doctor doctor = new Doctor();
		doctor.setName("Shashank Bhide");
		doctor.setExperience(12.5d);
		String[] ref = { "Heart surgery", "MBBS" };
		doctor.setSpecialization(ref);

		Doctor doctor1 = new Doctor();
		doctor1.setName("Pratap Shinde");
		doctor1.setExperience(12.5d);
		String[] ref1 = { "Brain Surgery", "MBBS" };
		doctor1.setSpecialization(ref1);

		Doctor[] doc = { doctor, doctor1 };
		hospital.setDoctor(doc);

		hospital.show();
	}

}
