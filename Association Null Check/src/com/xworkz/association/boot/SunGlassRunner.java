package com.xworkz.association.boot;

import com.xworkz.association.thing.Frame;
import com.xworkz.association.thing.SunGlass;

public class SunGlassRunner {

	public static void main(String[] args) {
		SunGlass sunglass = new SunGlass();
		sunglass.init("Voyage", 3000);
		Frame frame = new Frame();
		frame.init(150, true);
		sunglass.init(frame);
		sunglass.show();
	}

}
