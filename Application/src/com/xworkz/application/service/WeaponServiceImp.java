package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.WeaponType;
import com.xworkz.application.dto.WeaponDTO;

public class WeaponServiceImp implements WeaponService {

	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {
		System.out.println("Running in WeaponServiceImp:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			String name = dto.getName();
			int id = dto.getId();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			LocalDate manufacturedYear = dto.getManufacturedYear();
			String manufacturedBy = dto.getManufacturedBy();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();
			WeaponType type = dto.getType();

			boolean validName = false;
			boolean validId = false;
			boolean validCost = false;
			boolean validMaterial = false;
			boolean validMadeBy = false;
			boolean validManufacturedYear = false;
			boolean validManufacturedBy = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;
			boolean validType = false;

			if (name != null && !name.isEmpty() && name.length() > 2 && name.length() < 30) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (id > 0 && id < 1000) {
				System.out.println("id is valid");
				validId = true;
			} else {
				System.err.println("Id is not valid");
			}
			if (cost > 100 && cost < 100000) {
				System.out.println("cost is valid");
				validCost = true;
			} else {
				System.err.println("cost is invalid");
			}
			if (material != null && !material.isEmpty() && material.length() > 2 && material.length() < 30) {
				System.out.println("material is valid");
				validMaterial = true;
			} else {
				System.err.println("material is invalid");
			}
			if (madeBy != null && !madeBy.isEmpty() && madeBy.length() > 2 && madeBy.length() < 30) {
				System.out.println("madeBy is valid");
				validMadeBy = true;
			} else {
				System.err.println("madeBy is invalid");
			}
			if (manufacturedBy != null && !manufacturedBy.isEmpty() && manufacturedBy.length() > 2
					&& manufacturedBy.length() < 30) {
				System.out.println("manufacturedBy is valid");
				validManufacturedBy = true;
			} else {
				System.err.println("manufacturedBy is invalid");
			}
			if (usedBy != null && !usedBy.isEmpty() && usedBy.length() > 2 && usedBy.length() < 30) {
				System.out.println("usedBy is valid");
				validUsedBy = true;
			} else {
				System.err.println("usedBy is invalid");
			}
			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 2 && usedFor.length() < 30) {
				System.out.println("usedFor is valid");
				validUsedFor = true;
			} else {
				System.err.println("usedFor is invalid");
			}
			LocalDate past = LocalDate.of(2000, 1, 1);
			LocalDate now = LocalDate.now();
			if (manufacturedYear != null && manufacturedYear.isAfter(past) && manufacturedYear.isBefore(now)) {
				System.out.println("manufacturedYear is valid");
				validManufacturedYear = true;
			} else {
				System.err.println("manufacturedYear is invalid");
			}
			if (weight < 1000 && weight > 250) {
				System.out.println("weight is valid");
				validWeight = true;
			} else {
				System.err.println("weight is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validType = true;
			} else {
				System.err.println("type is invalid");
			}
			if (validCost && validId && validMadeBy && validManufacturedBy && validManufacturedYear && validMaterial
					&& validName && validType && validUsedBy && validUsedFor && validWeight) {
				System.out.println("DTO is valid");
				return true;
			} else {
				System.err.println("DTO is invalid");
			}

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
