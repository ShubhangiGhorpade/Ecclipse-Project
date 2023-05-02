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
	public Short weight1() {
		System.out.println("registering weight");
		return 34;
	}

	@Bean
	public Short distance1() {
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

	@Bean
	public Boolean female() {
		System.out.println(
				"Running female in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean male() {
		System.out.println(
				"Running male in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean married() {
		System.out.println(
				"Running married in BooleanConfiguration");
		return false;
	}

	@Bean
	public Boolean unmarried() {
		System.out.println(
				"Running unmarried in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean studying() {
		System.out.println(
				"Running studying in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean working() {
		System.out.println(
				"Running working in BooleanConfiguration");
		return false;
	}

	@Bean
	public Boolean singer() {
		System.out.println(
				"Running singer in BooleanConfiguration");
		return false;
	}

	@Bean
	public Character div1() {
		System.out.println(
				"Running div1 in CharConfiguration");
		return 'A';
	}

	@Bean
	public Character div2() {
		System.out.println(
				"Running div2 in CharConfiguration");
		return 'B';
	}

	@Bean
	public Character div3() {
		System.out.println(
				"Running div3 in CharConfiguration");
		return 'C';
	}

	@Bean
	public Character div4() {
		System.out.println(
				"Running div4 in CharConfiguration");
		return 'D';
	}

	@Bean
	public Character div5() {
		System.out.println(
				"Running div5 in CharConfiguration");
		return 'E';
	}

	@Bean
	public Character div6() {
		System.out.println(
				"Running div6 in CharConfiguration");
		return 'F';
	}

	@Bean
	public Double height2() {
		System.out.println(
				"Running height in DoubleConfiguration");
		return 5.6;
	}

	@Bean
	public Double weight2() {
		System.out.println(
				"Running weight in DoubleConfiguration");
		return 39.9;
	}

	@Bean
	public Double roomSize() {
		System.out.println(
				"Running roomSize in DoubleConfiguration");
		return 29.8;
	}

	@Bean
	public Double waistSize() {
		System.out.println(
				"Running waistSize in DoubleConfiguration");
		return 32.6;
	}

	@Bean
	public Double iceCreamQuantity() {
		System.out.println(
				"Running iceCreamQuantity in DoubleConfiguration");
		return 29.7;
	}

	@Bean
	public Double goldRate() {
		System.out.println(
				"Running goldRate in DoubleConfiguration");
		return 57008.56;
	}

	@Bean
	public Double silverRate() {
		System.out.println(
				"Running silverRate in DoubleConfiguration");
		return 20890.45;
	}

	@Bean
	public Double ringSize() {
		System.out.println(
				"Running ringSize in DoubleConfiguration");
		return 2.3;
	}

	@Bean
	public Double bangleSize() {
		System.out.println(
				"Running bangleSize in DoubleConfiguration");
		return 2.5;
	}

	@Bean
	public Float salary() {
		System.out.println(
				"Running salary in FloatConfiguration");
		return 25000.50f;
	}

	@Bean
	public Float height() {
		System.out.println(
				"Running height in FloatConfiguration");
		return 4.10f;
	}

	@Bean
	public Float weight() {
		System.out.println(
				"Running weight in FloatConfiguration");
		return 53.5f;
	}

	@Bean
	public Float distance() {
		System.out.println(
				"Running distance in FloatConfiguration");
		return 350.80f;
	}

	@Bean
	public Float cost() {
		System.out.println(
				"Running cost in FloatConfiguration");
		return 500f;
	}

	@Bean
	public Float quantityOfMilk() {
		System.out.println(
				"Running quantityOfMilk in FloatConfiguration");
		return 1.5f;
	}

	@Bean
	public Float quantityOfRice() {
		System.out.println(
				"Running quantityOfRice in FloatConfiguration");
		return 25.5f;
	}

	@Bean
	public Float wheatPrice() {
		System.out.println(
				"Running wheatPrice in FloatConfiguration");
		return 1200.89f;
	}

	@Bean
	public Float dosaLength() {
		System.out.println(
				"Running dosaLength in FloatConfiguration");
		return 3.56f;
	}

	@Bean
	public Long fatherContactNo() {
		System.out.println(
				"Running fatherContactNo in LongConfiguration");
		return 9620809927l;
	}

	@Bean
	public Long pincodeOfDharwad() {
		System.out.println(
				"Running pincodeOfDharwad in LongConfiguration");
		return 580001l;
	}

	@Bean
	public Long pincodeOfHubli() {
		System.out.println(
				"Running pincodeOfHubli in LongConfiguration");
		return 5800377l;
	}

	@Bean
	public Long pincodeOfTumkur() {
		System.out.println(
				"Running pincodeOfTumkur in LongConfiguration");
		return 560023l;
	}
}
