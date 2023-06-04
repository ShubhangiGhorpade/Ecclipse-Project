package com.xworkz.hospital.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DeathDTO implements Serializable, Comparable<DeathDTO> {

	private String deathId;
	private String age;
	private String date;
	private String name;
	private String reason;
	private String place;
	private String status;
	private String district;
	private String state;
	private String injuryPart;

	@Override
	public int compareTo(DeathDTO o) {

		return this.getName().compareTo(getName());
	}

}
