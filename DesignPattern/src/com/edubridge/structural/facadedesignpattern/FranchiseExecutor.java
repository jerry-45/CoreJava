package com.edubridge.structural.facadedesignpattern;

import java.util.Scanner;

public class FranchiseExecutor {

	public static void main(String[] args) {
		System.out.println("Welcome to Registration Service");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("1. KFC");
			System.out.println("2. Dominos");
			System.out.println("3. McDonals");
			System.out.println("4. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			FranchiseRegistration fr = new FranchiseRegistration();
			
			switch(choice) {
			case 1:
				fr.BuyKFC();
				break;
			case 2:
				fr.BuyDominos();
				break;
			case 3:
				fr.BuyMcDonals();
				break;
			case 4:
				System.out.println("Exitting");
				break;
			default:
				System.out.println("Invalid choice");	
			}
		}while(choice != 4);
	}
}