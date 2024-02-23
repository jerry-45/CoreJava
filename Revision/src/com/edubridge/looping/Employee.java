package com.edubridge.looping;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Management System.");
		
		int choice = 0;
		
		do {
			System.out.println("1. Employee Has to Enter Name");
			System.out.println("2. Employee Has to Enter Desgination");
			System.out.println("3. Employee Has to Enter Specialization");
			System.out.println("4. Exit");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Employee Name: " + name);
				break;
				
			case 2:
				System.out.println("Enter Designation:");
				String desgination = sc.next();
				System.out.println("Employee Designation: " + desgination);
				break;
				
			case 3:
				System.out.println("Enter Specialization:");
				String specialization = sc.next();
				System.out.println("Employee Specialization: " + specialization);
				break;
				
			case 4:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong Input!");
				break;
			}
		}
		while(choice != 4);
	}
}