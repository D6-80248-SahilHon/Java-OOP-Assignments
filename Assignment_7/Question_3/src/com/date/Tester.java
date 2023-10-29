package com.date;

public class Tester {

	public static void main(String[] args) {
		Date d1 = new Date(12, 8, 2000);
		Date d2;
		try {
			d2 = (Date)d1.clone();
			System.out.println(d2.toString());
			d2.setDay(11);
			d2.setMonth(01);
			d2.setYear(2000);
			System.out.println(d2.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
