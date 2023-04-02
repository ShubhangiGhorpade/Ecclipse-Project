package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;

public interface AddressService {

	boolean validateAndThenSave(AddressDTO dto);

	int total();

	AddressDTO findByNumber(int number);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByPinCode(int pinCode);

	AddressDTO findByStreetAndPinCodeAndArea(String street, String area, int pinCode);

	AddressDTO findByCityAndState(String city, String state);

	String findCityByNumberAndFloorAndStreetAndPinCode(String street, int floor, int pinCode, int number);

	int findFloorByNumber(int number);

	int findPinCodeByNumber(int number);

}
