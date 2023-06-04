package com.xworkz.integration.repository;

import com.xworkz.integration.dto.MovieDTO;

public interface MovieRepo {

	boolean save(MovieDTO dto);
	
}
