package com.xworkz.collection.lambdaExp.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		Collection<String> parties = new ArrayList<>();
		parties.add("Bjp");
		parties.add("congress");
		parties.add("jds");

		parties.stream().map(party -> party.toUpperCase()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		List<String> collect = parties.stream().map(party -> party.toUpperCase()).collect(Collectors.toList());
		collect.forEach(ref -> System.out.println(ref));

		Collection<String> parties1 = new ArrayList<>();
		for (String string : parties) {
			System.out.println(string.toUpperCase());
			parties1.add(string.toUpperCase());
		}
		System.out.println(parties1);
		parties1.forEach(ref1 -> System.out.println(ref1));
	}

}
