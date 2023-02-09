package com.xworkz.association.boot;

import com.xworkz.association.thing.Address;
import com.xworkz.association.thing.Area;
import com.xworkz.association.thing.City;
import com.xworkz.association.thing.Company;
import com.xworkz.association.thing.Country;
import com.xworkz.association.thing.Mall;
import com.xworkz.association.thing.Security;
import com.xworkz.association.thing.State;

public class MallRunner {

	public static void main(String[] args) {
		Area area = new Area();
		area.setName("Zunjoorkhup");
		area.setPopulation(250d);
		area.setStreet("WardNo-4");

		City city = new City();
		city.setName("pune");
		city.setDistrict("Maharastra");
		city.setCapital(true);
		city.setArea(area);

		State state = new State();
		state.setName("Pune");
		state.setCmName("Akinath Shinde");
		state.setLang("Marathi");
		state.setCity(city);

		Country country = new Country();
		country.setDeveloped(true);
		country.setPresident("Droupadi murmo");
		country.setState(state);

		Address address = new Address();
		address.setCountry(country);

		Company company = new Company();
		company.setName("Cyber");
		company.setCeoName("Shefali");
		company.setSince(1999);
		company.setAddress(address);

		Security security = new Security();
		security.setDeptName("Assistance");
		security.setHeadStaff("Director");
		security.setTotalStaff(50);
		security.setCompany(company);

		Mall mall = new Mall();
		mall.setName("Reliance");
		mall.setSecurity(security);
		mall.setTotalFloor(6);
		mall.setAmbience(true);
		mall.show();

	}

}
