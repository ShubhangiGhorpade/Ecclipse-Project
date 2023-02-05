package com.file.instanceVarRunner;

import com.file.instanceVar.Biryani;

public class BiryaniRunner {

	public static void main(String[] args) {
		Biryani ref = new Biryani();
		ref.display();
		System.out.println("      ");
		Biryani ref1 = new Biryani(true);
		ref1.display();
		System.out.println("      ");
		Biryani ref2 = new Biryani(180);
		ref2.display();
		System.out.println("      ");
		Biryani ref3 = new Biryani("chicken");
		ref3.display();
		System.out.println("      ");
		Biryani ref4 = new Biryani(true, true);
		ref4.display();
		System.out.println("      ");
		Biryani ref5 = new Biryani(true, 180);
		ref5.display();
		System.out.println("      ");
		Biryani ref6 = new Biryani(200, false);
		ref6.display();
		System.out.println("      ");
		Biryani ref7 = new Biryani(150, 2);
		ref7.display();
		System.out.println("      ");
		Biryani ref8 = new Biryani(150, "Dum Birayani");
		ref8.display();
		System.out.println("      ");
		Biryani ref9 = new Biryani("sameer", false);
		ref9.display();
		System.out.println("      ");
		Biryani ref10 = new Biryani(true, false, "veg pulav");
		ref10.display();
		System.out.println("      ");
		Biryani ref11 = new Biryani(false, 180, "pulav");
		ref11.display();
		System.out.println("      ");
		Biryani ref12 = new Biryani(true, 180, "sneha");
		ref12.display();
		System.out.println("      ");
		Biryani ref13 = new Biryani(180, 2, "Chicken Biryani");
		ref13.display();
		System.out.println("      ");
		Biryani ref14 = new Biryani("pulav", true, false);
		ref14.display();
	}

}
