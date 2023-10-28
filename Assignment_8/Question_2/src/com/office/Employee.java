package com.office;

import java.util.Scanner;

public abstract class Employee extends Person {
	private int id;
	private double salary;

	public Employee() {
		super();
		this.id = 0;
		this.salary = 0;
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the id:");
		this.id=new Scanner(System.in).nextInt();
		System.out.println("Enter the Salary:");
		this.salary=new Scanner(System.in).nextDouble();

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	public abstract double calcSalary();

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	

}
