package com.xworkz.stringobj.boot;

public class ReverseSpecificWordInSentence {

	public static void main(String[] args) {
		String sentence = "this is java class";
		String sb = (sentence.substring(8, 12));
		String rev = "";
		char ch[] = sb.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(sentence.substring(0, 8)+rev+" "+sentence.substring(13, 18));
	}
}
