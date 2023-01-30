package com.file.instanceVarRunner;

import com.file.instanceVar.Fan;

public class FanRunner {

	public static void main(String[] args) {
		Fan ref=new Fan();
		System.out.println("Before Instantiation");
		System.out.println("Brand :"+ref.brand);
		System.out.println("Color :"+ref.color);
		System.out.println("Cost :"+ref.cost);
		
		
		ref.brand="godrej";
		ref.color="White";
		ref.cost=2550d;
		
		System.out.println("After Instantiation");
		System.out.println("Brand :"+ref.brand);
		System.out.println("Color :"+ref.color);
		System.out.println("Cost :"+ref.cost);
		
	}

}
