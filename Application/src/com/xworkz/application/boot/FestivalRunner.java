package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepository;
import com.xworkz.application.repository.FestivalRepositoryImpl;
import com.xworkz.application.service.FestivalService;
import com.xworkz.application.service.FestivalServiceImpl;

public class FestivalRunner {

	public static void main(String[] args) {
		FestivalDTO dto = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 8, 21), LocalDate.of(2023, 9, 23), "Laxmi",
				"Neem/Jaggery");
		FestivalDTO dto1 = new FestivalDTO(2, "Holi", LocalDate.of(2023, 8, 21), LocalDate.of(2023, 9, 23), "Laxmi",
				"Neem/Jaggery");
		// FestivalDTO dto2 = new FestivalDTO(3, "Ramzan", LocalDate.of(2023, 8, 21),
		// LocalDate.of(2023, 9, 23), "Laxmi",
		// "Neem/Jaggery");
		// FestivalDTO dto3 = new FestivalDTO(4, "GoodFriday", LocalDate.of(2023, 8,
		// 21), LocalDate.of(2023, 9, 23),
		// "Laxmi", "Neem/Jaggery");

		FestivalRepository repo = new FestivalRepositoryImpl();

		FestivalService service = new FestivalServiceImpl(repo);
		FestivalService service1 = new FestivalServiceImpl(repo);
		// FestivalService service2 = new FestivalServiceImpl(repo);
		// FestivalService service3 = new FestivalServiceImpl(repo);

		try {
			boolean save = service.validateAndThenSave(dto);
			System.out.println(save);
			boolean save1 = service1.validateAndThenSave(dto1);
			System.out.println(save1);
			// boolean save2 = service2.validateAndThenSave(dto2);
			// System.out.println(save2);
			// boolean save3 = service3.validateAndThenSave(dto3);
			// System.out.println(save3);

		} catch (InvalidFestivalException e) {
			System.err.println("InvalidFestivalException in Festival:" + e.getMessage());
		}

		System.out.println("DTO:" + service1.totalCount());
	}

}
