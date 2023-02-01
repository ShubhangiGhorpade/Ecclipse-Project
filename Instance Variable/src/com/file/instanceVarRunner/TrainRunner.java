package com.file.instanceVarRunner;

import com.file.instanceVar.Train;

public class TrainRunner {

	public static void main(String[] args) {
		 Train ref=new Train();
         ref.display();
         System.out.println("      ");
         Train ref1=new Train(true);
         ref1.display();
         System.out.println("      ");
         Train ref2=new Train('B');
         ref2.display();
         System.out.println("      ");
         Train ref3=new Train(2000);
         ref3.display();
         System.out.println("      ");
         Train ref4=new Train("chennai Express");
         ref4.display();
         System.out.println("      ");
         Train ref5=new Train(true,2500);
         ref5.display();
         System.out.println("      ");
         Train ref6=new Train(2000,54692);
         ref6.display();
         System.out.println("      ");
         Train ref7=new Train("Mumbai",3000);
         ref7.display();
         
	}

}
