package com.office;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	
	public Person() {
	this.age=0;
	this.name="";// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public void accept()
	{
		System.out.println("Enter the name :");
		this.name=new Scanner(System.in).next();
		System.out.println("Enter the age:");
		this.age=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
    
	
}
