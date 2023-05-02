package com.xworkz.usingBean.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Party {

	@Value("Webseries")
	private String name;
	@Value("Lee meno")
	private String hero;
	@Value("Abby")
	private String heroin;
	@Value("560")
	private int castMember;
	@Value("5000000")
	private double collection;
	@Value("chicken")
	private String flavour;
	@Value("bangalore")
	private String place;
	@Value("false")
	private boolean series;
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
	@Value("Akshata")
	private String trailer;
	@Value("Shubhangi")
	private String mention;

	@Bean
	public String dance() {
		System.out.println("No Arg constructor in Party");
		return "NewYear";
	}

}
