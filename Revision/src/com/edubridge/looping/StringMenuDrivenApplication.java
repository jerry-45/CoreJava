package com.edubridge.looping;

import java.util.Scanner;

public class StringMenuDrivenApplication {

	public static void main(String[] args) {
		System.out.println("String Menu Driven Application");
		System.out.println("------------------------------");
		
		int choice = 0;
		
		do {
			System.out.println("1. String Lenght");
			System.out.println("2. String Concatenation");
			System.out.println("3. compareTo()");
			System.out.println("4. Exit");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter String: ");
				String str = sc.next();
				
				System.out.println("Length of the entered string is " + str.length());
				break;
				
			case 2:
				System.out.println("Enter String 1: ");
				String str1 = sc.next();
				
				System.out.println("Enter String 2: ");
				String str2 = sc.next();
				
				System.out.println("Concatenated String is " + (str1 + str2));
				break;
				
			case 3:
				System.out.println("Enter String 1: ");
				String str3 = sc.next();
				
				System.out.println("Enter String 2: ");
				String str4 = sc.next();
				
				System.out.println("Comparing String 1 with String 2: " + str3.compareTo(str4));
				System.out.println("Comparing String 2 with String 1: " + str4.compareTo(str3));
				break;
				
			case 4:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong Input!!!");
			}
		}
		while(choice != 4);
	}
}