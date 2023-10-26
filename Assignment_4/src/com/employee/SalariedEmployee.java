package com.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee
{
	private double weeklySalary;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter the weekly Salary:");
		this.weeklySalary=new Scanner(System.in).nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() +" SalariedEmployee [weeklySalary=" + weeklySalary + ", toString()=" + "]";
	}
	
	
	
}