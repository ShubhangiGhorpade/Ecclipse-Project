package com.file.instanceVarRunner;

import com.file.instanceVar.Image;

public class ImageRunner {

	public static void main(String[] args) {
		Image ref=new Image();
		ref.display();
		System.out.println("      ");
		Image ref1=new Image(20);
		ref1.display();
		System.out.println("      ");
		Image ref2=new Image("black and white");
		ref2.display();
		System.out.println("      ");
		Image ref3=new Image(20,"blueprint");
		ref3.display();
		System.out.println("      ");
		Image ref4=new Image("coloured",40);
		ref4.display();
		System.out.println("      ");
		Image ref5=new Image("cultural","black and white");
		ref5.display();
		System.out.println("      ");
		Image ref6=new Image(25,150,2);
		ref6.display();
		System.out.println("      ");
		Image ref7=new Image("black and white",20,1024);
		ref7.display();
		System.out.println("      ");
		Image ref8=new Image("photography",20,"coloured");
		ref8.display();
		System.out.println("      ");
		Image ref9=new Image("cultural","blue print","ram");
		ref9.display();
	}

}
