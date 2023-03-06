package com.xworkz.stringobj.boot;

public class WordCountReverseWord {

	public static void main(String[] args) {
		String caption = "Be Yourself";
		String[] sp = caption.split(" ");
		int worldCount = 0;
		boolean occur = false;
		String rev = "";
		for (String s : sp) {
			occur = s.contains("Be");
			if (occur == true) {
				worldCount++;
				char ch[] = s.toCharArray();
				for (int i = ch.length - 1; i >= 0; i--) {
					rev = rev + ch[i];
				}
				System.out.println(rev);
				System.out.println(worldCount);
			}

		}

	}

}
