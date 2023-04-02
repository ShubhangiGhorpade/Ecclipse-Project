package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationDataInvalidException;
import com.xworkz.application.repository.EducationRepository;

import static com.xworkz.application.util.ValidateEducationUtil.*;

public class EducationServiceImp implements EducationService {

	private EducationRepository educationRepository;

	public EducationServiceImp(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}

	@Override
	public boolean validateAndThenSave(EducationDTO dto) throws EducationDataInvalidException {
		int id = dto.getId();
		String degreeName = dto.getDegreeName();
		double percentage = dto.getPercentage();
		String university = dto.getUniversity();
		LocalDate startDate = dto.getStartDate();
		LocalDate endDate = dto.getEndDate();
		int backlog = dto.getBacklog();
		String stream = dto.getStream();
		String candidateName = dto.getCandidateName();

		boolean validId = false;
		boolean validDegreeName = false;
		boolean validPercentage = false;
		boolean validUniversity = false;
		boolean validStartDate = false;
		boolean validEndDate = false;
		boolean validBacklog = false;
		boolean validStream = false;
		boolean validCandidateName = false;

		if (validInt(id)) {
			System.out.println("Id is valid");
			validId = true;
		} else {
			System.out.println("Id is invalid");
		}
		if (validString(degreeName)) {
			System.out.println("DegreeName is valid");
			validDegreeName = true;
		} else {
			System.out.println("DegreeName is invalid");
		}
		if (validDouble(percentage)) {
			System.out.println("percentage is valid");
			validPercentage = true;
		} else {
			System.out.println("percentage is invalid");
		}
		if (validString(university)) {
			System.out.println("university is valid");
			validUniversity = true;
		} else {
			System.out.println("university is invalid");
		}
		if (validStartDate(startDate.of(2022, 8, 21))) {
			System.out.println("startDate is valid");
			validStartDate = true;
		} else {
			System.out.println("startDate is invalid");
		}
		if (validStartDate(endDate.of(2023, 11, 5))) {
			System.out.println("endDate is valid");
			validEndDate = true;
		} else {
			System.out.println("endDate is invalid");
		}
		if (validInt(backlog)) {
			System.out.println("backlog is valid");
			validBacklog = true;
		} else {
			System.out.println("backlog is invalid");
		}
		if (validString(stream)) {
			System.out.println("stream is valid");
			validStream = true;
		} else {
			System.out.println("stream is invalid");
		}
		if (validString(candidateName)) {
			System.out.println("candidateName is valid");
			validCandidateName = true;
		} else {
			System.out.println("candidateName is invalid");
		}
		if (validFlag(validBacklog && validCandidateName && validDegreeName && validEndDate && validId
				&& validPercentage && validStartDate && validStream && validUniversity)) {
			boolean exists = this.educationRepository.isExist(dto);
			if (!exists) {
				boolean save = this.educationRepository.save(dto);
				return save;
			} else {
				System.out.println("Doesnot exist");
				throw new EducationDataInvalidException("Fill proper data");
			}
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) throws EducationDataInvalidException {
		if (dto != null) {
			return this.educationRepository.find(dto);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}
	}

	@Override
	public EducationDTO findByCandidateName(String name) throws EducationDataInvalidException {
		if (validString(name)) {
			return this.educationRepository.findByCandidateName(name);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}
	}

	@Override
	public EducationDTO findByCandidateNameAndUnviersity(String name, String uc) throws EducationDataInvalidException {
		if (validString(name) && validString(uc)) {
			return this.educationRepository.findByCandidateNameAndUnviersity(name, uc);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity(String candidateName, String degreeName,
			String uc) throws EducationDataInvalidException {
		if (validString(candidateName) && validString(degreeName) && validString(uc)) {
			return this.educationRepository.findBacklogByCandidateNameAndDegreeNameAndUnviersity(candidateName,
					degreeName, uc);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) throws EducationDataInvalidException {
		if (validString(candidateName) && validStartDate(startDate) && validStartDate(endDate)) {
			return this.educationRepository.findByCandidateNameAndStartDateAndEndDate(candidateName, startDate,
					endDate);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}

	}

	@Override
	public double findPercentageByCandidateName(String candidateName) throws EducationDataInvalidException {
		if (validString(candidateName)) {
			return this.educationRepository.findPercentageByCandidateName(candidateName);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String uc) throws EducationDataInvalidException {
		if (validString(candidateName) && validString(degreeName) && validString(uc)) {
			return this.educationRepository.findStreamByCandidateNameAndDegreeNameAndUniversity(candidateName,
					degreeName, uc);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}

	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String uc)
			throws EducationDataInvalidException {
		if (validString(candidateName) && validString(degreeName) && validString(uc)) {
			return this.educationRepository.findIdByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
					uc);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}

	}

	@Override
	public String findUniversityByCandidateName(String candidateNme) throws EducationDataInvalidException {
		if (validString(candidateNme)) {
			return this.educationRepository.findUniversityByCandidateName(candidateNme);
		} else {
			throw new EducationDataInvalidException("Fill proper data");
		}
	}

	@Override
	public int total() {

		return this.educationRepository.total();
	}

}
