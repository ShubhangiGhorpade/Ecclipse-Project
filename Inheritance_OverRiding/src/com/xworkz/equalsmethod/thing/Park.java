package com.xworkz.equalsmethod.thing;

//6
public class Park {
	private String name;
	private boolean good;
	private int time;
	private int closeTime;
	private boolean adventureGame;
	private boolean swimmingPool;

	public Park(String name, boolean good, int time, int closeTime, boolean adventureGame, boolean swimmingPool) {

		this.name = name;
		this.good = good;
		this.time = time;
		this.closeTime = closeTime;
		this.adventureGame = adventureGame;
		this.swimmingPool = swimmingPool;
	}

	@Override
	public String toString() {

		return "[Name: " + this.name + "][Good: " + this.good + "][Time: " + this.time + "][CloseTime: "
				+ this.closeTime + "][Adventure Game: " + this.adventureGame + "][Swimming pool: " + this.swimmingPool
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Park running equals Methods: " + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Park) {
				Park casted = (Park) obj;
				Park park = this;
				Park park1 = casted;

				if (park.name.equals(park1.name) && park.closeTime == (park1.closeTime)
						&& park.adventureGame == (park1.adventureGame) && park.good == (park1.good)
						&& park.swimmingPool == park1.swimmingPool) {
					return true;
				} else {
					System.out.println("park and park1 are not same");
				}
			} else {
				System.out.println("park1 is not park type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}
}
