package com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.policeStation.constatnt.CellNum;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	@Min(value = 1, message = "id must be greater than 1")
	@Max(value = 100, message = "id must be greater than 100")
	private int id;

	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20)
	private String name;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20)
	private String area;
	// @Min(value = 1)
	// @Max(value = 100)
	private CellNum noOfCell;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20)
	private String inspectorName;

	@Override
	public int compareTo(PoliceStationDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
