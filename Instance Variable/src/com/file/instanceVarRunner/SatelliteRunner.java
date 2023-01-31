package com.file.instanceVarRunner;

import com.file.instanceVar.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite ref=new Satellite();
		ref.display();
		ref.name="Aryabhata";
		ref.type="Commerical";
		ref.capacity=120;
		ref.orbitName="Ploto";
		ref.payLoadLevel=15;
		ref.payLoadMat="graphite";
		ref.satelliteMat="aluminium";
		ref.location="Mysore";
		ref.manufacture="Aluminium";
		ref.destroy=25;
		ref.lifeSpan=15;
		ref.length=15;
		ref.weight=150;
		ref.gravity=98;
		ref.launch="Thrusday";
		ref.team="Domestic";
		ref.land="Sand";
		ref.presence=true;
		
		ref.display();
}

}

