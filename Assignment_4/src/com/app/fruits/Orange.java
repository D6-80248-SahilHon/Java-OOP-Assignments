package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String color, double weight, String name,boolean isFresh) {
		super(color, weight, name,isFresh);
		// TODO Auto-generated constructor stub
	}
    public void taste() {
		// TODO Auto-generated method stub
    	System.out.println("Sour");
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
