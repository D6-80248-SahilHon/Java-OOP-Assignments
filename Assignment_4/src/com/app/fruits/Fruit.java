package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit() {
		this("", 0, "", true);
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;

	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color of fruit:");
		this.color = sc.next();
		System.out.println("Enter the weight of fruit:");
		this.weight = sc.nextDouble();
		System.out.println("Enter the name of fruit:");
		this.name = sc.next();

	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + " ]";
	}

	public void taste() {
		System.out.println("No specific Taste");

	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public boolean getFresh() {

		return this.isFresh;
	}

	public String getName() {
		return name;
	}

}
