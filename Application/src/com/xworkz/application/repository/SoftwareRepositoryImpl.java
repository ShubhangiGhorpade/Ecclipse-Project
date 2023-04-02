package com.xworkz.application.repository;

import com.xworkz.application.dto.SoftwareDTO;

public class SoftwareRepositoryImpl implements SoftwareRepository {

	private SoftwareDTO software[] = new SoftwareDTO[2];
	private int softwareIndex = 0;

	@Override
	public boolean save(SoftwareDTO dto) {
		if (this.softwareIndex < this.software.length) {
			this.software[softwareIndex] = dto;
			System.out.println("dto is saved at the index :" + this.softwareIndex + " " + dto);
			this.softwareIndex++;
			return true;
		}

		return false;
	}

	@Override
	public boolean isExist(SoftwareDTO dto) {
		if (this.softwareIndex == 0) {
			System.out.println("first index will not check");
			return false;
		}
		for (int index = 0; index < this.softwareIndex; index++) {
			SoftwareDTO dtoElement = this.software[index];
			if (dtoElement.equals(dto)) {
				System.out.println("Two references are same and therefore will not be saved");
				return true;
			}

		}
		return false;
	}

	@Override
	public int totalSaved() {
		return this.softwareIndex;
	}

	@Override
	public SoftwareDTO findID(int id) {
		for (int index = 0; index < this.software.length; index++) {
			SoftwareDTO ref = this.software[index];
			if (ref.getId() == id) {
				System.out.println("dto is having this id :" + id);
				return ref;
			}
		}
		return null;
	}

	@Override
	public SoftwareDTO findByName(String name) {
		for (int index = 0; index < this.software.length; index++) {
			SoftwareDTO ref1 = this.software[index];
			if (ref1.getName().equals(name)) {
				System.out.println("name is present and therefore returning SoftwareDTO " + name);
				return ref1;
			}
		}
		return null;
	}

	@Override
	public SoftwareDTO findByNameAndId(String name, int id) {
		for (int index = 0; index < this.software.length; index++) {
			SoftwareDTO nameAndId = this.software[index];
			if (nameAndId.getId() == id && nameAndId.getName().equals(name)) {
				System.out
						.println("dto with this name and id exists and returning the SoftwareDTO :" + id + " " + name);
				return nameAndId;
			}
		}
		return null;
	}

}
