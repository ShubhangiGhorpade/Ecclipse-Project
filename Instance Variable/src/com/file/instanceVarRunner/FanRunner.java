package com.file.instanceVarRunner;

import com.file.instanceVar.Fan;

public class FanRunner {

	public static void main(String[] args) {
		Fan ref=new Fan();
		System.out.println("Before Instantiation");
		System.out.println("Brand :"+ref.brand);
		System.out.println("Color :"+ref.color);
		System.out.println("Cost :"+ref.cost);
		
		System.out.println("     ");
		
		ref.brand="godrej";
		ref.color="White";
		ref.cost=2550d;
		
		System.out.println("After Instantiation");
		System.out.println("Brand :"+ref.brand);
		System.out.println("Color :"+ref.color);
		System.out.println("Cost :"+ref.cost);
		
		System.out.println("     ");
		
		Fan ref1=new Fan();
		ref1.brand="Bajaj";
		ref1.color="Brown";
		ref1.cost=3500d;
		
		
		System.out.println("Brand :"+ref.brand);
		System.out.println("Color :"+ref.color);
		System.out.println("Cost :"+ref.cost);
		
	}

}
