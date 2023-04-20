package com.xworkz.map.boot;

import java.util.HashMap;
import java.util.Map;

public class CompanyRunner {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Infosys");
		map.put(2, "Wipro");
		map.put(3, "Bristlecone");
		map.put(4, "TCS");
		map.put(5, "Amazon");
		map.put(6, "Goggle");
		map.put(7, "Apple");
		map.put(8, "Benze-Mercedes");
		map.put(9, "Microsoft");
		map.put(10, "Accenture");

		System.out.println(map);
		map.remove(4);
		System.out.println(map);
		map.remove(8, "Benze-Mercedes");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.clear();
		System.out.println(map);

	}

}
