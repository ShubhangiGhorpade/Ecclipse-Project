package com.file.instanceVarRunner;

import com.file.instanceVar.Message;

public class MessageRunner {

	public static void main(String[] args) {
		Message ref=new Message();
		ref.display();
		System.out.println("      ");
		Message ref1=new Message(true);
		ref1.display();
		System.out.println("      ");
		Message ref2=new Message(1);
		ref2.display();
		System.out.println("      ");
		Message ref3=new Message("sahana");
		ref3.display();
		System.out.println("      ");
		Message ref4=new Message(5,true);
		ref4.display();
		

	}

}
