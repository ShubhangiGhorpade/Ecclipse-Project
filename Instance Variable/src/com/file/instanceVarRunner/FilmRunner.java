package com.file.instanceVarRunner;

import com.file.instanceVar.Film;

public class FilmRunner {

	public static void main(String[] args) {
		Film ref=new Film();
		System.out.println("Before Instantiation ");
		System.out.println("Film Name :"+ref.filmName);
		System.out.println("Hero :"+ref.hero);
		System.out.println("Heroin :"+ref.heroin);
		System.out.println("Song :"+ref.song);
		System.out.println("Cost :"+ref.cost);
		
		ref.filmName="Brahmastra";
		ref.hero="Ranbir";
		ref.heroin="Alia";
		ref.song="Kesariya";
		ref.cost=150000000f;
	
		System.out.println("After Instantiation ");
		System.out.println("Film Name :"+ref.filmName);
		System.out.println("Hero :"+ref.hero);
		System.out.println("Heroin :"+ref.heroin);
		System.out.println("Song :"+ref.song);
		System.out.println("Cost :"+ref.cost);
		
		Film ref1=new Film();
		ref1.filmName="Yeh jawani hai diwani";
		ref1.hero="Ranbir";
		ref1.heroin="Deepika";
		ref1.song="Kabira";
		ref1.cost=200000000f;
		
		
		System.out.println("Film Name :"+ref.filmName);
		System.out.println("Hero :"+ref.hero);
		System.out.println("Heroin :"+ref.heroin);
		System.out.println("Song :"+ref.song);
		System.out.println("Cost :"+ref.cost);
		
	}

}
