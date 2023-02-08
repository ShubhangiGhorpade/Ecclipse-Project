package com.xworkz.association.thing;

public class Isro {
	public String[] locations;
	public int[] satelliteNos;
	public Scientist[] scientists;

	public void setLocation(String[] locations) {
		this.locations = locations;
	}

	public void setSatelliteNo(int[] satelliteNos) {
		this.satelliteNos = satelliteNos;
	}

	public void setScientist(Scientist[] scientists) {
		this.scientists = scientists;
	}

	public void show() {
		if (this.locations != null) {
			for (int seq = 0; seq < this.locations.length; seq++) {
				String element = this.locations[seq];
				System.out.println("Location: " + element + " at index: " + seq);
			}
		} else {
			System.err.println("this.location is null...");
		}
		if (this.satelliteNos != null) {
			for (int num = 0; num < this.satelliteNos.length; num++) {
				int element = this.satelliteNos[num];
				System.out.println("SatelliteNo: " + element + " at index: " + num);
			}
		} else {
			System.err.println("this.satelliteNo is null...");
		}
		if (this.scientists != null) {
			for (int num = 0; num < this.scientists.length; num++) {
				Scientist element = this.scientists[num];
				element.show();
			}
		} else {
			System.err.println("this.satelliteNo is null...");
		}
	}
}
