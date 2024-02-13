package com.edubridge.equalsmethod;

public class SiteExecutor {

	public static void main(String[] args) {
		String str1 = "Creativity";
		String str2 = "Creativity";
		System.out.println(str1.equals(str2));
		
		String str3 = new String("Creativity");
		String str4 = new String("Creativity");
		System.out.println(str3.equals(str4));
		
		Site s1 = new Site("Creativity", 1);
		Site s2 = new Site("Creativity", 1);
		System.out.println(s1.equals(s2));
	}
}