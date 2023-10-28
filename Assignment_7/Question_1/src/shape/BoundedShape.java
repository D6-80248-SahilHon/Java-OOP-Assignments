
package shape;

public abstract class BoundedShape {
	private int x;
	private int y;

	public BoundedShape() {

		this(0, 0);
	}

	public BoundedShape(int x, int y) {

		this.x = x;
		this.y = y;
	}
	
	public abstract double calcArea();
	public abstract void accept();
	

}
