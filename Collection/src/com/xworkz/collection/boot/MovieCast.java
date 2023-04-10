package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MovieCast {

	public static void main(String[] args) {
		Collection<String> casts = new ArrayList<>();
		casts.add("Producer");
		casts.add("Hero");
		casts.add("Heroine");
		casts.add("Director");
		casts.add("Lightman");
		casts.add("SpotMan");
		casts.add("Choreographer");
		casts.add("MusicDirector");
		casts.add("Chrew-Members");
		casts.add("Villian");
		casts.add(null);
		casts.add(null);

		for (String cast : casts) {
			if (cast != null) {
				System.out.println(cast);
			}
		}

		System.out.println("Total:" + casts.size());

		Iterator<String> movieCast = casts.iterator();
		while (movieCast.hasNext()) {
			String movieCast1 = movieCast.next();
			if (Objects.isNull(movieCast1)) {
				movieCast.remove();
			}
		}
		System.out.println(casts);
		System.out.println(casts.size());
	}

}
