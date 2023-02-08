package com.xworkz.association.thing;

public class Engineer {
	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degree;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public void setDegree(Degree[] degree) {
		this.degree = degree;
	}

	public void show() {
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
		if (this.skills != null) {
			for (int seq = 0; seq < skills.length; seq++) {
				String element = this.skills[seq];
				System.out.println("Skill : " + element + " at index : " + seq);
			}
		} else {
			System.err.println("this.skill is null......");
		}
		if (this.degree != null) {
			for (int seq = 0; seq < degree.length; seq++) {
				Degree element = this.degree[seq];
				element.show();
			}
		} else {
			System.err.println("this.degree is null......");
		}
	}
}
