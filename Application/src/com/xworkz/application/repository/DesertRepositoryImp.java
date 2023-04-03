package com.xworkz.application.repository;

import com.xworkz.application.dto.DesertDTO;

public class DesertRepositoryImp implements DesertRepository {

	private DesertDTO desert[] = new DesertDTO[25];
	private int desertIndex = 0;

	@Override
	public boolean save(DesertDTO dto) {
		if (this.desertIndex < this.desert.length) {
			this.desert[desertIndex] = dto;
			this.desertIndex++;
			return true;
		}
		return false;
	}

	@Override
	public boolean isExist(DesertDTO dto) {
		if (this.desertIndex == 0) {
			System.out.println("First element is saved");
			return false;
		} else {
			for (int index = 0; index < this.desertIndex; index++) {
				DesertDTO tempIndex = this.desert[index];
				if (tempIndex.equals(dto)) {
					System.out.println("First element is not same:" + index);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		if (this.desertIndex == 0) {
			System.out.println("First element is saved");
			return null;
		} else {
			for (int index = 0; index < this.desertIndex; index++) {
				DesertDTO tempIndex = this.desert[index];
				if (tempIndex.equals(dto)) {
					System.out.println("First element is not same:" + index);
					return dto;
				}
			}
		}
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		for (int index = 0; index < this.desertIndex; index++) {
			DesertDTO element = this.desert[index];
			if (element != null && element.getName().equals(name)) {
				return element;
			}
		}
		return null;
	}

	@Override
	public double findAreaByName(String name) {
		for (int index = 0; index < this.desertIndex; index++) {
			DesertDTO element1 = this.desert[index];
			if (element1 != null && element1.getName().equals(name)) {
				double area = element1.getArea();
				return area;
			}
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		for (int index = 0; index < this.desertIndex; index++) {
			DesertDTO element2 = this.desert[index];
			if (element2 != null && element2.getName().equals(name) && element2.getCountry().equals(country)
					&& element2.getArea() == area) {
				return element2;
			}
		}
		return null;
	}

	@Override
	public int total() {

		return this.desertIndex;
	}

}
