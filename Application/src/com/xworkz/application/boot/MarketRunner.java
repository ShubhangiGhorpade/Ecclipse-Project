package com.xworkz.application.boot;

import com.xworkz.application.dto.MarketDTO;

public class MarketRunner {

	public static void main(String[] args) {
		MarketDTO market = new MarketDTO();
		market.setArea("Street Market");
		market.setLocation("Kalayan");
		market.setMarketName("Fish Market");
		market.setNearBy(true);
		market.setQuality(true);
		System.out.println(market);
		System.out.println(market.hashCode());
		System.out.println(market.equals(market));

	}

}
