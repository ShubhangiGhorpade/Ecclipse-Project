package com.xworkz.application.repository;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;

public class EducationRepositoryImpl implements EducationRepository {

	private EducationDTO education[] = new EducationDTO[20];
	private int educationIndex = 0;

	@Override
	public boolean save(EducationDTO dto) {
		System.out.println("Running in save:" + dto);
		if (this.educationIndex < this.education.length) {
			this.education[educationIndex] = dto;
			System.out.println("Index position:" + educationIndex);
			this.educationIndex++;
			return true;
		} else {
			System.out.println("Memory out of bound");
		}
		return false;
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		if (this.educationIndex == 0) {
			return false;
		} else {
			for (int index = 0; index < this.educationIndex; index++) {
				EducationDTO tempIndex = this.education[index];
				if (tempIndex.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			if (dto.equals(dto)) {
				return dto;
			}
		} else {
			System.out.println("Dto is null");
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element = this.education[index];
			if (element != null && element.getCandidateName().equals(name)) {
				return element;
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUnviersity(String name, String uc) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element1 = this.education[index];
			if (element1 != null && element1.getCandidateName().equals(name) && element1.getUniversity().equals(uc)) {
				return element1;
			}
		}

		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity(String candidateName, String degreeName,
			String uc) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element2 = this.education[index];
			if (element2 != null && element2.getCandidateName().equals(candidateName)
					&& element2.getDegreeName().equals(degreeName) && element2.getUniversity().equals(uc)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element3 = this.education[index];
			if (element3 != null && element3.getCandidateName().equals(candidateName)
					&& element3.getStartDate().equals(startDate) && element3.getEndDate().equals(endDate)) {
				return element3;
			}
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element4 = this.education[index];
			if (element4!=null&&element4.getCandidateName().equals(candidateName)) {
				double percentage = element4.getPercentage();
				return percentage;
			}
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String uc) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element5 = this.education[index];
			if (element5 != null && element5.getCandidateName().equals(candidateName)
					&& element5.getDegreeName().equals(degreeName) && element5.getUniversity().equals(uc)) {
				String stream = element5.getStream();
				return stream;
			}
		}
		return null;
	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String uc) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element6 = this.education[index];
			if (element6 != null && element6.getCandidateName().equals(candidateName)
					&& element6.getDegreeName().equals(degreeName) && element6.getUniversity().equals(uc)) {
				int id = element6.getId();
				return id;
			}
		}
		return 0;
	}

	@Override
	public String findUniversityByCandidateName(String candidateNme) {
		for (int index = 0; index < this.education.length; index++) {
			EducationDTO element7 = this.education[index];
			if (element7 != null && element7.getCandidateName().equals(candidateNme)) {
				String university = element7.getUniversity();
				return university;
			}
		}
		return null;
	}

	@Override
	public int total() {

		return this.educationIndex;
	}

}
