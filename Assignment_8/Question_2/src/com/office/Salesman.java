package com.office;

import java.util.Scanner;

public class Salesman extends Employee {
	private double target;
	private double commission;
	public Salesman() {
		super();
		this.target=0;
		this.commission=0;// TODO Auto-generated constructor stub
	}
	public Salesman(String name, int age, int id, double salary,double target,double commission) {
		super(name, age, id, salary);
		this.commission=commission;
		this.target=target;// TODO Auto-generated constructor stub
	}@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("Enter the target :");
		this.target=new Scanner(System.in).nextDouble();
		System.out.println("Enter the Commission :");
		this.commission=new Scanner(System.in).nextDouble();
	}
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return getSalary()+this.commission;
	}
	
	
	
}
