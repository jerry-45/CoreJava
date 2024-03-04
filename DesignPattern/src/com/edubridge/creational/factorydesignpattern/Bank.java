package com.edubridge.creational.factorydesignpattern;

class BOI implements Plan{
	@Override
	public void getRoi(double rate) {
		System.out.println("The Rate of Interest or BOI is " + rate);
	}
}

class SBI implements Plan{
	@Override
	public void getRoi(double rate) {
		System.out.println("The Rate of Interest or SBI is " + rate);
	}
}

class BOB implements Plan{
	@Override
	public void getRoi(double rate) {
		System.out.println("The Rate of Interest or BOB is " + rate);
	}
}

public class Bank {

	public static void main(String[] args) {
		BOI boi = new BOI();
		boi.getRoi(8.2);
		
		SBI sbi = new SBI();
		sbi.getRoi(9.0);
		
		BOB bob = new BOB();
		bob.getRoi(7.9);
	}
}