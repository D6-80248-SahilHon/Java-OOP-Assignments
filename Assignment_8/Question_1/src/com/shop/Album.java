package com.shop;

import java.util.Scanner;

public class Album extends Products {
	private String musician;
	private String singer;

	public Album() {
		super();
		this.musician = " ";
		this.singer = " ";
	}

	public Album(String title, double price, String musician, String singer) {
		super(title, price);
		this.musician = musician;
		this.singer = singer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("Enter the musician name:");
		this.musician = new Scanner(System.in).next();
		System.out.println("Enter the Singer name:");
		this.singer = new Scanner(System.in).next();
	}

	@Override
	public String toString() {
		return "Album [musician=" + musician + ", singer=" + singer + ", toString()=" + super.toString() + "]";
	}

	public void setTotalBill() {
		totalBill=totalBill+this.price*0.10;
		
	}
	
	
	@Override
	public void setTotalCollections() {
		// TODO Auto-generated method stub
		totalCollection = totalCollection + this.price;	
	}
	

}
