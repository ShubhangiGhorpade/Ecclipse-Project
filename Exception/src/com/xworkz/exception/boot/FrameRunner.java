package com.xworkz.exception.boot;

import com.xworkz.exception.thing.Frame;

public class FrameRunner {

	public static void main(String[] args) {
		Frame frame = new Frame();
		try {
			System.out.println("Running in try");
			frame.createFrame1();
		} catch (Exception e) {
			System.err.println("Catched the Exception");

		}
		System.out.println("Continuing the Execution");
	}

}
