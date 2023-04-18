package com.xworkz.collection.lambdaExp.dto;

import java.io.Serializable;
import java.util.Objects;

public class MLADTO implements Serializable {

	private String name;
	private int age;
	private String constituency;
	private String party;
	private boolean independent;
	private String gender;

	public MLADTO() {
		System.out.println("No arg const ");
	}

	public MLADTO(String name, int age, String constituency, String party, boolean independent, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.constituency = constituency;
		this.party = party;
		this.independent = independent;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "MLADTO [name=" + name + ", age=" + age + ", constituency=" + constituency + ", party=" + party
				+ ", independent=" + independent + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, constituency, gender, independent, name, party);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MLADTO)) {
			return false;
		}
		MLADTO other = (MLADTO) obj;
		return age == other.age && Objects.equals(constituency, other.constituency)
				&& Objects.equals(gender, other.gender) && independent == other.independent
				&& Objects.equals(name, other.name) && Objects.equals(party, other.party);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getConstituency() {
		return constituency;
	}

	public String getParty() {
		return party;
	}

	public boolean isIndependent() {
		return independent;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
