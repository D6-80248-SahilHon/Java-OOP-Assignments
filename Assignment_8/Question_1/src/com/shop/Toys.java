package com.shop;

import java.util.Scanner;

public class Toys extends Products {
	private String ageGroup;

	public Toys() {
		super();
		this.ageGroup = "";
		// TODO Auto-generated constructor stub
	}

	public Toys(String title, double price, String ageGroup) {
		super(title, price);
		// TODO Auto-generated constructor stub
		this.ageGroup = ageGroup;
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("Enter the Age group:");
		this.ageGroup = new Scanner(System.in).next();
	}

	@Override
	public String toString() {
		return "Toys [ageGroup=" + ageGroup + ", toString()=" + super.toString() + "]";
	}

	public void setTotalBill() {
		totalBill=totalBill+this.price*0.05;
		
	}
	
	
	@Override
	public void setTotalCollections() {
		// TODO Auto-generated method stub
		totalCollection = totalCollection + this.price;	
	}

}
