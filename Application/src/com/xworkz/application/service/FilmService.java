package com.xworkz.application.service;

import com.xworkz.application.dto.FilmDTO;

public interface FilmService {

	boolean validateAndThenSave(FilmDTO dto);

}
