package shape;

import java.util.Scanner;

public class Triangle extends Polygon {
	private int side1;
	private int side2;
	private int side3;

	public Triangle() {
		super();
		this.side1=0;
		this.side2=0;
		this.side3=0;
		// TODO Auto-generated constructor stub
	}

	public Triangle(int x, int y, int sides,int side1,int side2,int side3) {
		super(x, y, sides);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcArea() {
		double s=(side1+side2+side3)/3;
		
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	@Override
	public void accept() {
		System.out.println("Enter the three sides of triangle one by one:");
		this.side1=new Scanner(System.in).nextInt();
		this.side2=new Scanner(System.in).nextInt();
		this.side3=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", calcArea()=" + calcArea()
				+ "]";
	}
	
}
