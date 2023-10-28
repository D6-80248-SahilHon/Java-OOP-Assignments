package com.shop;

import java.util.Scanner;

public class Books extends Products {
	private  int isbnNO;
	private String author;
	private String subject;
	
	
	
	public Books() {
		super();
		this.author="";
		this.isbnNO=0;
		this.subject="";
	}

	public Books(String title, double price,String author,int isbnNO,String subject) {
		super(title, price);
		this.author=author;
		this.isbnNO=isbnNO;
		this.subject=subject;
				
	}
	public void  accept()
	{
		super.accept();
		System.out.println("Enter the author name:");
		this.author=new Scanner(System.in).next();
		System.out.println("Enter the subject:");
		this.subject=new Scanner(System.in).next();
		System.out.println("Enter the isbn no:");
		this.isbnNO=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "Books [isbnNO=" + isbnNO + ", author=" + author + ", subject=" + subject + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public void setTotalBill() {
		totalBill=totalBill+this.price;
		
	}
	
	
	@Override
	public void setTotalCollections() {
		// TODO Auto-generated method stub
		totalCollection = totalCollection + this.price;	
	}
	
	
	
}
