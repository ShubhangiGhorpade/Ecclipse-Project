package com.xworkz.finalword.boot;

import com.xworkz.finalword.thing.Music;

public class MusicRunner {

	public static void main(String[] args) {
		Music music=new Music("khuda jaane","Romantic");
		System.out.println(music);
		music.lyrics();

	}

}
