package com.xworkz.application.repository;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;

public interface EducationRepository {

	boolean save(EducationDTO dto);

	default boolean isExist(EducationDTO dto) {
		return false;

	}

	EducationDTO find(EducationDTO dto);

	EducationDTO findByCandidateName(String name);

	EducationDTO findByCandidateNameAndUnviersity(String name, String uc);

	boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity(String candidateName, String degreeName, String uc);

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate);

	double findPercentageByCandidateName(String candidateName);

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String uc);

	int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String uc);

	String findUniversityByCandidateName(String candidateNme);

	int total();

}
