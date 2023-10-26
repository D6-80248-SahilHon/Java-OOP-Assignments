package com.employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private float hoursWorked;

	

	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hourly wage:");
		this.hourlyWage = sc.nextDouble();
		System.out.println("Enter the number of hours worked:");
		this.hoursWorked = sc.nextFloat();

	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [hourlyWage=" + hourlyWage + ", hoursWorked=" + hoursWorked
				+ ", toString()=";
	}

}
