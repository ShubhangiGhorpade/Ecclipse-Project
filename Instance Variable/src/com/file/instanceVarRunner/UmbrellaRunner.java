package com.file.instanceVarRunner;

import com.file.instanceVar.Umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {
		Umbrella umbrella=new Umbrella(200, true,
				"Black", "", 15, 10, 10, "During rainy season", 
				"Fendo",true);
        umbrella.show();
	}

}
