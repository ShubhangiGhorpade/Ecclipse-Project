package com.xworkz.usingBean.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfiguration {

	@Bean
	public List<String> names() {
		System.out.println(
				"Running names with ArrayList impl in CollectionConfiguration");
		List<String> list = new ArrayList<>();
		list.add("Shubhangi");
		list.add("Anita");
		list.add("Akshata");
		list.add("Sahana");
		list.add("Sneha");

		return list;
	}

	@Bean
	public List<Integer> versions() {
		System.out.println(
				"Running versions with LinkedList impl in CollectionConfiguration");
		List<Integer> values = new LinkedList<>();
		values.add(21);
		values.add(05);
		values.add(15);
		values.add(100);
		values.add(12);
		values.add(31);

		return values;
	}

	@Bean
	public Set<String> trainers() {
		System.out.println(
				"Running trainers with HashSet impl in CollectionConfiguration");
		Set<String> set = new HashSet<>();
		set.add("Omkar");
		set.add("Shanthanu");
		set.add("Lokesh");
		set.add("Sunil");
		set.add("Shaanu");
		return set;
	}

	@Bean
	public Set<Long> phoneNos() {
		System.out.println(
				"Running phoneNos with LinkedHashSet impl in CollectionConfiguration");
		Set<Long> numbers = new LinkedHashSet<>();
		numbers.add(7204223793L);
		numbers.add(9620809927L);
		numbers.add(96208089928L);
		numbers.add(7847875728L);
		numbers.add(7204223747L);
		return numbers;
	}

	@Bean
	public Set<Integer> values() {
		System.out.println(
				"Running phoneNos with TreeSet impl in CollectionConfiguration");
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(67);
		numbers.add(189);
		numbers.add(26);
		numbers.add(78);
		numbers.add(123);
		numbers.add(56);
		return numbers;
	}

	@Bean
	public Map<Integer,String> serial(){
		System.out.println("Running seial in map");
		
		Map<Integer,String> names=new HashMap<>();
		names.put(1, "Shubhangi");
		names.put(2, "Akshata");
		return names;
		
		
	}
}
