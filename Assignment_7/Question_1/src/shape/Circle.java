
package shape;

import java.util.Scanner;

public class Circle extends BoundedShape  {
	private int radius;
	
	
	public Circle() {
		super();
		this.radius=0;
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y,int radius) {
		super(x, y);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcArea() {
		
		return 3.14*this.radius*this.radius;
	}
	public void accept()
	{
		System.out.println("Enter the radius:");
		this.radius=new Scanner(System.in).nextInt();
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", calcArea()=" + calcArea() + "]";
	}

}
