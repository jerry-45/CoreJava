package com.edubridge.typecasting;

public class ImplicitAndExplicitTypeCasting {

	public static void main(String[] args) {
		// Implicit Typecasting or Widening
		char c = 'b';
		int num = c;
		System.out.println(num);
		
		// Explicit Typecasting or Narrowing
		int num1 = 63;
		char x = (char) num1;
		System.out.println(x);
	}
}