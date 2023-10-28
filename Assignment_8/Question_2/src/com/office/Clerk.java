package com.office;

public class Clerk extends Employee {

	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return getSalary();
	}
}
