package com.app.fruits;

import java.util.Scanner;

public class Tester {
	public static int menu() {
		System.out.println("Enter the Choice");
		System.out.println("0.EXIT");
		System.out.println("1.ADD MANGO");
		System.out.println("2.ADD ORANGE");
		System.out.println("3.ADD APPLE");
		System.out.println("4.DISPLAY NAMES OF ALL FRUITS IN BASKET:");
		System.out.println("5.DISPLAY DETAILS OF ALL FRUITS IN BASKET:");
		System.out.println("6.MARK FRUIT AS STALE");
		System.out.println("7.DISPLAY TASTES OF ALL NON STALE FRUITS");
		return new Scanner(System.in).nextInt();

	}

	
	public static void main(String[] args) {
		int choice, index = 0;
		System.out.println("Enter the Basket size:");
		int size = new Scanner(System.in).nextInt();
		int fruit;

		Fruit basket[] = new Fruit[size];

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 0:
				break;
			case 1:
				if (index < size) {
					basket[index] = new Mango();
					basket[index].acceptData();
					index++;
				} else
					System.out.println("Basket is full");

				break;
			case 2:
				if (index < size) {
					basket[index] = new Orange();
					basket[index].acceptData();
					index++;
				} else
					System.out.println("Basket is full");

				break;
			case 3:
				if (index < size) {
					basket[index] = new Apple();
					basket[index].acceptData();
					index++;
				} else
					System.out.println("Basket is full");

				break;
			case 4:
				if (index > 0) {
					for (int i = 0; i < index; i++) {
						System.out.println(basket[i].getName());
					}
				} else {
					System.out.println("Empty Basket");
				}
				break;
			case 5:
				if (index > 0) {
					for (int i = 0; i < index; i++) {
						System.out.println(basket[i].toString());
					}
				} else {
					System.out.println("Empty Basket");
				}

				break;
			case 6:
				System.out.println("Provide the fruit number:");
				fruit = new Scanner(System.in).nextInt();
				basket[fruit].setFresh(false);

				break;
			case 7:
				if (index > 0) {
					for (int i = 0; i < index; i++) {
						if (!basket[i].getFresh()) {
							basket[i].taste();
						}
					}
				}
				else {
					System.out.println("Empty Basket");
				}

				break;

			default:
				break;
			}
		}

	}
    
}
