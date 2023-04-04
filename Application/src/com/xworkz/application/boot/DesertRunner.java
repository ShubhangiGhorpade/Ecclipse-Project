package com.xworkz.application.boot;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertDataInvalidException;
import com.xworkz.application.repository.DesertRepository;
import com.xworkz.application.repository.DesertRepositoryImp;
import com.xworkz.application.service.DesertService;
import com.xworkz.application.service.DesertServiceImp;

public class DesertRunner {

	public static void main(String[] args) {
		DesertDTO dto = new DesertDTO(21, "Sahara", "Africa", 5366820d, 100, 104);
		DesertDTO dto1 = new DesertDTO(21, "Atacama", "Peru", 63645820d, 98, 100);
		DesertDTO dto2 = new DesertDTO(21, "Gobi", "China", 4378522d, 98, 100);
		DesertDTO dto3 = new DesertDTO(21, "Kalahari", "Africa", 65486623d, 90, 95);
		DesertDTO dto4 = new DesertDTO(21, "Mojave", "USAA", 5988299d, 110, 120);
		DesertDTO dto5 = new DesertDTO(21, "Namib", "Namibia", 67554434d, 80, 95);
		DesertDTO dto6 = new DesertDTO(21, "Arabian", "Asia", 87677774d, 95, 100);
		DesertDTO dto7 = new DesertDTO(21, "Sonoran", "USAA", 6366820d, 100, 104);
		DesertDTO dto8 = new DesertDTO(21, "Thar", "India", 578620d, 99, 105);
		DesertDTO dto9 = new DesertDTO(21, "Patagonian", "Chile", 6886903d, 89, 100);
		DesertDTO dto10 = new DesertDTO(21, "Taklamakan", "China", 5366820d, 100, 104);
		DesertDTO dto11 = new DesertDTO(21, "Chihuahuan", "Mexico", 5366820d, 100, 104);
		DesertDTO dto12 = new DesertDTO(21, "Syrian", "Egypt", 5366820d, 100, 104);
		DesertDTO dto13 = new DesertDTO(21, "Great Victoria", "Australia", 5366820d, 100, 104);
		DesertDTO dto14 = new DesertDTO(21, "Karakum", "Turkmenistan", 5366820d, 100, 104);
		DesertDTO dto15 = new DesertDTO(21, "EmptyQuarter", "Egypt", 5366820d, 100, 104);
		DesertDTO dto16 = new DesertDTO(21, "Kyzylkum", "Asia", 5366820d, 100, 104);
		DesertDTO dto17 = new DesertDTO(21, "Great Basin", "USAA", 5366820d, 100, 104);
		DesertDTO dto18 = new DesertDTO(21, "Dasht-e Lut", "Afghanistan", 5366820d, 100, 104);
		DesertDTO dto19 = new DesertDTO(21, "Great Sandy", "Australia", 5366820d, 100, 104);
		DesertDTO dto20 = new DesertDTO(21, "Polar", "Egypt", 5366820d, 100, 104);
		DesertDTO dto21 = new DesertDTO(21, "Australia Desert", "Australia", 5366820d, 100, 104);
		DesertDTO dto22 = new DesertDTO(21, "Simpson", "Australia", 5366820d, 100, 104);

		DesertRepository desertRepository = new DesertRepositoryImp();

		DesertService service = new DesertServiceImp(desertRepository);

		try {
			boolean save = service.validateAndThenSave(dto);
			System.out.println("Save:" + save);
			boolean save1 = service.validateAndThenSave(dto1);
			System.out.println("Save1:" + save1);
			boolean save2 = service.validateAndThenSave(dto2);
			System.out.println("Save2:" + save2);
			boolean save3 = service.validateAndThenSave(dto3);
			System.out.println("Save3:" + save3);
			boolean save4 = service.validateAndThenSave(dto4);
			System.out.println("Save4:" + save4);
			boolean save5 = service.validateAndThenSave(dto5);
			System.out.println("Save5:" + save5);
			boolean save6 = service.validateAndThenSave(dto6);
			System.out.println("Save6:" + save6);
			boolean save7 = service.validateAndThenSave(dto7);
			System.out.println("Save7:" + save7);
			boolean save8 = service.validateAndThenSave(dto8);
			System.out.println("Save8:" + save8);
			boolean save9 = service.validateAndThenSave(dto9);
			System.out.println("Save9:" + save9);
			boolean save10 = service.validateAndThenSave(dto10);
			System.out.println("Save10:" + save10);
			boolean save11 = service.validateAndThenSave(dto11);
			System.out.println("Save11:" + save11);
			boolean save12 = service.validateAndThenSave(dto12);
			System.out.println("Save12:" + save12);
			boolean save13 = service.validateAndThenSave(dto13);
			System.out.println("Save13:" + save13);
			boolean save14 = service.validateAndThenSave(dto14);
			System.out.println("Save14:" + save14);
			boolean save15 = service.validateAndThenSave(dto15);
			System.out.println("Save15:" + save15);
			boolean save16 = service.validateAndThenSave(dto16);
			System.out.println("Save16:" + save16);
			boolean save17 = service.validateAndThenSave(dto17);
			System.out.println("Save17:" + save17);
			boolean save18 = service.validateAndThenSave(dto18);
			System.out.println("Save18:" + save18);
			boolean save19 = service.validateAndThenSave(dto19);
			System.out.println("Save19:" + save19);
			boolean save20 = service.validateAndThenSave(dto20);
			System.out.println("Save20:" + save20);
			boolean save21 = service.validateAndThenSave(dto21);
			System.out.println("Save21:" + save21);
			boolean save22 = service.validateAndThenSave(dto22);
			System.out.println("Save22:" + save22);

		} catch (DesertDataInvalidException e) {
			System.err.println("DesertDataInvalidException:" + e.getMessage());
		}
		try {
			DesertDTO dtos = service.find(dto);
			System.out.println("DTO:" + dtos);
			DesertDTO dtos1 = service.find(dto1);
			System.out.println("DTO1:" + dtos1);
			DesertDTO dtos2 = service.find(dto2);
			System.out.println("DTO2:" + dtos2);
			DesertDTO dtos3 = service.find(dto3);
			System.out.println("DTO3:" + dtos3);
			DesertDTO dtos4 = service.find(dto4);
			System.out.println("DTO4:" + dtos4);
			DesertDTO dtos5 = service.find(dto5);
			System.out.println("DTO5:" + dtos5);
			DesertDTO dtos6 = service.find(dto6);
			System.out.println("DTO6:" + dtos6);
			DesertDTO dtos7 = service.find(dto7);
			System.out.println("DTO7:" + dtos7);
			DesertDTO dtos8 = service.find(dto8);
			System.out.println("DTO8:" + dtos8);
			DesertDTO dtos9 = service.find(dto9);
			System.out.println("DTO9:" + dtos9);
			DesertDTO dtos10 = service.find(dto10);
			System.out.println("DTO10:" + dtos10);
			DesertDTO dtos11 = service.find(dto11);
			System.out.println("DTO11:" + dtos11);
			DesertDTO dtos12 = service.find(dto12);
			System.out.println("DTO12:" + dtos12);
			DesertDTO dtos13 = service.find(dto13);
			System.out.println("DTO13:" + dtos13);
			DesertDTO dtos14 = service.find(dto14);
			System.out.println("DTO14:" + dtos14);
			DesertDTO dtos15 = service.find(dto15);
			System.out.println("DTO15:" + dtos15);
			DesertDTO dtos16 = service.find(dto16);
			System.out.println("DTO16:" + dtos16);
			DesertDTO dtos17 = service.find(dto17);
			System.out.println("DTO17:" + dtos17);
			DesertDTO dtos18 = service.find(dto18);
			System.out.println("DTO18:" + dtos18);
			DesertDTO dtos19 = service.find(dto19);
			System.out.println("DTO19:" + dtos19);
			DesertDTO dtos20 = service.find(dto20);
			System.out.println("DTO20:" + dtos20);
			DesertDTO dtos21 = service.find(dto21);
			System.out.println("DTO21:" + dtos21);
			DesertDTO dtos22 = service.find(dto22);
			System.out.println("DTO22:" + dtos22);
		} catch (DesertDataInvalidException e) {
			System.err.println("DesertDataInvalidException:" + e.getMessage());
		}
		try {
			double area = service.findAreaByName("Sahara");
			System.out.println("Area:" + area);
			double area1 = service.findAreaByName("Atacama");
			System.out.println("Area1:" + area1);
			double area2 = service.findAreaByName("Gobi");
			System.out.println("Area2:" + area2);
			double area3 = service.findAreaByName("Kalahari");
			System.out.println("Area3:" + area3);
			double area4 = service.findAreaByName("Sahara");
			System.out.println("Area4:" + area4);
			double area5 = service.findAreaByName("Sahara");
			System.out.println("Area5:" + area5);
			double area6 = service.findAreaByName("Sahara");
			System.out.println("Area6:" + area6);
			double area7 = service.findAreaByName("Sahara");
			System.out.println("Area7:" + area7);
			double area8 = service.findAreaByName("Sahara");
			System.out.println("Area8:" + area8);
			double area9 = service.findAreaByName("Sahara");
			System.out.println("Area9:" + area9);
			double area10 = service.findAreaByName("Sahara");
			System.out.println("Area10:" + area10);
			double area11 = service.findAreaByName("Sahara");
			System.out.println("Area11:" + area11);
			double area12 = service.findAreaByName("Sahara");
			System.out.println("Area12:" + area12);
			double area13 = service.findAreaByName("Sahara");
			System.out.println("Area13:" + area13);
			double area14 = service.findAreaByName("Sahara");
			System.out.println("Area14:" + area14);
			double area15 = service.findAreaByName("Sahara");
			System.out.println("Area15:" + area15);
			double area16 = service.findAreaByName("Sahara");
			System.out.println("Area16:" + area16);
			double area17 = service.findAreaByName("Sahara");
			System.out.println("Area17:" + area17);
			double area18 = service.findAreaByName("Sahara");
			System.out.println("Area18:" + area18);
			double area19 = service.findAreaByName("Sahara");
			System.out.println("Area19:" + area19);
			double area20 = service.findAreaByName("Sahara");
			System.out.println("Area20:" + area20);
			double area21 = service.findAreaByName("Sahara");
			System.out.println("Area21:" + area21);
			double area22 = service.findAreaByName("Sahara");
			System.out.println("Area22:" + area22);
		} catch (DesertDataInvalidException e) {
			System.err.println("DesertDataInvalidException:" + e.getMessage());
		}
		try {
			DesertDTO name = service.findByName("Sahara");
			System.out.println("Name:" + name);
			DesertDTO name1 = service.findByName("Gobi");
			System.out.println("Name1:" + name1);
			DesertDTO name2 = service.findByName("Atacama");
			System.out.println("Name2:" + name2);
			DesertDTO name3 = service.findByName("Kalahari");
			System.out.println("Name3:" + name3);
			DesertDTO name4 = service.findByName("Sahara");
			System.out.println("Name4:" + name4);
			DesertDTO name5 = service.findByName("Sahara");
			System.out.println("Name5:" + name5);
			DesertDTO name6 = service.findByName("Sahara");
			System.out.println("Name6:" + name6);
			DesertDTO name7 = service.findByName("Sahara");
			System.out.println("Name7:" + name7);
			DesertDTO name8 = service.findByName("Sahara");
			System.out.println("Name8:" + name8);
			DesertDTO name9 = service.findByName("Sahara");
			System.out.println("Name9:" + name9);
			DesertDTO name10 = service.findByName("Sahara");
			System.out.println("Name10:" + name10);
			DesertDTO name11 = service.findByName("Sahara");
			System.out.println("Name11:" + name11);
			DesertDTO name12 = service.findByName("Sahara");
			System.out.println("Name12:" + name12);
			DesertDTO name13 = service.findByName("Sahara");
			System.out.println("Name13:" + name13);
			DesertDTO name14 = service.findByName("Sahara");
			System.out.println("Name14:" + name14);
			DesertDTO name15 = service.findByName("Sahara");
			System.out.println("Name15:" + name15);
			DesertDTO name16 = service.findByName("Sahara");
			System.out.println("Name16:" + name16);
			DesertDTO name17 = service.findByName("Sahara");
			System.out.println("Name17:" + name17);
			DesertDTO name18 = service.findByName("Sahara");
			System.out.println("Name18:" + name18);
			DesertDTO name19 = service.findByName("Sahara");
			System.out.println("Name19:" + name19);
			DesertDTO name20 = service.findByName("Sahara");
			System.out.println("Name20:" + name20);
			DesertDTO name21 = service.findByName("Sahara");
			System.out.println("Name21:" + name21);
			DesertDTO name22 = service.findByName("Sahara");
			System.out.println("Name22:" + name22);
		} catch (DesertDataInvalidException e) {
			System.err.println("DesertDataInvalidException:" + e.getMessage());
		}
		try {
			DesertDTO detail = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail:" + detail);
			DesertDTO detail1 = service.findByNameAndCountryAndArea("Arabian", "Asia", 87677774d);
			System.out.println("Detail1:" + detail1);
			DesertDTO detail2 = service.findByNameAndCountryAndArea("Atacama", "Peru", 63645820d);
			System.out.println("Detail2:" + detail2);
			DesertDTO detail3 = service.findByNameAndCountryAndArea("Gobi", "China", 4378522d);
			System.out.println("Detail3:" + detail3);
			DesertDTO detail4 = service.findByNameAndCountryAndArea("Kalahari", "Africa", 65486623d);
			System.out.println("Detail4:" + detail4);
			DesertDTO detail5 = service.findByNameAndCountryAndArea("Mojave", "USAA", 5988299d);
			System.out.println("Detail5:" + detail5);
			DesertDTO detail6 = service.findByNameAndCountryAndArea("Namib", "Namibia", 67554434d);
			System.out.println("Detail6:" + detail6);
			DesertDTO detail7 = service.findByNameAndCountryAndArea("Arabian", "Asia", 87677774d);
			System.out.println("Detail7:" + detail7);
			DesertDTO detail8 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail8:" + detail8);
			DesertDTO detail9 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail9:" + detail9);
			DesertDTO detail10 = service.findByNameAndCountryAndArea("Sonoran", "USAA", 6366820d);
			System.out.println("Detail10:" + detail10);
			DesertDTO detail11 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail11:" + detail11);
			DesertDTO detail12 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail12:" + detail12);
			DesertDTO detail13 = service.findByNameAndCountryAndArea("Gobi", "China", 4378522d);
			System.out.println("Detail13:" + detail13);
			DesertDTO detail14 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail14:" + detail14);
			DesertDTO detail15 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail15:" + detail15);
			DesertDTO detail16 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail16:" + detail16);
			DesertDTO detail17 = service.findByNameAndCountryAndArea("Syrian", "Egypt", 5366820d);
			System.out.println("Detail17:" + detail17);
			DesertDTO detail18 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail18:" + detail18);
			DesertDTO detail19 = service.findByNameAndCountryAndArea("Syrian", "Egypt", 5366820d);
			System.out.println("Detail19:" + detail19);
			DesertDTO detail20 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail20:" + detail20);
			DesertDTO detail21 = service.findByNameAndCountryAndArea("Gobi", "China", 4378522d);
			System.out.println("Detail21:" + detail21);
			DesertDTO detail22 = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail22:" + detail22);

		} catch (DesertDataInvalidException e) {
			System.err.println("DesertDataInvalidException:" + e.getMessage());
		}

		int total = service.total();
		System.out.println(total);

	}

}
