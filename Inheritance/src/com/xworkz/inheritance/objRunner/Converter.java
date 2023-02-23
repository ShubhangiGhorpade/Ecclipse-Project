package com.xworkz.inheritance.objRunner;

import com.xworkz.inheritance.obj.Cricket;
import com.xworkz.inheritance.obj.ODICricket;
import com.xworkz.inheritance.obj.Sport;
import com.xworkz.inheritance.obj.T20Cricket;
import com.xworkz.inheritance.obj.TestCricket;

public class Converter {
public void display(Sport sport) {
	
	 if(sport instanceof Sport) {
		int total= sport.getTotal();
		System.out.println("Total: "+total);
		if(sport instanceof Cricket) {
			int total1=sport.getTotal();
			System.out.println("Total1 in Cricket: "+total1);
			Cricket casted=(Cricket)sport;
			String coachName=casted.getCoachName();
			System.out.println("CoachName in Cricket: "+coachName);
			String country=casted.getCountry();
			System.out.println("Country in Cricket: "+country);
			if(sport instanceof ODICricket) {
				int total2=sport.getTotal();
				System.out.println("Total1 in ODICricket: "+total2);
				ODICricket casted1=(ODICricket)sport;
				String groundName=casted1.getGroundName();
				System.out.println("Ground name in ODICricket :"+groundName);
				String coachName1=casted1.getCoachName();
				System.out.println("Coach name in ODICricket :"+coachName1);
				String country1=casted1.getCountry();
				System.out.println("Country in ODICricket :"+country1);
			if(sport instanceof TestCricket) {
				int total3=sport.getTotal();
				System.out.println("Total2 in TestCricket : "+total3);
				TestCricket casted2=(TestCricket)sport;
				String coachName2=casted2.getCoachName();
				System.out.println("Coach name in TestCricket :"+coachName2);
				String contry2=casted2.getCountry();
				System.out.println("Country in TestCricket :"+contry2);
				String captainName2=casted2.getCaptainName();
				System.out.println("Captain name in TestCricket :"+captainName2);
			if(sport instanceof T20Cricket)	{
				int total4=sport.getTotal();
				System.out.println("Total3 in T20Cricket: "+total4);
				T20Cricket casted3=(T20Cricket)sport;
				String coachName3=casted3.getCoachName();
				System.out.println("Coach name in T20Cricket :"+coachName3);
				String country3=casted3.getCountry();
				System.out.println("Country in T20Cricket :"+country3);
				String groundName3=casted3.getGroundName();
				System.out.println("Ground name in T20Cricket :"+groundName3);
				String sponsorName=casted3.getSponsorName();
				System.out.println("Sponsor name in T20Cricket :"+sponsorName);
			}
			}
			}
			
		}
	 }
	 
}

}
