package com.xworkz.shoeShowRoom.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolishDTO implements Serializable, Comparable<PolishDTO> {

	@Min(value = 1, message = "id must be greater than 1s")
	private int id;
	@Size(min = 2, max = 4, message = "brand must have greater than 2")
	private String brand;

	@Override
	public int compareTo(PolishDTO o) {

		return this.getBrand().compareTo(o.getBrand());
	}

}
