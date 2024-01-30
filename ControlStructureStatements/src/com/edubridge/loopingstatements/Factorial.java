package com.edubridge.loopingstatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = s.nextInt();
		int fact=1;
		
		for(int i = 1; i <= number; i++) {
			if(number == 0)
				System.out.println("The factorial " + number + " is " + 1);
			else
				fact = fact*i;
				
		}
		
		System.out.println("The factorial " + number + " is " + fact);
		
		s.close();

	}

}
