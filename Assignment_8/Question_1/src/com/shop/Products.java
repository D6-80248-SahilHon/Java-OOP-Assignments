package com.shop;

import java.util.Scanner;

public abstract  class Products {
	private String title;
	protected double price;
	static double totalCollection = 0;
	static double totalBill=0;

	public Products() {
		this(" ", 0);
	}

	public Products(String title, double price) {

		this.title = title;
		this.price = price;
	}

	public void accept() {
		System.out.println("Enter the title:");
		this.title = new Scanner(System.in).next();
		System.out.println("Enter the price:");
		this.price = new Scanner(System.in).nextDouble();
	}

	@Override
	public String toString() {
		return "Products [title=" + title + ", price=" + price + "]";
	}
	public static double getTotalBill() {
		return totalBill;
	}
	public static double getTotalCollection() {
		return totalCollection;
	}
	public abstract void setTotalBill() ;
	public abstract void setTotalCollections() ;
}
