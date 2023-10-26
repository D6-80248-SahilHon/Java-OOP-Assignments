package com.employee;

import java.util.Scanner;

public class CommissionEmployee extends Employee{
	private int  grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommissionEmployee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void accept()
	{	super.accept();
		System.out.println("Enter the gross sales:");
		this.grossSales=new Scanner(System.in).nextInt();
		System.out.println("Enter the commission rate:");
		this.commissionRate=new Scanner(System.in).nextDouble();
	}
	@Override
	public String toString() {
		return super.toString() + "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate 
				+ "]";
	}
	
}
