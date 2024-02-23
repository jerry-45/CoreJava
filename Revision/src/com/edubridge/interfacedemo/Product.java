package com.edubridge.interfacedemo;

import java.util.ArrayList;
import java.util.Collections;

public class Product implements Comparable<Product> {

	private String pname;
	private int price;
	private int rating;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Product(String pname, int price, int rating) {
		super();
		this.pname = pname;
		this.price = price;
		this.rating = rating;
	}

	@Override
	public int compareTo(Product p) {
		return this.price - p.price;
	}
	
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("Speakers", 4000, 4));
		list.add(new Product("Monitor", 9000, 5));
		list.add(new Product("Mouse", 1500, 4));
		Collections.sort(list);
		
		for(Product p : list) {
			System.out.println("Product Name: " + p.getPname() + "\tProduct Price: " + p.getPrice() + "\tProduct Rating: " + p.getRating());
		}
	}

}
