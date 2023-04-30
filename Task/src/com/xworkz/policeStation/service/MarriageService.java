package com.xworkz.policeStation.service;

import com.xworkz.policeStation.dto.MarriageDTO;

public interface MarriageService {

	boolean validateAndThenSave(MarriageDTO dto);

}
