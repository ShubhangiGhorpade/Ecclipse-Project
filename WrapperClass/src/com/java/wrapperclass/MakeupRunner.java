package com.java.wrapperclass;

public class MakeupRunner {

	public static void main(String[] args) {
		MakeUp makeup=new MakeUp();
		makeup.productNo=2;
		makeup.code=5973;
		makeup.cost=5000;
		makeup.scannerCode=888943277L;
		makeup.rating=4.5f;
		makeup.deliveryCost=444.5d;
		makeup.productcategory='A';
		makeup.good=true;

		System.out.println("   Auto Boxing     ");
		Byte b=makeup.productNo;
		System.out.println("Byte conversion :"+b);
		
		Short s=makeup.code;
		System.out.println("Short conversion  :"+s);
		
		Integer i =makeup.cost;
		System.out.println("Integer conversion :"+i);
		
		Long l= makeup.scannerCode;
		System.out.println("Long conversion :"+l);
		
		Float f=makeup.rating;
		System.out.println("Float conversion :"+f);
		
		Double d =makeup.deliveryCost;
		System.out.println("Double conversion :"+d);
		
		Character c=makeup.productcategory;
		System.out.println("Character conversion :"+c);
		
		Boolean b1 =makeup.good;
		System.out.println("Boolean :"+b1);
		
		System.out.println("   Autounboxing     ");
		
		byte by=new Byte(makeup.productNo);
		System.out.println("Byte conversion :"+by);
		
		short s1=new Short(makeup.code);
		System.out.println("Short conversion  :"+s1);
		
		int i1 =new Integer(makeup.cost);
		System.out.println("Integer conversion :"+i1);
		
		long l1= new Long(makeup.scannerCode);
		System.out.println("Long conversion :"+l);
		
		float f1=new Float(makeup.rating);
		System.out.println("Float conversion :"+f1);
		
		double d1 =new Double(makeup.deliveryCost);
		System.out.println("Double conversion :"+d1);
		
		char c1=new Character(makeup.productcategory);
		System.out.println("Character conversion :"+c1);
		
		boolean b2 =new Boolean(makeup.good);
		System.out.println("Boolean :"+b2);
	}

}
