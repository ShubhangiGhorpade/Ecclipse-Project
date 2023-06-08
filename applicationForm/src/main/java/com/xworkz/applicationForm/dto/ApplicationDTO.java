package com.xworkz.applicationForm.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationDTO
		implements Serializable, Comparable<ApplicationDTO> {

	@Size(min = 3,max = 40,message = "Name should be between 3 to 40")
	private String name;
	
	@Min(value = 50,message = "Weight must be more than 30")
	private double weight;
	
	@Size(min = 3,max = 40,message = "Address should be between 3 to 40")
	private String address;
	
	@Min(value = 50,message = "Age must be more than 18")
	private int age;
	
	@Size(min = 3,max = 40,message = "CollegeName should be between 3 to 40")
	private String collegeName;

	@Override
	public int compareTo(ApplicationDTO o) {

		return this.getName().compareTo(o.getName());
	}

}
