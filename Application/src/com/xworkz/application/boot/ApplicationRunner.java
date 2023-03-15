package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
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

		ApplicationService service = new ApplicationSeriveImp();
		boolean save = service.validateAndThenSave(application);
		System.out.println(save);

	}
}
