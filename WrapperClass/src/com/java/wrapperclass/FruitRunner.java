package com.java.wrapperclass;

public class FruitRunner {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.no=77;
		f.price=50;
		
		Byte b=f.no;
		System.out.println(b);
		
		byte b1=new Byte(f.no);
		System.out.println(b1);
	}

}
