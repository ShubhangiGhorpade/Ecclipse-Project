package com.xworkz.shoeShowRoom.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SalesManagerDTO
		implements Serializable, Comparable<SalesManagerDTO> {

	private String name;
	private int age;

	@Override
	public int compareTo(SalesManagerDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
