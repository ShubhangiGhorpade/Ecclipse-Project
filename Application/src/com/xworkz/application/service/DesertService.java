package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertDataInvalidException;

public interface DesertService {

	boolean validateAndThenSave(DesertDTO dto) throws DesertDataInvalidException;

	DesertDTO find(DesertDTO dto) throws DesertDataInvalidException;

	DesertDTO findByName(String name) throws DesertDataInvalidException;

	double findAreaByName(String name) throws DesertDataInvalidException;

	DesertDTO findByNameAndCountryAndArea(String name, String country, double area) throws DesertDataInvalidException;

	int total();

}
