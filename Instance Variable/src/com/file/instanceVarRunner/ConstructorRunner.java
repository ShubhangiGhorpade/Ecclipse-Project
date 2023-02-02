package com.file.instanceVarRunner;

import com.file.instanceVar.Constructor;

public class ConstructorRunner {

	public static void main(String[] args) {
		Constructor ref=new Constructor();
        ref.display();
        System.out.println("       ");
        Constructor ref1=new Constructor("Shubhangi");
        ref1.display();
        System.out.println("       ");
        Constructor ref2=new Constructor("Shubhangi",22);
        ref2.display();
        System.out.println("       ");
        Constructor ref3=new Constructor("Near Balaji Temple","Software Engineer");
        ref3.display();
        System.out.println("       ");
        Constructor ref4=new Constructor("Near Balaji Temple",22,"Pune");
        ref4.display();
        System.out.println("       ");
        Constructor ref5=new Constructor("Shubhangi",22,"Near Balaji Temple","Software Engineer","Pune");
        ref5.display();
	}

}
