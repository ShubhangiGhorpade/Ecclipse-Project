package com.xworkz.equalsmethod.thing;

//13
public class ChiefMinister {
	private String name;
	private double salary;
	private int age;
	private String party;
	private int duration;
	private int inYear;
	private boolean alive;
	private boolean present;
	private String state;
	private String birthPlace;
	private String wifeName;
	private int children;
	private boolean married;

	public ChiefMinister(String name, double salary, int age, String party, int duration, int inYear, boolean alive,
			boolean present, String state, String birthPlace, String wifeName, int children, boolean married) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.party = party;
		this.duration = duration;
		this.inYear = inYear;
		this.alive = alive;
		this.present = present;
		this.state = state;
		this.birthPlace = birthPlace;
		this.wifeName = wifeName;
		this.children = children;
		this.married = married;
	}

	@Override
	public String toString() {
		return "[Name: " + this.name + "][Salary: " + this.salary + "][Age: " + this.age + "][Party: " + this.party
				+ "][Duration: " + this.duration + "][In Year: " + this.inYear + "][Alive: " + this.alive
				+ "][Present: " + this.present + "State: " + this.state + "BirthPlace: " + this.birthPlace
				+ "][WifeName: " + this.wifeName + "][Children: " + this.children + "][Married: " + this.married;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("ChiefMinister running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof ChiefMinister) {
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister minister = this;
				ChiefMinister minister1 = casted;

				if (minister.age == (minister1.age) && minister.alive == minister1.alive
						&& minister.birthPlace.equals(minister1.birthPlace) && minister.children == (minister1.children)
						&& minister.married == minister1.married && minister.present == (minister1.present)
						&& minister.birthPlace.equals(minister1.birthPlace) && minister.inYear == minister1.inYear
						&& minister.duration == minister1.duration && minister.name.equals(minister1.name)
						&& minister.party == minister1.party && minister.salary == minister1.salary
						&& minister.state.equals(minister1.state)) {
					return true;
				} else {
					System.out.println("minister and minister1 are not same");
				}
			} else {
				System.out.println("minister1 is not alcohol type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
