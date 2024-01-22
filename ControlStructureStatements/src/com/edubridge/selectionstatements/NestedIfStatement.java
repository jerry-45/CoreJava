package com.edubridge.selectionstatements;

import java.util.Scanner;

public class NestedIfStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a age of a person:");
		int age = s.nextInt();
		
		System.out.println("Enter a weight of a person: ");
		int weight = s.nextInt();
		
		if(age >= 12) {
			if((weight >= 45 && weight <= 110) || weight >= 110) {
				System.out.println("Eligible for Bunjee Jumping. If weight is greater then 110, extra ropes will be added.");
			}	
			else {
				System.out.println("Not eligible for Bunjee Jumping.");
			}
		}
		else {
			System.out.println("Not eligible for Bunjee Jumping.");
		}
	}

}
