/*Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
from user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
position)
If they are not located at the same position , display distance between p1 & p2 */



package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		
		this(0,0);
	}
	
	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	String getDetails()
	{
		Integer x1=x;
		Integer y1=y;
		String p1=x1.toString();
		String p2=y1.toString();
		
		return ("("+p1+","+p2+")");
	}
	
	void accept()
	{
		System.out.println("Enter the x and y coordinates:");
		Scanner sc=new Scanner(System.in);
		this.x=sc.nextInt();
		this.y=sc.nextInt();
	}
	boolean isEqual()
	{
		if(this.x==this.y) return true;
		else return false;
	}
	
	double calculateDistance(Point2D p2)
	{
		double result=Math.pow((this.x-p2.x),2)+Math.pow((this.y-p2.y),2);
		
		return Math.sqrt(result);
			
	}
	
	void displayDistance(Point2D p2)
	{
		System.out.println(calculateDistance(p2));
	}
	
	
	

}
