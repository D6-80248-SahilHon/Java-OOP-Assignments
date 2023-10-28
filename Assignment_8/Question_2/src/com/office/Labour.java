package com.office;

public class Labour extends Employee{
	private float rate;
	private float hours;
	public Labour() {
		super();
		this.hours=0;
		this.rate=0;
		// TODO Auto-generated constructor stub
	}
	public Labour(String name, int age, int id, double salary,float rate,float hours) {
		super(name, age, id, salary);
		this.hours=hours;
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("Enter the number of hours worked:");
		this.hours=hours;
		System.out.println("Enter the hourly rate:");
		this.rate=rate;
	}
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return this.hours*this.rate;
	}
	@Override
	public String toString() {
		return "Labour [rate=" + rate + ", hours=" + hours + ", toString()=" + super.toString() + ", calcSalary()="
				+ calcSalary() + "]";
	}
	 
	
	
}
