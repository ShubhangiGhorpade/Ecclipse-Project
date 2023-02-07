package com.xworkz.association.boot;

import com.xworkz.association.thing.Sun;
import com.xworkz.association.thing.SunRise;

public class SunRiseRunner {

	public static void main(String[] args) {
		SunRise sun1 = new SunRise();
		sun1.init(true, 5);
		Sun sun = new Sun();
		sun.init(true, false);
		sun1.init(sun);
		sun1.show();

	}

}
