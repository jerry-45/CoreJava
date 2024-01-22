package com.edubridge.assignments;

import java.util.Scanner;

public class UnicodeValue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char inputChar = s.next().charAt(0);
		
		int unicodeValue = (int)inputChar;
		
		System.out.println(unicodeValue);
	}

}
