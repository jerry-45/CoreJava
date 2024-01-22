package com.edubridge.selectionstatements;

import java.util.Scanner;

public class CascadedIfElseStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value for a: ");
		int a = s.nextInt();
		
		System.out.println("Enter a value for b: ");
		int b = s.nextInt();
		
		System.out.println("Enter a value for c: ");
		int c = s.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is heavier");
		}
		else if(b>a && b>c) {
			System.out.println("b is heavier");
		}
		else{
			System.out.println("c is heavier");
		}
	}
}
