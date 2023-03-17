package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.repository.ApplicationRepositoryImpl;
import com.xworkz.application.service.ApplicationSeriveImp;
import com.xworkz.application.service.ApplicationService;

public class ApplicationRunner {
	public static void main(String[] args) {
		ApplicationDTO application = new ApplicationDTO();
		application.setAppName("Instagram");
		application.setDate(LocalDate.of(1999, 8, 21));
		application.setDevelopedBy("Shaanu");
		application.setAgeLimit(18);
		application.setCreatedBy("Shubhangi");
		application.setSize(22);
		application.setInternetNeeded(true);
		application.setLanguage(Language.ENGLISH);
		application.setMinProcessorSpeed(40);
		application.setType(Type.SOCIALMEDIA);
		application.setMinRamSpaceRequired(18);
		application.setOsType(OSTypeSupported.WINDOWS);
		application.setNoOfDownloads(5);
		application.setPrice(25);
		application.setRating(4);
		application.setVersion(2);
		application.setTrialDays(2);
		application.setCurrentVersionReleaseDate(LocalDate.of(2022, 1, 14));
		application.setFirstVersionReleaseDate(LocalDate.of(2006, 8, 15));
		application.setNextVersionReleaseDate(LocalDate.of(2024, 1, 15));
		System.out.println(application);

		ApplicationRepository repo = new ApplicationRepositoryImpl();

		ApplicationService service = new ApplicationSeriveImp(repo);
		boolean save = service.validateAndThenSave(application);
		System.out.println(save);

		ApplicationDTO application1 = new ApplicationDTO();
		application1.setAppName("watsapp");
		application1.setDate(LocalDate.of(1999, 8, 21));
		application1.setDevelopedBy("Hassu");
		application1.setAgeLimit(18);
		application1.setCreatedBy("Akashta");
		application1.setSize(22);
		application1.setInternetNeeded(true);
		application1.setLanguage(Language.MARATHI);
		application1.setMinProcessorSpeed(40);
		application1.setType(Type.BANKING);
		application1.setMinRamSpaceRequired(18);
		application1.setOsType(OSTypeSupported.WINDOWS);
		application1.setNoOfDownloads(6);
		application1.setPrice(50);
		application1.setRating(3);
		application1.setVersion(2);
		application1.setTrialDays(3);
		application1.setCurrentVersionReleaseDate(LocalDate.of(2022, 1, 14));
		application1.setFirstVersionReleaseDate(LocalDate.of(2006, 8, 15));
		application1.setNextVersionReleaseDate(LocalDate.of(2024, 1, 15));
		System.out.println(application1);

		ApplicationService service1 = new ApplicationSeriveImp(repo);
		boolean save1 = service1.validateAndThenSave(application1);
		System.out.println(save1);
	}
}
