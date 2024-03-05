package com.edubridge.structural.facadedesignpattern;

public class KFC implements Franchise {

	@Override
	public void Option() {
		System.out.println("KFC");
		
	}

	@Override
	public void Cost() {
		System.out.println("₹80,000");
		
	}

}
