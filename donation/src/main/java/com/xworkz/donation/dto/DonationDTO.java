package com.xworkz.donation.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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
public class DonationDTO implements Serializable,Comparable<DonationDTO>{
	
	@Size(min = 3,max = 20,message = "Name should be between 3 to 20")
	private String name;
	@Min(value = 18,message = "Age must be greater or equal to 18")
	private int age;
	@Min(value = 50,message = "Weight must be more than 50")
	private double weight;
	@NotEmpty(message = "Address must not be empty")
	private String address;
	@NotEmpty(message = "BloodGroup must not be empty")
	private String bloodGroup;
	
	@Override
	public int compareTo(DonationDTO o) {
		
		return this.getName().compareTo(o.getName());
	}
	

}
