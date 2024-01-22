package com.edubridge.assignments;

import java.util.Scanner;

public class FloatInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a float value: ");
		float testFloat = s.nextFloat();
		
		System.out.printf("%.2f\n", testFloat);
	}

}
