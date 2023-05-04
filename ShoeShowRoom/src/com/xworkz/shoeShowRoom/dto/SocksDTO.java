package com.xworkz.shoeShowRoom.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class SocksDTO implements Serializable, Comparable<SocksDTO> {

	private int size;
	private String colour;

	@Override
	public int compareTo(SocksDTO o) {

		return this.getColour().compareTo(o.getColour());
	}

}
