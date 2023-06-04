package com.xworkz.contactApp.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ContactDTO implements Serializable, Comparable<ContactDTO> {

	private String name;
	private String email;
	private String mobileNum;
	private String type;
	private String description;
	private String country;

	@Override
	public int compareTo(ContactDTO o) {
		return getName().compareTo(o.getName());
	}

}
