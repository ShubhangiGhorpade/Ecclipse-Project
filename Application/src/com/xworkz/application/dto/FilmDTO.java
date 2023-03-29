package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class FilmDTO implements Serializable {

	private String name;
	private String producer;
	private String hero;
	private String heroine;

	public FilmDTO() {
		System.out.println("NO Arg const in filmDTO");
	}

	public FilmDTO(String name, String producer, String hero, String heroine) {
		super();
		this.name = name;
		this.producer = producer;
		this.hero = hero;
		this.heroine = heroine;
	}

	@Override
	public String toString() {
		return "FilmDTO [name=" + name + ", producer=" + producer + ", hero=" + hero + ", heroine=" + heroine + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hero, heroine, name, producer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof FilmDTO)) {
			return false;
		}
		FilmDTO other = (FilmDTO) obj;
		return Objects.equals(hero, other.hero) && Objects.equals(heroine, other.heroine)
				&& Objects.equals(name, other.name) && Objects.equals(producer, other.producer);
	}

	public String getName() {
		return name;
	}

	public String getProducer() {
		return producer;
	}

	public String getHero() {
		return hero;
	}

	public String getHeroine() {
		return heroine;
	}

}
