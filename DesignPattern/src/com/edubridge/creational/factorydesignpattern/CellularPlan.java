package com.edubridge.creational.factorydesignpattern;

abstract public class CellularPlan {
	double rate;
	
	abstract void getRate();
	
	public void processBill(int min) {
		System.out.println(min*rate);
	}
}