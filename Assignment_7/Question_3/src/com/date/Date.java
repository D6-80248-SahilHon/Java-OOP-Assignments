package com.date;

import java.util.Scanner;

public class Date implements Cloneable{
	private int day;
    private int month;
	private int year;
	public Date() {
		this(0,0,0);
		// TODO Auto-generated constructor stub
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void accept()
	{
		System.out.println("Enter the day:");
		this.day=new Scanner(System.in).nextInt();
		System.out.println("Enter the month:");
		this.month=new Scanner(System.in).nextInt();
		System.out.println("Enter the year:");
		this.year=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
