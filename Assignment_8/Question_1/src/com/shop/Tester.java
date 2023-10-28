package com.shop;

import java.util.Scanner;

public class Tester {
	public static int menu() {
		System.out.println("Enter the choice:");
		System.out.println("0.Exit");
		System.out.println("1.ADD BOOK");
		System.out.println("2.ADD ALBUM");
		System.out.println("3.ADD TOYS");
		System.out.println("4.DISPLAY TOTAL BILL");
		System.out.println("5.DISPLAY TOTAL REVENUE GENERATED");

		return new Scanner(System.in).nextInt();

	}

	public static void main(String args[]) {
		int choice;
		int size = 5;
		Products p[] = new Products[size];
		int index = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 0:

				break;
			case 1:
				if (index < size) {
					p[index] = new Books();
					p[index].accept();
					p[index].setTotalBill();
					index++;
				} else {
					System.out.println("Cart is full...Please Check Out!!");
				}
				break;
			case 2:
				if (index < size) {
					p[index] = new Album();
					p[index].accept();
					p[index].setTotalBill();
					index++;
				} else {
					System.out.println("Cart is full...Please Check Out!!");
				}

				break;
			case 3:
				if (index < size) {
					p[index] = new Toys();
					p[index].accept();
					p[index].setTotalBill();
					index++;
				} else {
					System.out.println("Cart is full...Please Check Out!!");
				}

				break;
			case 4:
				System.out.println(Products.getTotalBill());
				break;
			case 5:
				System.out.println(Products.getTotalCollection());
				break;
			default:
				break;
			}
		}

	}
}
