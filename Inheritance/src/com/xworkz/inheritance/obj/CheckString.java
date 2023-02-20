package com.xworkz.inheritance.obj;

public class CheckString {
	public static final String USER_LEVEL="ADMIN";
	public static void main(String[] args) {
		String userLevel=getUserLevel();
		checkforNullMethodB(userLevel);
			checkforNullMethodC(userLevel)	;
			checkforNullMethodA(userLevel);
		
	}
	private static String getUserLevel() {return null;}
	private static void checkforNullMethodA(String level) {
		try {
			if(level !=null && level.equals(USER_LEVEL)) {
				System.out.println("--USER LEVEL --ADMIN");
			}
		}
		catch(NullPointerException NullException) {
			System.out.println("NullExceptionA");
		}
		
	}
	private static void checkforNullMethodB(String level) {
		try {
			if(USER_LEVEL.contentEquals(level)) {
				System.out.println("--USER LEVEL --ADMIN");
			}
		}
		catch(NullPointerException NullException) {
			System.out.println("NullExceptionB");
		}}
	private static void checkforNullMethodC(String level) {
		try {
			if(String.valueOf(level).equals(USER_LEVEL)) {
				System.out.println("--USER LEVEL --ADMIN");
			}
		}
		catch(NullPointerException NullException) {
			System.out.println("NullExceptionC");
		}
		
	}
		

}
