package shape;

public abstract class  Polygon extends BoundedShape{

	private int sides;

	public Polygon() {
		super();
		this.sides=0;
	}

	public Polygon(int x, int y,int sides) {
		super(x, y);
		this.sides=sides;
		// TODO Auto-generated constructor stub
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	

}
