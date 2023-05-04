package com.xworkz.shoeShowRoom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ShoeShowRoomDTO
		implements Serializable, Comparable<ShoeShowRoomDTO> {
	@Min(value = 1, message = "id must be greater than 1")
	@Max(value = 10, message = "id must be less than 4")
	private int id;
	@Size(min = 2, max = 8)
	private String name;
	@Size(min = 2, max = 8)
	private String address;
	@Size(min = 2, max = 8)
	private String gstNo;

	@Override
	public int compareTo(ShoeShowRoomDTO o) {

		return this.name.compareTo(o.getName());
	}

}
