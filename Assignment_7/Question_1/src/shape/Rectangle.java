package shape;

import java.util.Scanner;

public class Rectangle extends Polygon {
	private int length;
	private int breadth;
	public Rectangle() {
		super();
		this.length=0;
		this.breadth=0;
	}
	public Rectangle(int x, int y, int sides,int length,int breadth) {
		super(x, y, sides);
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return this.length*this.breadth;
	}
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		System.out.println("Enter the length and breadth:");
		this.length=new Scanner(System.in).nextInt();
		this.breadth=new Scanner(System.in).nextInt();

	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", calcArea()=" + calcArea() + "]";
	}
	
}
