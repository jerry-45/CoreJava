package com.edubridge.structural.facadedesignpattern;

public class McDonals implements Franchise {

	@Override
	public void Option() {
		System.out.println("McDonals");
		
	}

	@Override
	public void Cost() {
		System.out.println("₹1,00,000");
		
	}

}
