package com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

public class MarriageDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 1)
	@Max(value = 100)
	private int id;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String brideName;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String groomName;
	@NotNull
	private boolean arranged;
	@Future
	private LocalDate date;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 40)
	private String hallName;
	@Min(value = 1)
	@Max(value = 100)
	private int noOfPeopleInvited;
	@NotNull
	private boolean dowry;

	@Override
	public int compareTo(AmbulanceDTO o) {

		return this.getBrideName().compareTo(brideName);
	}

}
