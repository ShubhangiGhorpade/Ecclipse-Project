package com.xworkz.application.boot;

import com.xworkz.application.dto.FilmDTO;
import com.xworkz.application.repository.FilmRepository;
import com.xworkz.application.repository.FilmRepositoryImpl;
import com.xworkz.application.service.FilmService;
import com.xworkz.application.service.FilmServiceImp;

public class FilmRunner {

	public static void main(String[] args) {
		FilmDTO film = new FilmDTO("Yeh jawani hai Dewani", "Ayyan Mukherjee", "Ranbir", "Deepika");

		FilmRepository repo1 = new FilmRepositoryImpl();

		FilmService film1 = new FilmServiceImp(repo1);
		boolean save = film1.validateAndThenSave(film);
		System.out.println(save);

		FilmDTO film2 = new FilmDTO("RRRR", "Rajamouli", "Ram Charan", "Alia");

		FilmService film3 = new FilmServiceImp(repo1);
		boolean save1 = film3.validateAndThenSave(film2);
		System.out.println(save1);

	}

}
