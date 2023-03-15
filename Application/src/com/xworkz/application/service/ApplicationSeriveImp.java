package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationSeriveImp implements ApplicationService {

	@Override
	public boolean validateAndThenSave(ApplicationDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			String developedBy = dto.getDevelopedBy();
			String createdBy = dto.getCreatedBy();
			double price = dto.getPrice();
			int trialDays = dto.getTrialDays();
			double minProcessorSpeed = dto.getMinProcessorSpeed();
			double minRamSpaceRequired = dto.getMinRamSpaceRequired();
			boolean internetNeeded = dto.isInternetNeeded();
			int ageLimit = dto.getAgeLimit();
			int noOfDownloads = dto.getNoOfDownloads();
			int rating = dto.getRating();
			int version = dto.getVersion();
			String appName = dto.getAppName();
			double size = dto.getSize();
			LocalDate date = dto.getDate();
			LocalDate firstVersionReleaseDate = dto.getFirstVersionReleaseDate();
			LocalDate currentVersionReleaseDate = dto.getCurrentVersionReleaseDate();
			LocalDate nextVersionReleaseDate = dto.getNextVersionReleaseDate();
			Type type = dto.getType();
			Language language = dto.getLanguage();
			OSTypeSupported osType = dto.getOsType();

			boolean validDeveloped = false;
			boolean validCreated = false;
			boolean validPrice = false;
			boolean validTrialDays = false;
			boolean validMinProcessorSpeed = false;
			boolean validMinRamSpaceRequired = false;
			boolean validInternetNeeded = false;
			boolean validAgeLimit = false;
			boolean validNoOfDownloads = false;
			boolean validRating = false;
			boolean validVersion = false;
			boolean validAppName = false;
			boolean validDate = false;
			boolean validSize = false;
			boolean validFirstVersionReleaseDate = false;
			boolean validCurrentVersionReleaseDate = false;
			boolean validNextVersionReleaseDate = false;
			boolean validType = false;
			boolean validLang = false;
			boolean validOSType = false;

			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3
					&& developedBy.length() < 30) {
				System.out.println("Developed By is valid");
				validDeveloped = true;
			} else {
				System.err.println("Developed By is invalid");
			}
			if (createdBy != null && !createdBy.isEmpty() && createdBy.length() > 3 && createdBy.length() < 30) {
				System.out.println("Created by is valid ");
				validCreated = true;
			} else {
				System.err.println("created by is invalid");
			}
			if (price > 0 && price < 100) {
				System.out.println("Price is valid");
				validPrice = true;
			} else {
				System.err.println("price is invalid");
			}
			if (trialDays > 0 && trialDays < 100) {
				System.out.println("Trial days is valid");
				validTrialDays = true;
			} else {
				System.err.println("Trial days is invalid");
			}
			if (minProcessorSpeed > 0 && minProcessorSpeed < 100) {
				System.out.println("minProcessorSpeed is valid");
				validMinProcessorSpeed = true;
			} else {
				System.err.println("minProcessorSpeed is invalid");
			}
			if (minRamSpaceRequired > 0 && minRamSpaceRequired < 100) {
				System.out.println("minRamSpaceRequired is valid ");
				validMinRamSpaceRequired = true;
			} else {
				System.err.println("minRamSpaceRequired is invalid");
			}
			if (internetNeeded) {
				System.out.println("internetNeeded is valid");
				validInternetNeeded = true;
			} else {
				System.err.println("internetNeeded is invalid");
			}
			if (ageLimit > 0 && ageLimit < 100) {
				System.out.println("Age is valid");
				validAgeLimit = true;
			} else {
				System.err.println("Age is invalid");
			}
			if (noOfDownloads > 0 && noOfDownloads < 100) {
				System.out.println("NoOfDownloads is valid");
				validNoOfDownloads = true;
			} else {
				System.err.println("NoOfDownloads is in valid");
			}
			if (rating > 0 && rating < 100) {
				System.out.println("Rating is valid");
				validRating = true;
			} else {
				System.err.println("Rating is invalid");
			}
			if (version > 0 && version < 100) {
				System.out.println("Version is valid");
				validVersion = true;
			} else {
				System.err.println("version is invalid");
			}
			if (appName != null && !appName.isEmpty() && appName.length() < 3 && appName.length() > 30) {
				System.out.println("AppName is valid");
				validAppName = true;
			} else {
				System.err.println("AppName is invalid");
			}
			if (size > 0 && size < 100) {
				System.out.println("Size is valid");
				validSize = true;
			} else {
				System.err.println("Size is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validType = true;
			} else {
				System.err.println("type is invalid");
			}
			if (language != null) {
				System.out.println("language is valid");
				validLang = true;
			} else {
				System.err.println("language is invalid");
			}
			if (osType != null) {
				System.out.println("osType is valid");
				validOSType = true;
			} else {
				System.err.println("osType is invalid");
			}
			LocalDate date1 = LocalDate.now().plusDays(1);
			LocalDate startDate = LocalDate.of(2005, 1, 1);
			if (firstVersionReleaseDate != null && !firstVersionReleaseDate.isBefore(date1)
					&& firstVersionReleaseDate.isAfter(startDate)) {
				System.out.println("firstVersionReleaseDate is valid");
				validFirstVersionReleaseDate = true;
			} else {
				System.err.println("firstVersionReleaseDate is invalid");
			}
			LocalDate currentVersion = LocalDate.of(2022, 1, 14);
			if (currentVersionReleaseDate != null && !currentVersionReleaseDate.isEqual(currentVersion)) {
				System.out.println("currentVersionReleaseDate is valid");
				validCurrentVersionReleaseDate = true;
			} else {
				System.err.println("currentVersionReleaseDate is invalid");
			}
			LocalDate nextVersion = LocalDate.now().plusDays(1);
			LocalDate tommorow = LocalDate.of(2023, 03, 15);
			if (nextVersionReleaseDate != null && !nextVersionReleaseDate.isBefore(nextVersion)
					&& !nextVersionReleaseDate.isAfter(tommorow)) {
				System.out.println("nextVersionReleaseDate is valid");
				validNextVersionReleaseDate = true;
			} else {
				System.err.println("nextVersionReleaseDate is invalid");
			}
			if (date != null) {
				System.out.println("date is valid");
				validDate = true;
			} else {
				System.err.println("date is invalid");
			}

		} else {
			System.err.println("dt is null");
		}
		return false;
	}

}
