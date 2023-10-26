package com.employee;

import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	int SSN;
	
	public Employee() {
	this("","",0);
	}

	public Employee(String firstName, String lastName, int sSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name :");
		this.firstName=sc.next();
		System.out.println("Enter the second name:");
		this.lastName=sc.next();
		System.out.println("Enter the social security number");
		this.SSN=sc.nextInt();
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	
}
	