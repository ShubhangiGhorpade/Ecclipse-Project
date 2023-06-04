package com.xworkz.integration.service;

import com.xworkz.integration.dto.MovieDTO;

public interface MovieService {
	
	boolean validateAndThenSave(MovieDTO dto);

}
