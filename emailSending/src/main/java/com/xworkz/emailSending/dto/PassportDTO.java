package com.xworkz.emailSending.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data

public class PassportDTO implements Serializable, Comparable<PassportDTO> {

	private String fName;
	private String lName;
	private long number;
	private String email;

	@Override
	public int compareTo(PassportDTO o) {

		return getFName().compareTo(o.getFName());
	}

}
