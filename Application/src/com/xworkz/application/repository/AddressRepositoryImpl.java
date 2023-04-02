package com.xworkz.application.repository;

import com.xworkz.application.dto.AddressDTO;

public class AddressRepositoryImpl implements AddressRepository {

	private AddressDTO address[] = new AddressDTO[3];
	private int AddressIndex = 0;

	@Override
	public boolean save(AddressDTO dto) {
		for (int AddressIndex = 0; AddressIndex < this.address.length; AddressIndex++) {
			this.address[AddressIndex] = dto;
			System.out.println("Index Position:" + AddressIndex);
			this.AddressIndex++;
			return true;
		}

		return false;
	}

	@Override
	public boolean isExist(AddressDTO dto) {
		if (this.AddressIndex == 0) {
			return false;
		} else {
			for (int index = 0; index < this.AddressIndex; index++) {
				AddressDTO addressElement = this.address[index];
				if (addressElement.equals(dto)) {
					System.out.println("First member is saved");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int total() {

		return this.AddressIndex;
	}

	@Override
	public AddressDTO findByNumber(int number) {

		for (int index = 0; index < this.address.length; index++) {
			AddressDTO element = this.address[index];
			if (element.getNumber() == number) {
				System.out.println("Number is present:" + number);
				return element;
			}
		}
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) {

		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		for (int index = 0; index < this.address.length; index++) {
			AddressDTO element = this.address[index];
			if (element.getStreet().equals(street)) {
				System.out.println("Street present :" + street);
				return element;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pinCode) {
		for (int index = 0; index < this.address.length; index++) {
			AddressDTO element1 = this.address[index];
			if (element1.getPinCode() == pinCode) {
				System.out.println("PinCode present:" + pinCode);
				return element1;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(String street, String area, int pinCode) {
		for (int index = 0; index < this.address.length; index++) {
			AddressDTO element2 = this.address[index];
			if (element2 != null && element2.getStreet().equals(street) && element2.getArea().equals(area)
					&& element2.getPinCode() == pinCode) {
				System.out.println("StreetAndPinCodeAndArea:" + street + " " + area + " " + pinCode);
				return element2;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		for (int index = 0; index < this.address.length; index++) {
			AddressDTO element2 = this.address[index];
			if (element2.getCity().equals(city) && element2.getState().equals(state)) {
				System.out.println("CityAndState:" + city + " " + state);
				return element2;
			}
		}
		return null;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPinCode(String street, int floor, int pinCode, int number) {
		for (int index = 0; index < this.address.length; index++) {
			AddressDTO elements = this.address[index];
			if (elements != null && elements.getStreet().equals(street) && elements.getFloor() == floor
					&& elements.getPinCode() == pinCode && elements.getNumber() == number) {
				String cityRef = elements.getCity();
				return cityRef;
			}
		}

		return null;

	}

	@Override
	public int findFloorByNumber(int number) {
		for (int index = 0; index < this.address.length; index++) {
			AddressDTO elements = this.address[index];
			if (elements.getNumber() == number) {
				System.out.println("Number is present");
				int floor = elements.getFloor();
				return floor;
			}
		}
		return 0;
	}

	@Override
	public int findPinCodeByNumber(int number) {
		for (int index = 0; index < this.address.length; index++) {
			AddressDTO element1 = this.address[index];
			if (element1.getNumber() == number) {
				System.out.println("pincode by number");
				int pinCode = element1.getPinCode();
				return pinCode;
			}
		}
		return 0;
	}

}
