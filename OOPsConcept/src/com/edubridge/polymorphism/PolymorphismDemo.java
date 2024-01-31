package com.edubridge.polymorphism;

class Calculation{
	void add(String a, String b) {
		System.out.println("Addition is " + (a+b));
	}
	
	void add(int a, int b) {
		System.out.println("Addition is " + (a+b));
	}
	
	void add(int a, int b, int c) {
		System.out.println("Addition is " + (a+b));
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation c = new Calculation();
		
		c.add("Hello", "World");
		c.add(10, 50);
		c.add(5, 6, 7);
	}

}
