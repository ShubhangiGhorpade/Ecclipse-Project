package com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.time.DurationMax;
import org.hibernate.validator.constraints.time.DurationMin;

import com.xworkz.policeStation.constatnt.ShowroomLocation;

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

public class ShowroomDTO implements Serializable, Comparable<ShowroomDTO> {
	@NotNull(message = "id is not null")
	@Max(value = 100, message = "id should be less than 100")
	@Min(value = 2, message = "id should be greater than 2")

	private int id;
	@NotNull(message = "name should not be null")
	@NotEmpty(message = "name should not bi empty")
	@Size(max = 20, min = 2, message = "name must cantaince at least 2 char and max is 20 char")

	private String name;

	private ShowroomLocation location;
	@Min(value = 1, message = "number must cantains atliast 1")
	@Max(value = 99999999, message = "max is 9999999")

	private long number;

	@PastOrPresent
	private LocalDate openDate;
	private boolean closed;

	@Override
	public int compareTo(ShowroomDTO o) {
		return this.name.compareTo(o.getName());
	}

}
