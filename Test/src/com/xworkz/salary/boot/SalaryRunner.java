package com.xworkz.salary.boot;

import java.time.LocalDate;

import com.xworkz.salary.dto.SalaryDTO;
import com.xworkz.salary.exception.InvalidDataException;
import com.xworkz.salary.repository.SalaryRepository;
import com.xworkz.salary.repository.SalaryRepositoryImp;
import com.xworkz.salary.service.SalaryService;
import com.xworkz.salary.service.SalaryServiceImp;

public class SalaryRunner {

	public static void main(String[] args) {
		SalaryDTO dto = new SalaryDTO("Shubhangi", 35000, LocalDate.of(2022, 8, 21), "Shannu", "Bristlecone");
		SalaryDTO dto1 = new SalaryDTO("Akshata", 30000, LocalDate.of(2022, 9, 21), "Hassu", "Wipro");
		SalaryDTO dto2 = new SalaryDTO("Anita", 40000, LocalDate.of(2022, 7, 23), "Devil", "Infosys");
		SalaryRepository repo = new SalaryRepositoryImp();

		SalaryService service = new SalaryServiceImp(repo);
		try {
			boolean save = service.validateAndThenSave(dto);
			System.out.println("Saved:" + save);

			boolean save2 = service.validateAndThenSave(dto1);
			System.out.println(save2);

			boolean save3 = service.validateAndThenSave(dto2);
			System.out.println(save3);

			System.out.println(service.find(dto1));
			System.out.println(service.find(dto2));
			System.out.println("    ");
			service.findAll();
			System.out.println(service.findNameByNameAndGivenBy("Akshata", "Hassu"));
			System.out.println(service.findNameByNameAndGivenBy("Anita", "Devil"));
		} catch (InvalidDataException e) {
			System.out.println("InvalidDataException:" + e.getMessage());
		}

	}

}
