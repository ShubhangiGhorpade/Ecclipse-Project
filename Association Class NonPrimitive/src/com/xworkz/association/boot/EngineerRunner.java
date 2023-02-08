package com.xworkz.association.boot;

import com.xworkz.association.thing.Degree;
import com.xworkz.association.thing.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer eng = new Engineer();
		eng.setName("Shubhangi");
		eng.setSalary(4.5d);
		String[] skill = { "core java", "html", "css" };
		eng.setSkills(skill);

		Degree degree = new Degree();
		degree.setBranch("BE");
		degree.setDuration(4);
		degree.setName("Shubhangi");
		degree.setPursing(false);
		degree.setPercentage(8.5d);

		Degree degree1 = new Degree();
		degree1.setBranch("BSC");
		degree1.setDuration(3);
		degree1.setName("Akashata");
		degree1.setPursing(false);
		degree1.setPercentage(9.0d);

		Degree[] ref = { degree, degree1 };
		eng.setDegree(ref);

		eng.show();
	}

}
