package shape;

import java.util.Scanner;

public class Square extends Polygon {
	private int side;
	
	public Square() {super();
	this.side=0;
	}

	public Square(int x, int y, int sides,int side) {
		super(x, y, sides);
		this.side=side;
	}

	@Override
	public double calcArea() {
		
		return side*side;
	}
	public void accept()
	{
		System.out.println("Enter the side length:");
		this.side=new Scanner(System.in).nextInt();
		
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", calcArea()=" + calcArea() + "]";
	}
	
	
}
