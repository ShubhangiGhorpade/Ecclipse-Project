package com.file.instanceVarRunner;

import com.file.instanceVar.FrenchFry;

public class FrenchFryRunner {

	public static void main(String[] args) {
		FrenchFry ref=new FrenchFry();
        ref.display();
        System.out.println("      ");     
        FrenchFry ref1=new FrenchFry("periPeri");
        ref1.display();
        System.out.println("      ");
        FrenchFry ref2=new FrenchFry(true);
        ref2.display();
        System.out.println("      ");
        FrenchFry ref3=new FrenchFry(80);
        ref3.display();
        System.out.println("      ");
        FrenchFry ref4=new FrenchFry(false,100);
        ref4.display();
        System.out.println("      ");
        FrenchFry ref5=new FrenchFry(90,true);
        ref5.display();
        System.out.println("      ");
        FrenchFry ref6=new FrenchFry("dry",false);
        ref6.display();
        System.out.println("      ");
        FrenchFry ref7=new FrenchFry("salty","sameer");
        ref7.display();
        System.out.println("      ");
        FrenchFry ref8=new FrenchFry("salty",false,60);
        ref8.display();
        System.out.println("      ");
        FrenchFry ref9=new FrenchFry("peri peri","sneha",true,120);
        ref9.display();
	}

}
