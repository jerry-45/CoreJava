package com.edubridge.creational.factorydesignpattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SelectNetworkPlan snp = new SelectNetworkPlan();
		
		System.out.println("Enter the network for which you want to generate bill:");
		Scanner sc = new Scanner(System.in);
		String networkName = sc.next();
		
		System.out.println("Enter the number of minutes:");
		int min = sc.nextInt();
		
		CellularPlan cp = snp.getPlan(networkName);
		
		System.out.println("Bill amount for " + networkName + " of " + min);
		
		cp.getRate();
		
		cp.processBill(min);
	}
}