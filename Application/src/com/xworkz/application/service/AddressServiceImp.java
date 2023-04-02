package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;

import com.xworkz.application.repository.AddressRepository;
import static com.xworkz.application.util.ValidateAddressUtil.*;

public class AddressServiceImp implements AddressService {

	private AddressRepository repo;

	public AddressServiceImp(AddressRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndThenSave(AddressDTO dto) {
		System.out.println("Running in validateAndThenSave:" + dto);
		if (dto != null) {
			System.out.println("Dto is not null");
			String street = dto.getStreet();
			String area = dto.getArea();
			String city = dto.getCity();
			String state = dto.getState();
			int number = dto.getNumber();
			int pinCode = dto.getPinCode();
			int floor = dto.getFloor();

			boolean validateStreet = false;
			boolean validateArea = false;
			boolean validateCity = false;
			boolean validateState = false;
			boolean validateNumber = false;
			boolean validateCode = false;
			boolean validateFloor = false;

			if (validString(street)) {
				System.out.println("Street is valid");
				validateStreet = true;
			} else {
				System.err.println("Street is invalid");
			}
			if (validString(area)) {
				System.out.println("Area is valid");
				validateArea = true;
			} else {
				System.err.println("Area is invalid");
			}
			if (validString(city)) {
				System.out.println("City is valid");
				validateCity = true;
			} else {
				System.err.println("City is invalid");
			}
			if (validString(state)) {
				System.out.println("State is valid");
				validateState = true;
			} else {
				System.err.println("State is invalid");
			}
			if (validInt(number)) {
				System.out.println("Number is valid");
				validateNumber = true;
			} else {
				System.err.println("Number is invalid");
			}
			if (validInt(pinCode)) {
				System.out.println("Pincode is valid");
				validateCode = true;
			} else {
				System.err.println("Pincode is invalid");
			}
			if (validInt(floor)) {
				System.out.println("Floor is valid");
				validateFloor = true;
			} else {
				System.err.println("Floor is invalid");
			}
			if (validFlag(validateArea && validateCity && validateCode && validateFloor && validateNumber
					&& validateState && validateStreet)) {
				boolean exists = this.repo.isExist(dto);
				if (!exists) {
					boolean save = this.repo.save(dto);
					return save;
				}
			}
		} else {
			System.out.println("Dto i null");
		}
		return false;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

	@Override
	public boolean find(AddressDTO dto) {
		if (dto != null) {
			System.out.println("dto is valid");
			return true;
		} else {
			System.out.println("dto is invalid");
		}
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		if (validString(street)) {
			System.out.println("Street is valid");
			return this.repo.findByStreet(street);
		} else {
			System.out.println("street is invalid");
		}
		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pinCode) {
		if (validInt(pinCode)) {
			System.out.println("PinCode is valid");
			return this.repo.findByPinCode(pinCode);
		} else {
			System.out.println("pinCode is invalid");
		}

		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(String street, String area, int pinCode) {
		if (validString(street) && validString(area) && validInt(pinCode)) {
			System.out.println("street,area,pincode");
			return this.repo.findByStreetAndPinCodeAndArea(street, area, pinCode);
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		if (validString(city) && validString(state)) {
			System.out.println("city,state is valid");
			return this.repo.findByCityAndState(city, state);
		}
		return null;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPinCode(String street, int floor, int pinCode, int number) {
		if (validString(street) && validInt(number) && validInt(pinCode) && validInt(number)) {
			System.out.println("Street:" + street + " " + "Floor:" + floor + " " + "PinCode:" + pinCode + " "
					+ "number:" + number);
			return this.repo.findCityByNumberAndFloorAndStreetAndPinCode(street, floor, pinCode, number);
		}

		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		if (validInt(number)) {
			System.out.println("num is valid");
			return this.repo.findFloorByNumber(number);
		} else {
			System.out.println("num is invalid");
		}
		return 0;
	}

	@Override
	public int findPinCodeByNumber(int number) {
		if (validInt(number)) {
			System.out.println("num is valid");
			return this.repo.findPinCodeByNumber(number);
		} else {
			System.out.println("num is invalid");
		}
		return 0;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		if (validInt(number)) {
			System.out.println("num is valid");
			return this.repo.findByNumber(number);
		} else {
			System.out.println("num is invalid");
		}
		return null;
	}

}
