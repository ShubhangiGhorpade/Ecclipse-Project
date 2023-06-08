package com.xworkz.hospital.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class DeathDTO implements Serializable, Comparable<DeathDTO> {
	@NotNull
	@Size(min = 3, max = 40)
	private String deathId;
	@NotNull
	@Size(min = 3, max = 10)
	private String age;
	@NotNull
	@Size(min = 3, max = 40)
	private String date;
	@NotNull
	@Size(min = 3, max = 40)
	private String name;
	@NotNull
	@Size(min = 3, max = 40)
	private String reason;
	@NotNull
	@Size(min = 3, max = 40)
	private String place;
	@NotNull
	@Size(min = 3, max = 40)
	private String status;
	@NotNull
	@Size(min = 3, max = 40)
	private String district;
	@NotNull
	@Size(min = 3, max = 40)
	private String state;
	@NotNull
	@Size(min = 3, max = 40)
	private String injuryPart;

	@Override
	public int compareTo(DeathDTO o) {

		return this.getName().compareTo(getName());
	}

}
