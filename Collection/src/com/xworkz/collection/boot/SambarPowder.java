package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SambarPowder {

	public static void main(String[] args) {
		Collection<String> sambar = new ArrayList<>();
		sambar.add("Masala");
		sambar.add("cost");
		sambar.add("Mirchi");
		sambar.add("Content");
		sambar.add("name");
		sambar.add("tag");
		sambar.add(null);
		sambar.add("type");
		sambar.add("turmeric");
		sambar.add("ChatMasala");
		sambar.add(null);
		sambar.add(null);
		sambar.add(null);

		System.out.println("Total:" + sambar.size());

		for (String powder : sambar) {
			if (powder != null) {
				System.out.println(powder);
			}
		}
		Iterator<String> powder = sambar.iterator();
		while (powder.hasNext()) {
			String powder1 = powder.next();
			if (Objects.isNull(powder1)) {
				powder.remove();
			}
		}
		System.out.println(sambar);
		System.out.println(sambar.size());
	}

}
