package com.xworkz.usingBean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.ToString;

@Configuration
@ComponentScan("com.xworkz.jdbcAssessment.configuration")
@ToString
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out
				.println("creating the no arg constructor");
	}

	@Bean
	public String email() {
		System.out.println("registering email...");
		return "Subhangi21.xworkz@gmail.com";
	}

	@Bean
	public String address() {
		System.out.println("registering address...");
		return "Bhyasham circle";
	}

	@Bean
	public String location() {
		System.out.println("registering location...");
		return "Rajajinagar";
	}

	@Bean
	public String flavour() {
		System.out.println("registering flavour...");
		return "PaneerGrill";
	}

	@Bean
	public String music() {
		System.out.println("registering music...");
		return "TumBin";
	}

	@Bean
	public String web() {
		System.out.println("registering web...");
		return "Netflix";
	}

	@Bean
	public String version() {
		System.out.println("registering version...");
		return "Andriod";
	}

	@Bean
	public String place() {
		System.out.println("registering place...");
		return "Bangalore";
	}

	@Bean
	public String run() {
		System.out.println("registering run...");
		return "Sann..";
	}

	@Bean
	public String nickName() {
		System.out.println("registering nickName...");
		return "shaanu";
	}

	@Bean
	public String cartoon() {
		System.out.println("registering cartoon...");
		return "Shinchan";
	}

	@Bean
	public String mobile() {
		System.out.println("registering mobile...");
		return "RealMe";
	}

	@Bean
	public String leader() {
		System.out.println("registering leader...");
		return "Shubhangi";
	}

	@Bean
	public Integer number() {
		System.out.println("registering number ");
		return 21;
	}

	@Bean
	public Integer rollNo() {
		System.out.println("registering rollNo ");
		return 05;
	}

	@Bean
	public Integer serialNo() {
		System.out.println("registering serialNo ");
		return 2;
	}

	@Bean
	public Integer birthday() {
		System.out.println("registering birthday ");
		return 15;
	}

	@Bean
	public Integer noOfPeople() {
		System.out.println("registering noOfPeople ");
		return 100;
	}

	@Bean
	public Integer noOfFloor() {
		System.out.println("registering noOfFloor ");
		return 4;
	}

	@Bean
	public Integer staff() {
		System.out.println("registering staff ");
		return 15;
	}

	@Bean
	public Integer platform() {
		System.out.println("registering platform ");
		return 6;
	}

	@Bean
	public Integer block() {
		System.out.println("registering block ");
		return 5;
	}

	@Bean
	public Short size() {
		System.out.println("registering size");
		return 6;
	}

	@Bean
	public Short age() {
		System.out.println("registering age");
		return 21;
	}

	@Bean
	public Short no() {
		System.out.println("registering no");
		return 15;
	}

	@Bean
	public Short seize() {
		System.out.println("registering seize");
		return 49;
	}

	@Bean
	public Short weight() {
		System.out.println("registering weight");
		return 34;
	}

	@Bean
	public Short distance() {
		System.out.println("registering distance");
		return 9;
	}

	@Bean
	public Short lens() {
		System.out.println("registering lens");
		return 2;
	}

	@Bean
	public Short note() {
		System.out.println("registering note");
		return 77;
	}

	@Bean
	public Short pen() {
		System.out.println("registering pen");
		return 18;
	}

	@Bean
	public byte bits() {
		System.out.println("registering bits");
		return 12;
	}

	@Bean
	public byte marbles() {
		System.out.println("registering marbles");
		return 31;
	}

	@Bean
	public byte ring() {
		System.out.println("registering ring");
		return 3;
	}

	@Bean
	public byte chappal() {
		System.out.println("registering chappal");
		return 60;
	}

	@Bean
	public byte spoon() {
		System.out.println("registering spoon");
		return 4;
	}

	@Bean
	public byte bill() {
		System.out.println("registering bill");
		return 8;
	}

	@Bean
	public byte bottle() {
		System.out.println("registering bottle");
		return 17;
	}

	@Bean
	public byte coin() {
		System.out.println("registering coin");
		return 65;
	}

	@Bean
	public byte charge() {
		System.out.println("registering charge");
		return 72;
	}

	@Bean
	public long MobileNo() {
		System.out.println("registering MobileNo");
		return 6364123100l;
	}
}
