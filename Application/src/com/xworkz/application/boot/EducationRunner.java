package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationDataInvalidException;
import com.xworkz.application.repository.EducationRepository;
import com.xworkz.application.repository.EducationRepositoryImpl;
import com.xworkz.application.service.EducationService;
import com.xworkz.application.service.EducationServiceImp;

public class EducationRunner {

	public static void main(String[] args) {
		EducationDTO dto = new EducationDTO(21, "B.E", 7, "VTU", LocalDate.of(2022, 8, 21), LocalDate.of(2022, 9, 18),
				1, "EC", "Shubhangi");
		EducationDTO dtos = new EducationDTO(22, "B.Sc", 8, "KST", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Akshata");
		EducationDTO dtos1 = new EducationDTO(23, "B.Sc", 9, "KSTc", LocalDate.of(2022, 9, 11),
				LocalDate.of(2022, 11, 18), 3, "PCMB", "Anita");
		EducationDTO dtos2 = new EducationDTO(24, "BCom", 9, "VTU", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 4), 1, "PCCS", "Shannu");
		EducationDTO dtos3 = new EducationDTO(25, "B.Sc", 8, "KSB", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Hassu");
		EducationDTO dtos4 = new EducationDTO(26, "B.E", 8, "KST", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "ComputerScience", "Sahana");
		EducationDTO dtos5 = new EducationDTO(27, "B.E", 10, "KSTc", LocalDate.of(2022, 9, 1),
				LocalDate.of(2022, 10, 15), 2, "CS", "Shruti");
		EducationDTO dtos6 = new EducationDTO(28, "B.Sc", 11, "VTU", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Swati");
		EducationDTO dtos7 = new EducationDTO(29, "B.Sc", 12, "KPSC", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "yogita");
		EducationDTO dtos8 = new EducationDTO(30, "B.Sc", 13, "KSB", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Pondi");
		EducationDTO dtos9 = new EducationDTO(31, "B.Sc", 14, "VTU", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "sneha");
		EducationDTO dtos10 = new EducationDTO(32, "B.Sc", 15, "KSTC", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "payal");
		EducationDTO dtos11 = new EducationDTO(33, "B.Sc", 16, "KSPC", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "vishala");
		EducationDTO dtos12 = new EducationDTO(34, "B.Sc", 17, "KST", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "suraj");
		EducationDTO dtos13 = new EducationDTO(35, "B.Sc", 18, "VTU", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Shiv");
		EducationDTO dtos14 = new EducationDTO(36, "B.Sc", 82, "KBT", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Mansik");
		EducationDTO dtos15 = new EducationDTO(37, "B.Sc", 199, "VTU", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Bhairavi");
		EducationDTO dtos16 = new EducationDTO(38, "B.Sc", 35, "KST", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Sneha");
		EducationDTO dtos17 = new EducationDTO(39, "B.Sc", 37, "VTU", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Anna");
		EducationDTO dtos18 = new EducationDTO(40, "B.Sc", 38, "KSB", LocalDate.of(2022, 9, 21),
				LocalDate.of(2022, 10, 18), 2, "PCM", "Muskan");

		EducationRepository repo = new EducationRepositoryImpl();

		EducationService service = new EducationServiceImp(repo);
		EducationService service1 = new EducationServiceImp(repo);
		EducationService service2 = new EducationServiceImp(repo);
		EducationService service3 = new EducationServiceImp(repo);
		EducationService service4 = new EducationServiceImp(repo);
		EducationService service5 = new EducationServiceImp(repo);
		EducationService service6 = new EducationServiceImp(repo);
		EducationService service7 = new EducationServiceImp(repo);
		EducationService service8 = new EducationServiceImp(repo);
		EducationService service9 = new EducationServiceImp(repo);
		EducationService service10 = new EducationServiceImp(repo);
		EducationService service11 = new EducationServiceImp(repo);
		EducationService service12 = new EducationServiceImp(repo);
		EducationService service13 = new EducationServiceImp(repo);
		EducationService service14 = new EducationServiceImp(repo);
		EducationService service15 = new EducationServiceImp(repo);
		EducationService service16 = new EducationServiceImp(repo);
		EducationService service17 = new EducationServiceImp(repo);
		EducationService service18 = new EducationServiceImp(repo);
		EducationService service19 = new EducationServiceImp(repo);
		try {
			boolean save = service.validateAndThenSave(dto);
			System.out.println("saved:" + save);
			boolean save1 = service1.validateAndThenSave(dtos);
			System.out.println("save1:" + save1);
			boolean save2 = service2.validateAndThenSave(dtos18);
			System.out.println("save2:" + save2);
			boolean save3 = service3.validateAndThenSave(dtos1);
			System.out.println("save3:" + save3);
			boolean save4 = service4.validateAndThenSave(dtos2);
			System.out.println("save4:" + save4);
			boolean save5 = service5.validateAndThenSave(dtos3);
			System.out.println("save5:" + save5);
			boolean save6 = service6.validateAndThenSave(dtos4);
			System.out.println("save6:" + save6);
			boolean save7 = service7.validateAndThenSave(dtos5);
			System.out.println("save7:" + save7);
			boolean save8 = service8.validateAndThenSave(dtos6);
			System.out.println("save8:" + save8);
			boolean save9 = service9.validateAndThenSave(dtos7);
			System.out.println("save9:" + save9);
			boolean save10 = service10.validateAndThenSave(dtos8);
			System.out.println("save10:" + save10);
			boolean save11 = service11.validateAndThenSave(dtos9);
			System.out.println("save11:" + save11);
			boolean save12 = service12.validateAndThenSave(dtos10);
			System.out.println("save12:" + save12);
			boolean save13 = service13.validateAndThenSave(dtos11);
			System.out.println("save13:" + save13);
			boolean save14 = service14.validateAndThenSave(dtos12);
			System.out.println("save14:" + save14);
			boolean save15 = service15.validateAndThenSave(dtos13);
			System.out.println("save15:" + save15);
			boolean save16 = service16.validateAndThenSave(dtos14);
			System.out.println("save16:" + save16);
			boolean save17 = service17.validateAndThenSave(dtos15);
			System.out.println("save17:" + save17);
			boolean save18 = service18.validateAndThenSave(dtos16);
			System.out.println("save18:" + save18);
			boolean save19 = service19.validateAndThenSave(dtos17);
			System.out.println("save19:" + save19);

		} catch (EducationDataInvalidException e) {
			System.out.println("EducationDataInvalidException:" + e.getMessage());
		}
		System.out.println(" ");
		try {
			EducationDTO dto1 = service.find(dto);
			System.out.println("DTO:" + dto1);
			EducationDTO dtoRef = service1.find(dtos);
			System.out.println("dtoRef:" + dtoRef);
			EducationDTO dtoRef1 = service2.find(dtos1);
			System.out.println("dtoRef1:" + dtoRef1);
			EducationDTO dtoRef2 = service3.find(dtos2);
			System.out.println("dtoRef2:" + dtoRef2);
			EducationDTO dtoRef3 = service4.find(dtos3);
			System.out.println("dtoRef3:" + dtoRef3);
			EducationDTO dtoRef4 = service5.find(dtos4);
			System.out.println("dtoRef4:" + dtoRef4);
			EducationDTO dtoRef5 = service6.find(dtos5);
			System.out.println("dtoRef5:" + dtoRef5);
			EducationDTO dtoRef6 = service7.find(dtos6);
			System.out.println("dtoRef6:" + dtoRef6);
			EducationDTO dtoRef7 = service8.find(dtos7);
			System.out.println("dtoRef7" + dtoRef7);
			EducationDTO dtoRef8 = service9.find(dtos8);
			System.out.println("dtoRef8:" + dtoRef8);
			EducationDTO dtoRef9 = service10.find(dtos9);
			System.out.println("dtoRef9:" + dtoRef9);
			EducationDTO dtoRef10 = service11.find(dtos10);
			System.out.println("dtoRef10:" + dtoRef10);
			EducationDTO dtoRef11 = service12.find(dtos11);
			System.out.println("dtoRef11:" + dtoRef11);
			EducationDTO dtoRef12 = service13.find(dtos12);
			System.out.println("dtoRef12:" + dtoRef12);
			EducationDTO dtoRef13 = service14.find(dtos13);
			System.out.println("dtoRef13:" + dtoRef13);
			EducationDTO dtoRef14 = service15.find(dtos14);
			System.out.println("dtoRef14:" + dtoRef14);
			EducationDTO dtoRef15 = service16.find(dtos15);
			System.out.println("dtoRef15:" + dtoRef15);
			EducationDTO dtoRef16 = service17.find(dtos16);
			System.out.println("dtoRef16:" + dtoRef16);
			EducationDTO dtoRef17 = service18.find(dtos17);
			System.out.println("dtoRef17:" + dtoRef17);
			EducationDTO dtoRef18 = service19.find(dtos18);
			System.out.println("dtoRef18:" + dtoRef18);

		} catch (EducationDataInvalidException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		try {
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity = service
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity1 = service1
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity1);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity2 = service2
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity2);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity3 = service3
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity3);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity4 = service4
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity4);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity5 = service5
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity5);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity6 = service6
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity6);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity7 = service7
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity7);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity8 = service8
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity8);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity9 = service9
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity9);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity10 = service10
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity10);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity11 = service11
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity11);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity12 = service12
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity12);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity13 = service13
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity13);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity14 = service14
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity14);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity15 = service15
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity15);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity16 = service16
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity16);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity17 = service17
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity17);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity18 = service18
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity18);
			boolean findBacklogByCandidateNameAndDegreeNameAndUnviersity19 = service19
					.findBacklogByCandidateNameAndDegreeNameAndUnviersity("Shubhangi", "B.E", "VTU");
			System.out.println("findBacklogByCandidateNameAndDegreeNameAndUnviersity:"
					+ findBacklogByCandidateNameAndDegreeNameAndUnviersity19);

		} catch (EducationDataInvalidException e) {

			e.printStackTrace();
		}
		System.out.println(" ");
		try {
			EducationDTO findByCandidateName = service.findByCandidateName("Shubhangi");
			System.out.println("findByCandidateName:" + findByCandidateName);
			EducationDTO findByCandidateName1 = service1.findByCandidateName("shaanu");
			System.out.println("findByCandidateName1:" + findByCandidateName1);
			EducationDTO findByCandidateName2 = service2.findByCandidateName("Anita");
			System.out.println("findByCandidateName2:" + findByCandidateName2);
			EducationDTO findByCandidateName3 = service3.findByCandidateName("Bhairavi");
			System.out.println("findByCandidateName3:" + findByCandidateName3);
			EducationDTO findByCandidateName4 = service4.findByCandidateName("Sneha");
			System.out.println("findByCandidateName4:" + findByCandidateName4);
			EducationDTO findByCandidateName5 = service5.findByCandidateName("suraj");
			System.out.println("findByCandidateName5:" + findByCandidateName5);
			EducationDTO findByCandidateName6 = service6.findByCandidateName("shiv");
			System.out.println("findByCandidateName6:" + findByCandidateName6);
			EducationDTO findByCandidateName7 = service7.findByCandidateName("payal");
			System.out.println("findByCandidateName7:" + findByCandidateName7);
			EducationDTO findByCandidateName8 = service8.findByCandidateName("pondi");
			System.out.println("findByCandidateName7:" + findByCandidateName8);
			EducationDTO findByCandidateName9 = service9.findByCandidateName("yogita");
			System.out.println("findByCandidateName7:" + findByCandidateName9);
			EducationDTO findByCandidateName10 = service10.findByCandidateName("Sahana");
			System.out.println("findByCandidateName7:" + findByCandidateName10);
			EducationDTO findByCandidateName11 = service11.findByCandidateName("Mansik");
			System.out.println("findByCandidateName7:" + findByCandidateName11);
			EducationDTO findByCandidateName12 = service12.findByCandidateName("Sneha");
			System.out.println("findByCandidateName7:" + findByCandidateName12);
			EducationDTO findByCandidateName13 = service13.findByCandidateName("Vishala");
			System.out.println("findByCandidateName13:" + findByCandidateName13);
			EducationDTO findByCandidateName14 = service14.findByCandidateName("Muskan");
			System.out.println("findByCandidateName14:" + findByCandidateName14);
			EducationDTO findByCandidateName15 = service15.findByCandidateName("Annu");
			System.out.println("findByCandidateName15:" + findByCandidateName15);
			EducationDTO findByCandidateName16 = service16.findByCandidateName("Swati");
			System.out.println("findByCandidateName16:" + findByCandidateName16);
			EducationDTO findByCandidateName17 = service17.findByCandidateName("Shruti");
			System.out.println("findByCandidateName17:" + findByCandidateName17);
			EducationDTO findByCandidateName18 = service18.findByCandidateName("Hassu");
			System.out.println("findByCandidateName18:" + findByCandidateName18);
			EducationDTO findByCandidateName19 = service19.findByCandidateName("Akashata");
			System.out.println("findByCandidateName7:" + findByCandidateName19);

		} catch (EducationDataInvalidException e) {

			e.printStackTrace();
		}
		System.out.println(" ");
		try {
			EducationDTO findByCandidateNameAndStartDateAndEndDate = service.findByCandidateNameAndStartDateAndEndDate(
					"Shubhangi", LocalDate.of(2023, 8, 22), LocalDate.of(2023, 11, 15));
			System.out
					.println("findByCandidateNameAndStartDateAndEndDate:" + findByCandidateNameAndStartDateAndEndDate);
			EducationDTO findByCandidateNameAndStartDateAndEndDate1 = service1
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate1:" + findByCandidateNameAndStartDateAndEndDate1);
			EducationDTO findByCandidateNameAndStartDateAndEndDate2 = service2
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate2:" + findByCandidateNameAndStartDateAndEndDate2);
			EducationDTO findByCandidateNameAndStartDateAndEndDate3 = service3
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate3:" + findByCandidateNameAndStartDateAndEndDate3);
			EducationDTO findByCandidateNameAndStartDateAndEndDate4 = service4
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate4:" + findByCandidateNameAndStartDateAndEndDate4);
			EducationDTO findByCandidateNameAndStartDateAndEndDate5 = service.findByCandidateNameAndStartDateAndEndDate(
					"Shubhangi", LocalDate.of(2023, 8, 22), LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate5:" + findByCandidateNameAndStartDateAndEndDate5);
			EducationDTO findByCandidateNameAndStartDateAndEndDate6 = service6
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate6:" + findByCandidateNameAndStartDateAndEndDate6);
			EducationDTO findByCandidateNameAndStartDateAndEndDate7 = service7
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate7:" + findByCandidateNameAndStartDateAndEndDate7);
			EducationDTO findByCandidateNameAndStartDateAndEndDate8 = service8
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate8:" + findByCandidateNameAndStartDateAndEndDate8);
			EducationDTO findByCandidateNameAndStartDateAndEndDate9 = service9
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate9:" + findByCandidateNameAndStartDateAndEndDate9);
			EducationDTO findByCandidateNameAndStartDateAndEndDate10 = service10
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate10:" + findByCandidateNameAndStartDateAndEndDate10);
			EducationDTO findByCandidateNameAndStartDateAndEndDate11 = service11
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate11:" + findByCandidateNameAndStartDateAndEndDate11);
			EducationDTO findByCandidateNameAndStartDateAndEndDate12 = service12
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate12:" + findByCandidateNameAndStartDateAndEndDate12);
			EducationDTO findByCandidateNameAndStartDateAndEndDate13 = service13
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate13:" + findByCandidateNameAndStartDateAndEndDate13);
			EducationDTO findByCandidateNameAndStartDateAndEndDate14 = service14
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate14:" + findByCandidateNameAndStartDateAndEndDate14);
			EducationDTO findByCandidateNameAndStartDateAndEndDate15 = service
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate15:" + findByCandidateNameAndStartDateAndEndDate15);
			EducationDTO findByCandidateNameAndStartDateAndEndDate16 = service16
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate16:" + findByCandidateNameAndStartDateAndEndDate16);
			EducationDTO findByCandidateNameAndStartDateAndEndDate17 = service17
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate17:" + findByCandidateNameAndStartDateAndEndDate17);
			EducationDTO findByCandidateNameAndStartDateAndEndDate18 = service
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate18:" + findByCandidateNameAndStartDateAndEndDate18);
			EducationDTO findByCandidateNameAndStartDateAndEndDate19 = service19
					.findByCandidateNameAndStartDateAndEndDate("Shubhangi", LocalDate.of(2023, 8, 22),
							LocalDate.of(2023, 11, 15));
			System.out.println(
					"findByCandidateNameAndStartDateAndEndDate19:" + findByCandidateNameAndStartDateAndEndDate19);
		} catch (EducationDataInvalidException e) {

			e.printStackTrace();
		}
		System.out.println(" ");
		try {
			EducationDTO findByCandidateNameAndUnviersity = service.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity:" + findByCandidateNameAndUnviersity);
			EducationDTO findByCandidateNameAndUnviersity1 = service1.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity1:" + findByCandidateNameAndUnviersity1);
			EducationDTO findByCandidateNameAndUnviersity2 = service2.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity2:" + findByCandidateNameAndUnviersity2);
			EducationDTO findByCandidateNameAndUnviersity3 = service3.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity3:" + findByCandidateNameAndUnviersity3);
			EducationDTO findByCandidateNameAndUnviersity4 = service4.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity4:" + findByCandidateNameAndUnviersity4);
			EducationDTO findByCandidateNameAndUnviersity5 = service5.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity5:" + findByCandidateNameAndUnviersity5);
			EducationDTO findByCandidateNameAndUnviersity6 = service6.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity6:" + findByCandidateNameAndUnviersity6);
			EducationDTO findByCandidateNameAndUnviersity7 = service7.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity7:" + findByCandidateNameAndUnviersity7);
			EducationDTO findByCandidateNameAndUnviersity8 = service8.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity8:" + findByCandidateNameAndUnviersity8);
			EducationDTO findByCandidateNameAndUnviersity9 = service9.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity9:" + findByCandidateNameAndUnviersity9);
			EducationDTO findByCandidateNameAndUnviersity10 = service10.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity10:" + findByCandidateNameAndUnviersity10);
			EducationDTO findByCandidateNameAndUnviersity11 = service11.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity11:" + findByCandidateNameAndUnviersity11);
			EducationDTO findByCandidateNameAndUnviersity12 = service12.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity12:" + findByCandidateNameAndUnviersity12);
			EducationDTO findByCandidateNameAndUnviersity13 = service13.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity13:" + findByCandidateNameAndUnviersity13);
			EducationDTO findByCandidateNameAndUnviersity14 = service14.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity14:" + findByCandidateNameAndUnviersity14);
			EducationDTO findByCandidateNameAndUnviersity15 = service15.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity15:" + findByCandidateNameAndUnviersity15);
			EducationDTO findByCandidateNameAndUnviersity16 = service16.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity16:" + findByCandidateNameAndUnviersity16);
			EducationDTO findByCandidateNameAndUnviersity17 = service17.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity17:" + findByCandidateNameAndUnviersity17);
			EducationDTO findByCandidateNameAndUnviersity18 = service18.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity18:" + findByCandidateNameAndUnviersity18);
			EducationDTO findByCandidateNameAndUnviersity19 = service19.findByCandidateNameAndUnviersity("Shubhangi",
					"VTU");
			System.out.println("findByCandidateNameAndUnviersity19:" + findByCandidateNameAndUnviersity19);

		} catch (EducationDataInvalidException e) {

			e.printStackTrace();
		}
		System.out.println(" ");
		try {
			int findIdByCandidateNameAndDegreeNameAndUniversity = service
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity);
			int findIdByCandidateNameAndDegreeNameAndUniversity1 = service1
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity1:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity1);
			int findIdByCandidateNameAndDegreeNameAndUniversity2 = service2
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity2:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity2);
			int findIdByCandidateNameAndDegreeNameAndUniversity3 = service3
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity3:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity3);
			int findIdByCandidateNameAndDegreeNameAndUniversity4 = service4
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity4:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity4);
			int findIdByCandidateNameAndDegreeNameAndUniversity5 = service5
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity5:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity5);
			int findIdByCandidateNameAndDegreeNameAndUniversity6 = service6
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity6:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity6);
			int findIdByCandidateNameAndDegreeNameAndUniversity7 = service7
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity7:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity7);
			int findIdByCandidateNameAndDegreeNameAndUniversity8 = service8
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity8:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity8);
			int findIdByCandidateNameAndDegreeNameAndUniversity9 = service9
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity9:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity9);
			int findIdByCandidateNameAndDegreeNameAndUniversity10 = service10
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity10:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity10);
			int findIdByCandidateNameAndDegreeNameAndUniversity11 = service11
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity11:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity11);
			int findIdByCandidateNameAndDegreeNameAndUniversity12 = service12
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity12:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity12);
			int findIdByCandidateNameAndDegreeNameAndUniversity13 = service13
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity13:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity13);
			int findIdByCandidateNameAndDegreeNameAndUniversity14 = service14
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity14:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity14);
			int findIdByCandidateNameAndDegreeNameAndUniversity15 = service15
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity15:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity15);
			int findIdByCandidateNameAndDegreeNameAndUniversity16 = service16
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity16:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity16);
			int findIdByCandidateNameAndDegreeNameAndUniversity17 = service17
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity17:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity17);
			int findIdByCandidateNameAndDegreeNameAndUniversity18 = service18
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity18:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity18);
			int findIdByCandidateNameAndDegreeNameAndUniversity19 = service19
					.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findIdByCandidateNameAndDegreeNameAndUniversity19:"
					+ findIdByCandidateNameAndDegreeNameAndUniversity19);
		} catch (EducationDataInvalidException e) {

			e.printStackTrace();
		}
		System.out.println(" ");
		try {
			double findPercentageByCandidateName = service.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName:" + findPercentageByCandidateName);
			double findPercentageByCandidateName1 = service1.findPercentageByCandidateName("Shannu");
			System.out.println("findPercentageByCandidateName1:" + findPercentageByCandidateName1);
			double findPercentageByCandidateName2 = service.findPercentageByCandidateName("Akashata");
			System.out.println("findPercentageByCandidateName2:" + findPercentageByCandidateName2);
			double findPercentageByCandidateName3 = service3.findPercentageByCandidateName("Hassu");
			System.out.println("findPercentageByCandidateName3:" + findPercentageByCandidateName3);
			double findPercentageByCandidateName4 = service4.findPercentageByCandidateName("Anita");
			System.out.println("findPercentageByCandidateName4:" + findPercentageByCandidateName4);
			double findPercentageByCandidateName5 = service5.findPercentageByCandidateName("Mansik");
			System.out.println("findPercentageByCandidateName5:" + findPercentageByCandidateName5);
			double findPercentageByCandidateName6 = service6.findPercentageByCandidateName("shruti");
			System.out.println("findPercentageByCandidateName6:" + findPercentageByCandidateName6);
			double findPercentageByCandidateName7 = service7.findPercentageByCandidateName("swati");
			System.out.println("findPercentageByCandidateName7:" + findPercentageByCandidateName7);
			double findPercentageByCandidateName8 = service8.findPercentageByCandidateName("Pondi");
			System.out.println("findPercentageByCandidateName:" + findPercentageByCandidateName8);
			double findPercentageByCandidateName9 = service9.findPercentageByCandidateName("sahana");
			System.out.println("findPercentageByCandidateName9:" + findPercentageByCandidateName9);
			double findPercentageByCandidateName10 = service10.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName10:" + findPercentageByCandidateName10);
			double findPercentageByCandidateName11 = service11.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName11:" + findPercentageByCandidateName11);
			double findPercentageByCandidateName12 = service12.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName12:" + findPercentageByCandidateName12);
			double findPercentageByCandidateName13 = service13.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName13:" + findPercentageByCandidateName13);
			double findPercentageByCandidateName14 = service14.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName14:" + findPercentageByCandidateName14);
			double findPercentageByCandidateName15 = service15.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName15:" + findPercentageByCandidateName15);
			double findPercentageByCandidateName16 = service16.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName16:" + findPercentageByCandidateName16);
			double findPercentageByCandidateName17 = service17.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName17:" + findPercentageByCandidateName17);
			double findPercentageByCandidateName18 = service18.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName18:" + findPercentageByCandidateName18);
			double findPercentageByCandidateName19 = service19.findPercentageByCandidateName("Shubhangi");
			System.out.println("findPercentageByCandidateName19:" + findPercentageByCandidateName19);
		} catch (EducationDataInvalidException e1) {
			e1.printStackTrace();
		}
		System.out.println(" ");
		try {
			String findStreamByCandidateNameAndDegreeNameAndUniversity = service
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity);
			String findStreamByCandidateNameAndDegreeNameAndUniversity1 = service1
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shaanu", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity1:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity1);
			String findStreamByCandidateNameAndDegreeNameAndUniversity2 = service2
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Akshata", "B.Sc", "KSB");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity2:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity2);
			String findStreamByCandidateNameAndDegreeNameAndUniversity3 = service3
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity3:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity3);
			String findStreamByCandidateNameAndDegreeNameAndUniversity4 = service4
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity4:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity4);
			String findStreamByCandidateNameAndDegreeNameAndUniversity5 = service5
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity5:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity5);
			String findStreamByCandidateNameAndDegreeNameAndUniversity6 = service6
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity6:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity6);
			String findStreamByCandidateNameAndDegreeNameAndUniversity7 = service7
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity7:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity7);
			String findStreamByCandidateNameAndDegreeNameAndUniversity8 = service8
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity8:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity8);
			String findStreamByCandidateNameAndDegreeNameAndUniversity9 = service9
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity9:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity9);
			String findStreamByCandidateNameAndDegreeNameAndUniversity10 = service10
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity10:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity10);
			String findStreamByCandidateNameAndDegreeNameAndUniversity11 = service11
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity11:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity11);
			String findStreamByCandidateNameAndDegreeNameAndUniversity12 = service12
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity12:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity12);
			String findStreamByCandidateNameAndDegreeNameAndUniversity13 = service13
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity13:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity13);
			String findStreamByCandidateNameAndDegreeNameAndUniversity14 = service14
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity14:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity14);
			String findStreamByCandidateNameAndDegreeNameAndUniversity15 = service15
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity15:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity15);
			String findStreamByCandidateNameAndDegreeNameAndUniversity16 = service16
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity16:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity16);
			String findStreamByCandidateNameAndDegreeNameAndUniversity17 = service17
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity17:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity17);
			String findStreamByCandidateNameAndDegreeNameAndUniversity18 = service18
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity18:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity18);
			String findStreamByCandidateNameAndDegreeNameAndUniversity19 = service19
					.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi", "B.E", "VTU");
			System.out.println("findStreamByCandidateNameAndDegreeNameAndUniversity19:"
					+ findStreamByCandidateNameAndDegreeNameAndUniversity19);
		} catch (EducationDataInvalidException e) {

			e.printStackTrace();
		}
		System.out.println(" ");
		try {
			String findUniversityByCandidateName = service.findUniversityByCandidateName("Shubhangi");
			System.out.println("findUniversityByCandidateName:" + findUniversityByCandidateName);
			String findUniversityByCandidateName1 = service1.findUniversityByCandidateName("Shannus");
			System.out.println("findUniversityByCandidateName1:" + findUniversityByCandidateName1);
			String findUniversityByCandidateName2 = service2.findUniversityByCandidateName("Akashata");
			System.out.println("findUniversityByCandidateName2:" + findUniversityByCandidateName2);
			String findUniversityByCandidateName3 = service3.findUniversityByCandidateName("Anita");
			System.out.println("findUniversityByCandidateName:" + findUniversityByCandidateName3);
			String findUniversityByCandidateName4 = service4.findUniversityByCandidateName("Mansik");
			System.out.println("findUniversityByCandidateName4:" + findUniversityByCandidateName4);
			String findUniversityByCandidateName5 = service5.findUniversityByCandidateName("swati");
			System.out.println("findUniversityByCandidateName5:" + findUniversityByCandidateName5);
			String findUniversityByCandidateName6 = service.findUniversityByCandidateName("suraj");
			System.out.println("findUniversityByCandidateName6:" + findUniversityByCandidateName6);
			String findUniversityByCandidateName7 = service.findUniversityByCandidateName("yogita");
			System.out.println("findUniversityByCandidateName7:" + findUniversityByCandidateName7);
			String findUniversityByCandidateName8 = service8.findUniversityByCandidateName("payal");
			System.out.println("findUniversityByCandidateName8:" + findUniversityByCandidateName8);
			String findUniversityByCandidateName9 = service.findUniversityByCandidateName("Bhairavi");
			System.out.println("findUniversityByCandidateName9:" + findUniversityByCandidateName9);
			String findUniversityByCandidateName10 = service10.findUniversityByCandidateName("Akshata");
			System.out.println("findUniversityByCandidateName10:" + findUniversityByCandidateName10);
			String findUniversityByCandidateName11 = service11.findUniversityByCandidateName("Hassu");
			System.out.println("findUniversityByCandidateName11:" + findUniversityByCandidateName11);
			String findUniversityByCandidateName12 = service12.findUniversityByCandidateName("Anita");
			System.out.println("findUniversityByCandidateName12:" + findUniversityByCandidateName12);
			String findUniversityByCandidateName13 = service13.findUniversityByCandidateName("Mansik");
			System.out.println("findUniversityByCandidateName13:" + findUniversityByCandidateName13);
			String findUniversityByCandidateName14 = service14.findUniversityByCandidateName("vishala");
			System.out.println("findUniversityByCandidateName14:" + findUniversityByCandidateName14);
			String findUniversityByCandidateName15 = service15.findUniversityByCandidateName("Muskan");
			System.out.println("findUniversityByCandidateName15:" + findUniversityByCandidateName15);
			String findUniversityByCandidateName16 = service16.findUniversityByCandidateName("Annu");
			System.out.println("findUniversityByCandidateName16:" + findUniversityByCandidateName16);
			String findUniversityByCandidateName17 = service.findUniversityByCandidateName("pondi");
			System.out.println("findUniversityByCandidateName17:" + findUniversityByCandidateName17);
			String findUniversityByCandidateName18 = service.findUniversityByCandidateName("sneha");
			System.out.println("findUniversityByCandidateName18:" + findUniversityByCandidateName18);
			String findUniversityByCandidateName19 = service19.findUniversityByCandidateName("swati");
			System.out.println("findUniversityByCandidateName:" + findUniversityByCandidateName19);
		} catch (EducationDataInvalidException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(" ");
		int total = service.total();
		System.out.println("Total:" + total);
		int total1 = service.total();
		System.out.println("total1:" + total1);
		int total2 = service.total();
		System.out.println("total2:" + total2);
		int total3 = service.total();
		System.out.println("total3:" + total3);
		int total4 = service.total();
		System.out.println("total4:" + total4);
		int total5 = service.total();
		System.out.println("total5:" + total5);
		int total6 = service.total();
		System.out.println("total6:" + total6);
		int total7 = service.total();
		System.out.println("total7:" + total7);
		int total8 = service.total();
		System.out.println("total8:" + total8);
		int total9 = service.total();
		System.out.println("total9:" + total9);
		int total10 = service.total();
		System.out.println("total10:" + total10);
		int total11 = service.total();
		System.out.println("total11:" + total11);
		int total12 = service.total();
		System.out.println("total12:" + total12);
		int total13 = service.total();
		System.out.println("total13:" + total13);
		int total14 = service.total();
		System.out.println("total14:" + total14);
		int total15 = service.total();
		System.out.println("total15:" + total15);
		int total16 = service.total();
		System.out.println("total16:" + total16);
		int total17 = service.total();
		System.out.println("total17:" + total17);
		int total18 = service.total();
		System.out.println("total18:" + total18);
		int total19 = service.total();
		System.out.println("total19:" + total19);

	}

}
