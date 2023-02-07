package com.xworkz.association.boot;

import com.xworkz.association.thing.Gift;
import com.xworkz.association.thing.Surprise;

public class GiftRunner {

	public static void main(String[] args) {
		Gift gift = new Gift();
		gift.init("Official", true);
		Surprise surprise = new Surprise();
		gift.init(surprise);
		gift.show();

	}

}
