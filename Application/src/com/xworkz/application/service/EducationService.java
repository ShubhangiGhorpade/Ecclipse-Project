package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationDataInvalidException;

public interface EducationService {

	boolean validateAndThenSave(EducationDTO dto) throws EducationDataInvalidException;

	EducationDTO find(EducationDTO dto) throws EducationDataInvalidException;

	EducationDTO findByCandidateName(String name) throws EducationDataInvalidException;

	EducationDTO findByCandidateNameAndUnviersity(String name, String uc) throws EducationDataInvalidException;

	boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity(String candidateName, String degreeName, String uc)
			throws EducationDataInvalidException;

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate, LocalDate endDate)
			throws EducationDataInvalidException;

	double findPercentageByCandidateName(String candidateName) throws EducationDataInvalidException;

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String uc)
			throws EducationDataInvalidException;

	int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String uc)
			throws EducationDataInvalidException;

	String findUniversityByCandidateName(String candidateNme) throws EducationDataInvalidException;

	int total();

}
