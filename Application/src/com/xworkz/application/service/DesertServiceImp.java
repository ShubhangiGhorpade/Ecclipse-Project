package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertDataInvalidException;
import com.xworkz.application.repository.DesertRepository;

import static com.xworkz.application.util.ValidateDesertUtil.*;

public class DesertServiceImp implements DesertService {

	private DesertRepository desertRepository;

	public DesertServiceImp(DesertRepository desertRepository) {
		this.desertRepository = desertRepository;
	}

	@Override
	public boolean validateAndThenSave(DesertDTO dto) throws DesertDataInvalidException {
		if (dto != null) {
			System.out.println("dto is not null");

			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			double area = dto.getArea();
			double minTemp = dto.getMinTemp();
			double maxTemp = dto.getMaxTemp();

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validArea = false;
			boolean validMinTemp = false;
			boolean validMaxTemp = false;

			if (validInt(id)) {
				System.out.println("Id is valid");
				validId = true;
			} else {
				System.err.println("Id is invalid");
			}
			if (validString(name)) {
				System.out.println("Name is valid");
				validName = true;
			} else {
				System.err.println("Name is invalid");
			}
			if (validString(country)) {
				System.out.println("Country is invalid");
				validCountry = true;
			} else {
				System.err.println("Country is invalid");
			}
			if (validDouble(area)) {
				System.out.println("Area is valid");
				validArea = true;
			} else {
				System.err.println("Area is invalid");
			}
			if (validDouble(minTemp)) {
				System.out.println("MinTemp is valid");
				validMinTemp = true;
			} else {
				System.err.println("MinTemp is invalid");
			}
			if (validDouble(maxTemp)) {
				System.out.println("MaxTemp is valid");
				validMaxTemp = true;
			} else {
				System.err.println("MaxTemp is invalid");
			}

			if (validFlag(validArea && validCountry && validId && validMaxTemp && validMinTemp && validName)) {
				System.out.println("dto is saved");
				boolean exist = this.desertRepository.isExist(dto);
				if (!exist) {
					boolean save = this.desertRepository.save(dto);
					return save;
				} else {
					System.out.println("Memory out of bound");
				}
			} else {
				System.out.println("dto not saved");
			}
		}

		else {

			System.err.println("Dto is null");
			throw new DesertDataInvalidException("fill proper data");
		}
		return false;

	}

	@Override
	public DesertDTO find(DesertDTO dto) throws DesertDataInvalidException {
		if (dto != null) {
			System.out.println("dto not null");
			return this.desertRepository.find(dto);
		} else {
			throw new DesertDataInvalidException("fill proper data");
		}
	}

	@Override
	public DesertDTO findByName(String name) throws DesertDataInvalidException {
		if (validString(name)) {
			return this.desertRepository.findByName(name);
		} else {
			throw new DesertDataInvalidException("fill proper data");
		}

	}

	@Override
	public double findAreaByName(String name) throws DesertDataInvalidException {
		if (validString(name)) {
			return this.desertRepository.findAreaByName(name);
		} else {
			throw new DesertDataInvalidException("fill proper data");
		}
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area)
			throws DesertDataInvalidException {
		if (validString(name) && validString(country) && validDouble(area)) {
			return this.desertRepository.findByNameAndCountryAndArea(name, country, area);
		}
		throw new DesertDataInvalidException("fill proper data");
	}

	@Override
	public int total() {

		return this.desertRepository.total();
	}

}
