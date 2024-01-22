package com.edubridge.selectionstatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a map number to start playing Valorant:/n1. Bind/n2. Lotus/n3. Ascent/n4. Haven");
		System.out.println("1. Bind");
		System.out.println("2. Lotus");
		System.out.println("3. Ascent");
		System.out.println("4. Haven");
		System.out.println("5. Icebox");
		int map_no = s.nextInt();
		
		switch(map_no) {
		case 1:
			System.out.println("Welcome to Bind.");
			break;
			
		case 2:
			System.out.println("Welcome to Lotus.");
			break;
			
		case 3:
			System.out.println("Welcome to Ascent.");
			break;
			
		case 4:
			System.out.println("Welcome to Haven.");
			break;
			
		case 5:
			System.out.println("Welcome to Icebox.");
			break;
			
		default: 
			System.out.println("Invalid map no.");
		}

	}

}
