package com.edubridge.structural.facadedesignpattern;

public class FranchiseRegistration {
	Franchise KFC;
	Franchise McDonals;
	Franchise Dominos;
	
	public FranchiseRegistration() {
		KFC = new KFC();
		McDonals = new McDonals();
		Dominos = new Dominos();
	}
	
	public void BuyKFC() {
		KFC.Option();
		KFC.Cost();
	}
	
	public void BuyMcDonals() {
		McDonals.Option();
		McDonals.Cost();
	}
	
	public void BuyDominos() {
		Dominos.Option();
		Dominos.Cost();
	}
}