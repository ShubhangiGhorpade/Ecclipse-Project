package com.java.technical.main;

public class VowelCount {

	
	public static int count(String name) {
		int count=0;
		for(int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		/*String s = "  shubhangi";
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.println(count);
			}
		}*/
		System.out.println(VowelCount.count("shubhangi"));
		System.out.println(VowelCount.count("Akshata"));
		System.out.println(VowelCount.count("sahana"));
		
		
		
	}
}
