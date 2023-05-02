package com.xworkz.usingBean.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@ToString
public class DiamondRing {
	@Value("Akshata")
	private String bride;
	@Value("Bhyasham circle")
	private String location;
	@Value("Rajajinagar")
	private String area;
	@Value("56002")
	private int pincode;
	@Value("500")
	private double price;
	@Value("chicken")
	private String flavour;
	@Value("bangalore")
	private String place;
	@Value("true")
	private boolean function;
	@Value("Hassu")
	private String madeBy;
	@Value("Shannu")
	private String givenTo;
	@Value("3")
	private int rating;
	@Value("Anita")
	private String deliveredBy;
	@Value("1/05/2023")
	private String date;
	@Value("Hassu")
	private String groom;
	@Value("Shubhangi")
	private String managed;

	@Bean
	public String ring() {
		System.out.println("Creating Diamond Ring");
		return "Tashiq";
	}
}
