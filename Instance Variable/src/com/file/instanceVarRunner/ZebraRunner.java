package com.file.instanceVarRunner;

import com.file.instanceVar.Zebra;

public class ZebraRunner {

	public static void main(String[] args) {
		Zebra ref=new Zebra();
		System.out.println("Before Instantiation");
		System.out.println("Color :"+ref.color);
		System.out.println("lifeSpan :"+ref.lifeSpan);
		System.out.println("Wild :"+ref.wild);
		
		ref.color="Black & White";
		ref.lifeSpan=25;
		ref.wild=true;
		
		System.out.println("After Instantiation");
		System.out.println("Color :"+ref.color);
		System.out.println("lifeSpan :"+ref.lifeSpan);
		System.out.println("Wild :"+ref.wild);
	}

}
