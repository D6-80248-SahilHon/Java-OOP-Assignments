package com.app.fruits;

public class Apple extends Fruit{

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, double weight, String name,boolean isFresh) {
		super(color, weight, name,isFresh);
		// TODO Auto-generated constructor stub
	}
    public void taste() {
	
    	System.out.println("Sweet and Sour");
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
	

}
