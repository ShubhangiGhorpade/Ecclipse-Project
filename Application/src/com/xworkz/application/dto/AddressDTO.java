package com.xworkz.application.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable {

	private String street;
	private String area;
	private String city;
	private String state;
	private int number;
	private int pinCode;
	private int floor;

	public AddressDTO() {
		System.out.println("No Arg constructor in AddressDTO");
	}

	public AddressDTO(String street, String area, String city, String state, int number, int pinCode, int floor) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.number = number;
		this.pinCode = pinCode;
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", area=" + area + ", city=" + city + ", state=" + state + ", number="
				+ number + ", pinCode=" + pinCode + ", floor=" + floor + "]";
	}

	public String getStreet() {
		return street;
	}

	public String getArea() {
		return area;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getNumber() {
		return number;
	}

	public int getPinCode() {
		return pinCode;
	}

	public int getFloor() {
		return floor;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

}
