package com.xworkz.application.service;

import com.xworkz.application.dto.FilmDTO;
import com.xworkz.application.repository.FilmRepository;

import static com.xworkz.application.util.ValidateFilmUtil.*;

public class FilmServiceImp implements FilmService {

	private FilmRepository repo;

	public FilmServiceImp(FilmRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndThenSave(FilmDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			String name = dto.getName();
			String producer = dto.getProducer();
			String hero = dto.getHero();
			String heroine = dto.getHeroine();

			boolean validName = false;
			boolean validProducer = false;
			boolean validHero = false;
			boolean validHeroine = false;

			if (validString(name)) {
				System.out.println("Name is valid");
				validName = true;
			} else {
				System.err.println("Name is invalid");
			}

			if (validString(producer)) {
				System.out.println("producer is valid");
				validProducer = true;
			} else {
				System.err.println("producer is invalid");
			}
			if (validString(hero)) {
				System.out.println("Hero is valid");
				validHero = true;
			} else {
				System.err.println("Hero is invalid");
			}
			if (validString(heroine)) {
				System.out.println("Heroine is valid");
				validHeroine = true;
			} else {
				System.err.println("Heroine is invalid");
			}
			if (flags(validHero && validHeroine && validProducer && validName)) {
				System.out.println("Dto is valid");
				boolean saved = this.repo.save(dto);
				return saved;

			} else {
				System.err.println("Dto is invalid");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
