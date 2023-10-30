/*6. Declare an enum for Gender (MALE, FEMALE). Create a class Person with ﬁelds name, age and gender. In main(), create a array of Person. Write a menu
driven program (using enum), to add new person, display all people, ﬁnd a person by name.*/



package com.practice;

import java.util.Scanner;

public class People {
	private String name;
	private int age;
	private String gender;
	
	public People() {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.age = 0;
		this.gender = "";
	}
	public People(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void accept() {
		System.out.println("Enter the name:");
		this.name=new Scanner (System.in).next();
		System.out.println("Enter the age:");
		this.age=new Scanner (System.in).nextInt();
		System.out.println("Enter the gender:");
		this.gender=new Scanner (System.in).next();
	}
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
}
