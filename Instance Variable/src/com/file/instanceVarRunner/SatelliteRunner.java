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
		
		Satellite ref1=new Satellite();
		ref1.display();
		ref1.name="Kalpana";
		ref1.type="Expermintal";
		ref1.capacity=90;
		ref1.orbitName="METSAT-1";
		ref1.payLoadLevel=14;
		ref1.payLoadMat="graphite";
		ref1.satelliteMat="aluminium";
		ref1.location="Bangalore";
		ref1.manufacture="Silicon";
		ref1.destroy=20;
		ref1.lifeSpan=10;
		ref1.length=150;
		ref1.weight=55;
		ref1.gravity=98;
		ref1.launch="Wednesday";
		ref1.team="Domestic";
		ref1.land="Sand";
		ref1.presence=false;
		
		ref.display();
}

}

